package io.nogada.petstore.city.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.nogada.petstore.city.model.City;
import io.nogada.petstore.city.service.CityService;

/**
 * CityController
 */
@RestController
public class CityController {
    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    CityService service;

    @GetMapping(path = "/city")
    @ResponseBody
    List<City> getPetInGet()throws Exception{
        logger.info("[Trace]: Controller called get cities");
        logger.info("");
		return service.getAllCity();
    }

}