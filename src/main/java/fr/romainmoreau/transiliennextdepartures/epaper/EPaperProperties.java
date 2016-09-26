package fr.romainmoreau.transiliennextdepartures.epaper;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import fr.romainmoreau.epaper.client.api.Color;
import fr.romainmoreau.epaper.client.api.EPaperClient;

@Component
@ConfigurationProperties("e-paper")
public class EPaperProperties {
	@NotNull
	private String portName;

	private boolean showUpdateTime;

	@Min(33)
	@Max(EPaperClient.HEIGHT)
	private int itemHeight;

	@Min(1)
	private int columns;

	@Min(0)
	private int lineSpacing;

	@Min(0)
	private int marginWidth;

	@Min(0)
	private int timeWidth;

	@Min(0)
	private int etatWidth;

	@Min(0)
	private int stationWidth;

	@NotNull
	private Color borderColor;

	@NotNull
	private Color backgroundColor;

	@NotNull
	private Color textColor;

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public boolean isShowUpdateTime() {
		return showUpdateTime;
	}

	public void setShowUpdateTime(boolean showUpdateTime) {
		this.showUpdateTime = showUpdateTime;
	}

	public int getItemHeight() {
		return itemHeight;
	}

	public void setItemHeight(int itemHeight) {
		this.itemHeight = itemHeight;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getLineSpacing() {
		return lineSpacing;
	}

	public void setLineSpacing(int lineSpacing) {
		this.lineSpacing = lineSpacing;
	}

	public int getMarginWidth() {
		return marginWidth;
	}

	public void setMarginWidth(int marginWidth) {
		this.marginWidth = marginWidth;
	}

	public int getTimeWidth() {
		return timeWidth;
	}

	public void setTimeWidth(int timeWidth) {
		this.timeWidth = timeWidth;
	}

	public int getEtatWidth() {
		return etatWidth;
	}

	public void setEtatWidth(int etatWidth) {
		this.etatWidth = etatWidth;
	}

	public int getStationWidth() {
		return stationWidth;
	}

	public void setStationWidth(int stationWidth) {
		this.stationWidth = stationWidth;
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Color getTextColor() {
		return textColor;
	}

	public void setTextColor(Color textColor) {
		this.textColor = textColor;
	}
}
