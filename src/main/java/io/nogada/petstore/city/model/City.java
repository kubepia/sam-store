package io.nogada.petstore.city.model;

import org.apache.ibatis.type.Alias;

@Alias("city")
public class City {
    private Long idCity;
    private String name;
    private Long population;

    public City() {
    }

    public City(String name, String country, Long population) {
        this.name = name;
        this.population = population;
    }
}