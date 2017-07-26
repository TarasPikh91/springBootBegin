package com.rental_dvd.dao;

import com.rental_dvd.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<Store, Integer> {
}
