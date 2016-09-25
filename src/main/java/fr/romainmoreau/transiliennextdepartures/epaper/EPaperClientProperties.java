package fr.romainmoreau.transiliennextdepartures.epaper;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("e-paper-client")
public class EPaperClientProperties {
	@NotNull
	private String portName;

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}
}
