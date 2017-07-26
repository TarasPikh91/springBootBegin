package com.rental_dvd.dao;

import java.util.List;

import com.rental_dvd.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {


}
