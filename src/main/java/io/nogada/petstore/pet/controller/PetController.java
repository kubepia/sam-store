package io.nogada.petstore.pet.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.nogada.petstore.pet.service.PetService;

/**
 * PetController
 */
@RestController
public class PetController {

    private static final Logger logger = LoggerFactory.getLogger(PetController.class);

    @Autowired
	private PetService service;

    @GetMapping(path = "/pet")
    @ResponseBody
    String getPet(@RequestParam(required=false,defaultValue = "") String q, HttpServletRequest request)throws Exception{
        logger.info("[Trace]: Controller called");
		
		return service.search(q);
    }
    @GetMapping(path = "/pet2")
    @ResponseBody
    String getPet2(@RequestParam(required=false,defaultValue = "") String q, HttpServletRequest request)throws Exception{
        logger.info("[Trace]: Controller called");
		
		return "service12";
    }
}