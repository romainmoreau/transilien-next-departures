package fr.romainmoreau.transiliennextdepartures.epaper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.romainmoreau.epaper.client.api.Color;
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

	private static final int ITEM_HEIGHT = 40;

	private static final int COLUMNS = 2;

	private static final int LINE_SPACING = 0;

	private static final int MARGIN_WIDTH = 10;

	private static final int TIME_WIDTH = 67;

	private static final int ETAT_WIDTH = 78;

	private static final int STATION_WIDTH = 233;

	private static final int MAX_ITEMS_BY_COLUMN;

	private static final int COLUMN_WIDTH;

	static {
		MAX_ITEMS_BY_COLUMN = EPaperClient.HEIGHT / ITEM_HEIGHT;
		COLUMN_WIDTH = EPaperClient.WIDTH / COLUMNS;
	}

	@Autowired
	private EPaperClient ePaperClient;

	public void update(LocalDateTime receivedLocalDateTime, Passages passages) {
		try {
			ePaperClient.clear();
			List<Train> trainList = passages.getTrain().subList(0, MAX_ITEMS_BY_COLUMN * COLUMNS - 1);
			for (int i = 0; i < COLUMNS; i++) {
				for (int j = 0; j < MAX_ITEMS_BY_COLUMN; j++) {
					ePaperClient.setDrawingColors(new DrawingColors(Color.LIGHT_GRAY, Color.WHITE));
					ePaperClient.fillRectangle(i * COLUMN_WIDTH, j * ITEM_HEIGHT, (i + 1) * COLUMN_WIDTH - 1,
							(j + 1) * ITEM_HEIGHT - 1);
					ePaperClient.setDrawingColors(new DrawingColors(Color.DARK_GRAY, Color.WHITE));
					ePaperClient.drawRectangle(i * COLUMN_WIDTH, j * ITEM_HEIGHT, (i + 1) * COLUMN_WIDTH - 1,
							(j + 1) * ITEM_HEIGHT - 1);
					ePaperClient.setDrawingColors(new DrawingColors(Color.WHITE, Color.LIGHT_GRAY));
					if (i == COLUMNS - 1 && j == MAX_ITEMS_BY_COLUMN - 1) {
						ePaperClient.displayText(i * COLUMN_WIDTH, j * ITEM_HEIGHT, (i + 1) * COLUMN_WIDTH - 1,
								(j + 1) * ITEM_HEIGHT - 1, FontSize.DOTS_32, LINE_SPACING, HorizontalAlignment.CENTER,
								VerticalAlignment.CENTER,
								receivedLocalDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
					} else {
						Train train = trainList.get(i * MAX_ITEMS_BY_COLUMN + j);
						ePaperClient.displayText(i * COLUMN_WIDTH + 1, j * ITEM_HEIGHT,
								i * COLUMN_WIDTH + TIME_WIDTH + 1, (j + 1) * ITEM_HEIGHT - 1, FontSize.DOTS_32,
								LINE_SPACING, HorizontalAlignment.LEFT, VerticalAlignment.CENTER,
								train.getDate().getText().split(" ")[1]);
						if (train.getEtat() != null) {
							ePaperClient.displayText(i * COLUMN_WIDTH + TIME_WIDTH + MARGIN_WIDTH + 1, j * ITEM_HEIGHT,
									i * COLUMN_WIDTH + TIME_WIDTH + ETAT_WIDTH + MARGIN_WIDTH + 1,
									(j + 1) * ITEM_HEIGHT - 1, FontSize.DOTS_32, LINE_SPACING, HorizontalAlignment.LEFT,
									VerticalAlignment.CENTER, StringUtils.stripAccents(train.getEtat().toString()));
						}
						ePaperClient.displayText((i + 1) * COLUMN_WIDTH - 2 - STATION_WIDTH, j * ITEM_HEIGHT,
								(i + 1) * COLUMN_WIDTH - 2, (j + 1) * ITEM_HEIGHT - 1, FontSize.DOTS_32, LINE_SPACING,
								HorizontalAlignment.RIGHT, VerticalAlignment.CENTER,
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
