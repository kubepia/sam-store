package io.nogada.petstore.pet.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// import io.nogada.petstore.pet.model.PetQuery;
import io.nogada.petstore.pet.service.PetService;

/**
 * PetController
 */
@RestController
public class PetController {

    private static final Logger logger = LoggerFactory.getLogger(PetController.class);

    @Autowired
	private PetService service;
    // @Autowired
	// private PetRemoteService serviceRemote;

    @GetMapping(path = "/pet")
    @ResponseBody
    String getPetInGet(@RequestParam(required=false,defaultValue = "") final String q,
            final HttpServletRequest request) throws Exception {
        logger.info("[Trace]: Controller called");
        return service.search(q);
    }

    @GetMapping(path = "/load")
    @ResponseBody
    String load(@RequestParam(defaultValue = "1000") final int number) throws Exception {
        logger.info("[Trace]: Load test for HPA");
        this.service.eatingMemory(number);
        return "ok";
    }
    @GetMapping(path = "/health")
    @ResponseBody
    String health() throws Exception {
        return "ok";
    }

    @PostMapping(path = "/pet")
    @ResponseBody
    String getPetInPost(@RequestBody final String q, final HttpServletRequest request) throws Exception {
        logger.info("[Trace]: Controller called");
        return service.search(q);
    }

    // @PostMapping(path = "/petremote", consumes = "application/json", produces = "application/json")
    // @ResponseBody
    // String getPetFromRemote(@RequestBody final PetQuery query, final HttpServletRequest request) throws Exception {
    //     logger.info("[Trace]: Controller called");
		
	// 	return serviceRemote.search(query.getKeyword());
    // }

}