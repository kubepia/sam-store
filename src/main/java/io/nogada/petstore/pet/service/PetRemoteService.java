package io.nogada.petstore.pet.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * PetRemoteService
 */
@Service
public class PetRemoteService {

    private static final Logger logger = LoggerFactory.getLogger(PetRemoteService.class);

	@Autowired
	RestTemplate restClient;

	public String search(String q) throws Exception{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		logger.info("dkdkdk");
		String str= restClient.exchange("http://localhost:8080/pet", HttpMethod.GET, entity, String.class).getBody();
		return str;

	}
}