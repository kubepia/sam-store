package io.nogada.petstore.city.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.nogada.petstore.city.model.City;

@Mapper
/**
 * CityMapper
 */
public interface CityMapper {

    List<City> findById(String id);
    List<City> findByName(String name);
    List<City> getCities();
    
}