package fr.romainmoreau.transiliennextdepartures.transilien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransilienService {
	private static final String NEXT_DEPARTURES_TRANSILIEN_URL = "http://api.transilien.com/gare/{depart}/depart/";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private TransilienProperties transilienProperties;

	public Passages nextDepartures() {
		return restTemplate.getForObject(NEXT_DEPARTURES_TRANSILIEN_URL, Passages.class,
				transilienProperties.getStation().getUicCode());
	}
}
