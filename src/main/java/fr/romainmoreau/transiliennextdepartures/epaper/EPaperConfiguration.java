package fr.romainmoreau.transiliennextdepartures.epaper;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.romainmoreau.epaper.client.api.EPaperClient;
import fr.romainmoreau.epaper.client.jssc.JsscEPaperClient;

@Configuration
public class EPaperConfiguration {
	private static final Logger LOGGER = LoggerFactory.getLogger(EPaperConfiguration.class);

	@Autowired
	private EPaperProperties ePaperProperties;

	@Bean
	public EPaperClient ePaperClient() throws IOException {
		LOGGER.info("Creating e-paper client using port name {} and timeout {}", ePaperProperties.getPortName(),
				ePaperProperties.getTimeout());
		return new JsscEPaperClient(ePaperProperties.getPortName(), ePaperProperties.getTimeout());
	}
}
