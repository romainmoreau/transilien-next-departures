package fr.romainmoreau.transiliennextdepartures.transilien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;

@Configuration
public class TransilienConfiguration {
	@Autowired
	private TransilienProperties transilienProperties;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory(
				new OkHttpClient.Builder().authenticator((route, response) -> response.request().newBuilder()
						.header("Authorization",
								Credentials.basic(transilienProperties.getLogin(), transilienProperties.getPassword()))
						.build()).build()));
	}
}
