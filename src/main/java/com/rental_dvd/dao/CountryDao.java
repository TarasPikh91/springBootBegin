package com.rental_dvd.dao;

import java.util.List;

import com.rental_dvd.entity.City;
import com.rental_dvd.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Integer> {

}
