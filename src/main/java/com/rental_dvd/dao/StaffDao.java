package com.rental_dvd.dao;

import com.rental_dvd.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDao extends JpaRepository<Staff, Integer> {
}
