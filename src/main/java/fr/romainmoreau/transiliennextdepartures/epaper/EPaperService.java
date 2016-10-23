package fr.romainmoreau.transiliennextdepartures.epaper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
import fr.romainmoreau.epaper.client.api.HorizontalAlignment;
import fr.romainmoreau.epaper.client.api.VerticalAlignment;
import fr.romainmoreau.epaper.client.api.table.Border;
import fr.romainmoreau.epaper.client.api.table.Cell;
import fr.romainmoreau.epaper.client.api.table.Column;
import fr.romainmoreau.epaper.client.api.table.PaddedCellContent;
import fr.romainmoreau.epaper.client.api.table.Row;
import fr.romainmoreau.epaper.client.api.table.Table;
import fr.romainmoreau.epaper.client.api.table.TextCellContent;
import fr.romainmoreau.transiliennextdepartures.transilien.Passages;
import fr.romainmoreau.transiliennextdepartures.transilien.Station;
import fr.romainmoreau.transiliennextdepartures.transilien.Train;

@Service
public class EPaperService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EPaperService.class);

	@Autowired
	private EPaperClient ePaperClient;

	@Autowired
	private EPaperProperties ePaperProperties;

	public void update(LocalDateTime receivedLocalDateTime, Passages passages) {
		try {
			ePaperClient.setDrawingColors(new DrawingColors(Color.WHITE, Color.WHITE));
			ePaperClient.clear();
			int maxTrains = ePaperProperties.getRows() * ePaperProperties.getColumns();
			if (ePaperProperties.isShowUpdateTime()) {
				maxTrains--;
			}
			List<Train> trainList = passages.getTrain().subList(0, Math.min(passages.getTrain().size(), maxTrains));
			Table table = new Table();
			table.getVerticalBorders().add(new Border(1, ePaperProperties.getBorderColor()));
			for (int i = 0; i < ePaperProperties.getColumns(); i++) {
				table.getColumns().add(new Column(ePaperProperties.getTimeWidth() > 1d ? ePaperProperties.getTimeWidth()
						: ePaperProperties.getTimeWidth() / ePaperProperties.getColumns()));
				table.getVerticalBorders().add(new Border(0, null));
				table.getColumns().add(new Column(ePaperProperties.getEtatWidth() > 1d ? ePaperProperties.getEtatWidth()
						: ePaperProperties.getEtatWidth() / ePaperProperties.getColumns()));
				table.getVerticalBorders().add(new Border(0, null));
				table.getColumns()
						.add(new Column(ePaperProperties.getStationWidth() > 1d ? ePaperProperties.getStationWidth()
								: ePaperProperties.getStationWidth() / ePaperProperties.getColumns()));
				table.getVerticalBorders().add(new Border(1, ePaperProperties.getBorderColor()));
			}
			table.getHorizontalBorders().add(new Border(1, ePaperProperties.getBorderColor()));
			for (int i = 0; i < ePaperProperties.getRows(); i++) {
				table.getRows().add(new Row(1d / ePaperProperties.getRows()));
				table.getHorizontalBorders().add(new Border(1, ePaperProperties.getBorderColor()));
			}
			for (int i = 0; i < ePaperProperties.getColumns(); i++) {
				for (int j = 0; j < ePaperProperties.getRows(); j++) {
					int index = i * ePaperProperties.getRows() + j;
					if (ePaperProperties.isShowUpdateTime()
							&& (i == ePaperProperties.getColumns() - 1 && j == ePaperProperties.getRows() - 1)) {
						table.getCells().add(new Cell(i * 3 + 2, j, 0, ePaperProperties.getBackgroundColor(),
								new PaddedCellContent(ePaperProperties.getTimePaddingLeft(),
										ePaperProperties.getTimePaddingRight(), 0, 0,
										new TextCellContent(ePaperProperties.getTextColor(),
												ePaperProperties.getBackgroundColor(), ePaperProperties.getFontSize(),
												ePaperProperties.getLineSpacing(), HorizontalAlignment.RIGHT,
												VerticalAlignment.CENTER, receivedLocalDateTime.format(
														DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))))));
					} else if (index < passages.getTrain().size()) {
						Train train = trainList.get(index);
						table.getCells().add(new Cell(i * 3, j, 0, ePaperProperties.getBackgroundColor(),
								new PaddedCellContent(ePaperProperties.getTimePaddingLeft(),
										ePaperProperties.getTimePaddingRight(), 0, 0,
										new TextCellContent(ePaperProperties.getTextColor(),
												ePaperProperties.getBackgroundColor(), ePaperProperties.getFontSize(),
												ePaperProperties.getLineSpacing(), HorizontalAlignment.RIGHT,
												VerticalAlignment.CENTER, train.getDate().getText().split(" ")[1]))));
						table.getCells().add(new Cell(i * 3 + 1, j, 0, ePaperProperties.getBackgroundColor(),
								train.getEtat() != null ? new TextCellContent(ePaperProperties.getTextColor(),
										ePaperProperties.getBackgroundColor(), ePaperProperties.getFontSize(),
										ePaperProperties.getLineSpacing(), HorizontalAlignment.LEFT,
										VerticalAlignment.CENTER, StringUtils.stripAccents(train.getEtat().toString()))
										: null));
						table.getCells().add(new Cell(i * 3 + 2, j, 0, ePaperProperties.getBackgroundColor(),
								new PaddedCellContent(ePaperProperties.getStationPaddingLeft(),
										ePaperProperties.getStationPaddingRight(), 0, 0,
										new TextCellContent(ePaperProperties.getTextColor(),
												ePaperProperties.getBackgroundColor(), ePaperProperties.getFontSize(),
												ePaperProperties.getLineSpacing(), HorizontalAlignment.RIGHT,
												VerticalAlignment.CENTER, StringUtils.stripAccents(
														Station.fromUicCode(train.getTerm()).getName())))));
					}
				}
			}
			ePaperClient.drawTable(0, 0, EPaperClient.WIDTH - 1, EPaperClient.HEIGHT - 1, table);
			ePaperClient.refreshAndUpdate();
		} catch (IOException | EPaperException e) {
			LOGGER.error("Exception while updating e-paper", e);
		}
	}
}
