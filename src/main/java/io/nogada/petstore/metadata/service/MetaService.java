package io.nogada.petstore.metadata.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.nogada.petstore.metadata.model.Message;

/**
 * MetaService
 */
@Service
@CacheConfig(cacheNames = "message")
public class MetaService {

    @Cacheable("metadata")
	public Message getMessageByCode(String code) {
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new Message(code,"dummy message");
		
	}
}