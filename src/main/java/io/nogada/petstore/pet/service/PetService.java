package io.nogada.petstore.pet.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nogada.petstore.pet.repository.PetRepository;



/**
 * PetService
 */
@Service
public class PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetService.class);
	
	@Autowired
	private PetRepository petRepository;
	
	public String search(String q) throws Exception{
		logger.info("[Trace] Service called with - {}", q);
		return petRepository.search(q);
	}
}