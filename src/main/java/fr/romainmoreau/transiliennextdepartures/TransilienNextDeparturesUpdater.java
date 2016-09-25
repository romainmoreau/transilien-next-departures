package fr.romainmoreau.transiliennextdepartures;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import fr.romainmoreau.transiliennextdepartures.epaper.EPaperService;
import fr.romainmoreau.transiliennextdepartures.transilien.Passages;
import fr.romainmoreau.transiliennextdepartures.transilien.TransilienService;

@Component
public class TransilienNextDeparturesUpdater {
	@Autowired
	private TransilienService transilienService;

	@Autowired
	private EPaperService ePaperService;

	@Scheduled(cron = "59 * * * * *")
	private void update() {
		Passages passages = transilienService.nextDepartures();
		LocalDateTime receivedLocalDateTime = LocalDateTime.now();
		ePaperService.update(receivedLocalDateTime, passages);
	}
}
