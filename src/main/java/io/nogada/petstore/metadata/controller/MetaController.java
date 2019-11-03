package io.nogada.petstore.metadata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.nogada.petstore.metadata.service.MetaService;

/**
 * MetaController
 */
@RestController
public class MetaController {

    @Autowired
    MetaService metaService;
    
    private static final Logger logger = LoggerFactory.getLogger(MetaController.class);
    @GetMapping("/message/{code}")
    String getMessage(@PathVariable String code){
        logger.info("Searching by code  :{} " ,code);
		return metaService.getMessageByCode(code).toString();
    }
}