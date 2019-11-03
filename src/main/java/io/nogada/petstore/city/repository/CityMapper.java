package io.nogada.petstore.city.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import io.nogada.petstore.city.model.City;

@Mapper
/**
 * CityMapper
 */
public interface CityMapper {

    // City findById(Long idCity);
    // City findByName(String name);
    @Select("select idCity,name,population from city")
    List<City> getCities();
    // void insertCity(City city);
}