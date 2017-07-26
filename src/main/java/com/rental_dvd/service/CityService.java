package com.rental_dvd.service;

import com.rental_dvd.entity.City;

import java.util.List;

public interface CityService {

    void save(City city);

    City findOne(int id);

    List<City> findAll();

    void delete(int id);

    void update(City city);
}
