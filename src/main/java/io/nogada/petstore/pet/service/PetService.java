package io.nogada.petstore.pet.service;

import java.util.HashMap;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.nogada.petstore.pet.repository.*;



/**
 * PetService
 */
@Service
public class PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetService.class);
	
	@Autowired
	private PetRepository petRepository;
	
	public String search(final String q) throws Exception {
		logger.info("[Trace] Service called with - {}", q);
		return petRepository.search(q);
	}

	public void eatingMemory(final int number) {
		final Random rand = new Random();
		String key;
		final HashMap<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < number; i++) {
			key = Integer.toString(rand.nextInt());
			final StringBuilder value = new StringBuilder();
			value.append(new String("Auctor congue curabitur diam tristique nulla, urna venenatis consectetuer nec phasellus. Dolor gravida adipiscing, congue a pede metus ad nibh, cum et volutpat sollicitudin. Ullamcorper condimentum. Est amet ut sed turpis porttitor. Dignissim sed nullam, ac commodo nec, voluptates habitasse lorem at, nec imperdiet habitasse condimentum. Amet ipsum nibh leo, neque erat velit felis laoreet lorem fames, dictum lacus et malesuada libero. Molestie ullamcorper, feugiat vel dui imperdiet nonummy eros, dui diam eros turpis laoreet. Velit amet at mauris sapien, donec nec in."));
			value.append(key);
			System.out.println(value.toString());
			map.put(key, value.toString());
		}
	}
}