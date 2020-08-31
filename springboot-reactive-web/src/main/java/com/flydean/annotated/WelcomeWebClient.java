package com.flydean.annotated;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WelcomeWebClient {
	private WebClient client = WebClient.create("http://localhost:8080");

	private final Mono<ClientResponse> result = client.get()
			.uri("/hello")
			.accept(MediaType.TEXT_PLAIN)
			.exchange();

	public String getResult() {
		return " result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
	}
}
