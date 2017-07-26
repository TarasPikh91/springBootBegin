package com.rental_dvd.dao;

import com.rental_dvd.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDao extends JpaRepository<Rental, Integer> {
}
