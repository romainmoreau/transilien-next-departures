package fr.romainmoreau.transiliennextdepartures.epaper;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import fr.romainmoreau.epaper.client.api.Color;
import fr.romainmoreau.epaper.client.api.EPaperClient;
import fr.romainmoreau.epaper.client.api.FontSize;

@Component
@Validated
@ConfigurationProperties("e-paper")
public class EPaperProperties {
	@NotNull
	private String portName;

	private long timeout;

	private long receiveTimeout;

	private boolean showUpdateTime;

	@Min(0)
	@Max(EPaperClient.WIDTH - 1)
	private int x0;

	@Min(0)
	@Max(EPaperClient.HEIGHT - 1)
	private int y0;

	@Min(0)
	@Max(EPaperClient.WIDTH - 1)
	private int x1;

	@Min(0)
	@Max(EPaperClient.HEIGHT - 1)
	private int y1;

	@Min(1)
	private int columns;

	@Min(1)
	private int rows;

	@NotNull
	private FontSize fontSize;

	@Min(0)
	private int lineSpacing;

	@Min(0)
	private int timePaddingLeft;

	@Min(0)
	private int timePaddingRight;

	@Min(0)
	private double timeWidth;

	@Min(0)
	private double etatWidth;

	@Min(0)
	private int stationPaddingLeft;

	@Min(0)
	private int stationPaddingRight;

	@Min(0)
	private double stationWidth;

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

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	public long getReceiveTimeout() {
		return receiveTimeout;
	}

	public void setReceiveTimeout(long receiveTimeout) {
		this.receiveTimeout = receiveTimeout;
	}

	public boolean isShowUpdateTime() {
		return showUpdateTime;
	}

	public void setShowUpdateTime(boolean showUpdateTime) {
		this.showUpdateTime = showUpdateTime;
	}

	public int getX0() {
		return x0;
	}

	public void setX0(int x0) {
		this.x0 = x0;
	}

	public int getY0() {
		return y0;
	}

	public void setY0(int y0) {
		this.y0 = y0;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public FontSize getFontSize() {
		return fontSize;
	}

	public void setFontSize(FontSize fontSize) {
		this.fontSize = fontSize;
	}

	public int getLineSpacing() {
		return lineSpacing;
	}

	public void setLineSpacing(int lineSpacing) {
		this.lineSpacing = lineSpacing;
	}

	public int getTimePaddingLeft() {
		return timePaddingLeft;
	}

	public void setTimePaddingLeft(int timePaddingLeft) {
		this.timePaddingLeft = timePaddingLeft;
	}

	public int getTimePaddingRight() {
		return timePaddingRight;
	}

	public void setTimePaddingRight(int timePaddingRight) {
		this.timePaddingRight = timePaddingRight;
	}

	public double getTimeWidth() {
		return timeWidth;
	}

	public void setTimeWidth(double timeWidth) {
		this.timeWidth = timeWidth;
	}

	public int getStationPaddingRight() {
		return stationPaddingRight;
	}

	public void setStationPaddingRight(int stationPaddingRight) {
		this.stationPaddingRight = stationPaddingRight;
	}

	public double getEtatWidth() {
		return etatWidth;
	}

	public void setEtatWidth(double etatWidth) {
		this.etatWidth = etatWidth;
	}

	public int getStationPaddingLeft() {
		return stationPaddingLeft;
	}

	public void setStationPaddingLeft(int stationPaddingLeft) {
		this.stationPaddingLeft = stationPaddingLeft;
	}

	public double getStationWidth() {
		return stationWidth;
	}

	public void setStationWidth(double stationWidth) {
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
