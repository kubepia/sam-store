package io.nogada.petstore.pet.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nogada.petstore.pet.repository.PetRepository;

/**
 * PetRemoteService
 */
@Service
public class PetRemoteService {

    private static final Logger logger = LoggerFactory.getLogger(PetRemoteService.class);
		
	public String search(String q) throws Exception{
		
		return "";
	}
}