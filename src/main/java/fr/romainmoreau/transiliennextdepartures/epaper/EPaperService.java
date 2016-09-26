package fr.romainmoreau.transiliennextdepartures.epaper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.romainmoreau.epaper.client.api.DrawingColors;
import fr.romainmoreau.epaper.client.api.EPaperClient;
import fr.romainmoreau.epaper.client.api.EPaperException;
import fr.romainmoreau.epaper.client.api.FontSize;
import fr.romainmoreau.epaper.client.api.HorizontalAlignment;
import fr.romainmoreau.epaper.client.api.VerticalAlignment;
import fr.romainmoreau.transiliennextdepartures.transilien.Passages;
import fr.romainmoreau.transiliennextdepartures.transilien.Station;
import fr.romainmoreau.transiliennextdepartures.transilien.Train;

@Service
public class EPaperService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EPaperService.class);

	private int maxItemsByColumn;

	private int columnWidth;

	@Autowired
	private EPaperClient ePaperClient;

	@Autowired
	private EPaperProperties ePaperProperties;

	@PostConstruct
	private void postConstruct() {
		maxItemsByColumn = EPaperClient.HEIGHT / ePaperProperties.getItemHeight();
		columnWidth = EPaperClient.WIDTH / ePaperProperties.getColumns();
	}

	public void update(LocalDateTime receivedLocalDateTime, Passages passages) {
		try {
			ePaperClient.clear();
			int maxTrains = maxItemsByColumn * ePaperProperties.getColumns();
			if (ePaperProperties.isShowUpdateTime()) {
				maxTrains--;
			}
			List<Train> trainList = passages.getTrain().subList(0, Math.min(passages.getTrain().size(), maxTrains));
			for (int i = 0; i < ePaperProperties.getColumns(); i++) {
				for (int j = 0; j < maxItemsByColumn; j++) {
					ePaperClient.setDrawingColors(new DrawingColors(ePaperProperties.getBackgroundColor(),
							ePaperProperties.getBackgroundColor()));
					ePaperClient.fillRectangle(i * columnWidth, j * ePaperProperties.getItemHeight(),
							(i + 1) * columnWidth - 1, (j + 1) * ePaperProperties.getItemHeight() - 1);
					ePaperClient.setDrawingColors(new DrawingColors(ePaperProperties.getBorderColor(),
							ePaperProperties.getBackgroundColor()));
					ePaperClient.drawRectangle(i * columnWidth, j * ePaperProperties.getItemHeight(),
							(i + 1) * columnWidth - 1, (j + 1) * ePaperProperties.getItemHeight() - 1);
					ePaperClient.setDrawingColors(
							new DrawingColors(ePaperProperties.getTextColor(), ePaperProperties.getBackgroundColor()));
					int index = i * maxItemsByColumn + j;
					if (ePaperProperties.isShowUpdateTime()
							&& (i == ePaperProperties.getColumns() - 1 && j == maxItemsByColumn - 1)) {
						ePaperClient.displayText(i * columnWidth, j * ePaperProperties.getItemHeight(),
								(i + 1) * columnWidth - 1, (j + 1) * ePaperProperties.getItemHeight() - 1,
								FontSize.DOTS_32, ePaperProperties.getLineSpacing(), HorizontalAlignment.CENTER,
								VerticalAlignment.CENTER,
								receivedLocalDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
					} else if (index < passages.getTrain().size()) {
						Train train = trainList.get(index);
						ePaperClient.displayText(i * columnWidth + 1, j * ePaperProperties.getItemHeight(),
								i * columnWidth + ePaperProperties.getTimeWidth() + 1,
								(j + 1) * ePaperProperties.getItemHeight() - 1, FontSize.DOTS_32,
								ePaperProperties.getLineSpacing(), HorizontalAlignment.LEFT, VerticalAlignment.CENTER,
								train.getDate().getText().split(" ")[1]);
						if (train.getEtat() != null) {
							ePaperClient.displayText(
									i * columnWidth + ePaperProperties.getTimeWidth()
											+ ePaperProperties.getMarginWidth() + 1,
									j * ePaperProperties.getItemHeight(),
									i * columnWidth + ePaperProperties.getTimeWidth() + ePaperProperties.getEtatWidth()
											+ ePaperProperties.getMarginWidth() + 1,
									(j + 1) * ePaperProperties.getItemHeight() - 1, FontSize.DOTS_32,
									ePaperProperties.getLineSpacing(), HorizontalAlignment.LEFT,
									VerticalAlignment.CENTER, StringUtils.stripAccents(train.getEtat().toString()));
						}
						ePaperClient.displayText((i + 1) * columnWidth - 2 - ePaperProperties.getStationWidth(),
								j * ePaperProperties.getItemHeight(), (i + 1) * columnWidth - 2,
								(j + 1) * ePaperProperties.getItemHeight() - 1, FontSize.DOTS_32,
								ePaperProperties.getLineSpacing(), HorizontalAlignment.RIGHT, VerticalAlignment.CENTER,
								StringUtils.stripAccents(Station.fromUicCode(train.getTerm()).getName()));
					}
				}
			}
			ePaperClient.refreshAndUpdate();
		} catch (IOException | EPaperException e) {
			LOGGER.error("Exception while updating e-paper", e);
		}
	}
}
