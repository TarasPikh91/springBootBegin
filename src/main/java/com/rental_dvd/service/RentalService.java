package com.rental_dvd.service;

import com.rental_dvd.entity.Rental;

import java.util.List;

public interface RentalService {

    void save (Rental rental);

    Rental findOne(int id);

    List<Rental> findAll();

    void delete(int id);

    void update(Rental rental);
}
