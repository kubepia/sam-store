package io.nogada.petstore.city.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.nogada.petstore.city.model.City;
import io.nogada.petstore.city.repository.CityMapper;

/**
 * CityService
 */
@Service
@Transactional
public class CityService {
    @Autowired
    CityMapper cityMapper;

    // public City getCityById(Long id) {
    //     return cityMapper.findById(id);
    // }

    public List<City> getAllCity() {
        return cityMapper.getCities();
    }

    // public void addCity(City city) {
    //     cityMapper.insertCity(city);
    // }
    
}