package com.rental_dvd.service;

import com.rental_dvd.entity.Country;

import java.util.List;

public interface CountryService {

    void save(Country country);

    Country findOne(int id);

    List<Country> findAll();

    void delete(int id);

    void update(Country country);
}
