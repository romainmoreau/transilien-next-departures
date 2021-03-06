package fr.romainmoreau.transiliennextdepartures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TransilienNextDeparturesApplication {
	public static final void main(String[] args) {
		SpringApplication.run(TransilienNextDeparturesApplication.class, args);
	}
}
