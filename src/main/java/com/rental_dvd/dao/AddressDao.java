package com.rental_dvd.dao;

import com.rental_dvd.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Integer> {
}
