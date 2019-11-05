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

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}