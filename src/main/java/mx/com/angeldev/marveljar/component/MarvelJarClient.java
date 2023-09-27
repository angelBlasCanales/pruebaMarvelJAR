package mx.com.angeldev.marveljar.component;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import mx.com.angeldev.marveljar.model.CharacterDataWrapper;

@Component
public class MarvelJarClient {
	
	private final WebClient webClient;
	private final String publicKey;
	private final String privateKey;
	
	public MarvelJarClient(WebClient.Builder webClientBuilder,
			@Value("${marvel.api.base-url}") String urlBase,
			@Value("${marvel.api.key}") String publicKey,
			@Value("${marvel.api.private-key}") String privateKey) {
		
		this.webClient = webClientBuilder.baseUrl(urlBase).build();
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		
	}
	
	public CharacterDataWrapper getCharacters(String path, Long id){
		
		String timestamp = Long.toString(System.currentTimeMillis());
		String hash = generateHash(timestamp);
		
		return webClient.get()
				.uri(uriBuilder -> uriBuilder
						.path(path)						
						.queryParam("ts", timestamp)
						.queryParam("apikey", publicKey)
						.queryParam("hash", hash)
						.build(id))
				.retrieve().bodyToMono(CharacterDataWrapper.class).block();
		
	}
	
	private String generateHash(String timestamp) {
        return DigestUtils.md5Hex(timestamp + privateKey + publicKey);
    }

}
