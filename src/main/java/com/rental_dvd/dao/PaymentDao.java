package com.rental_dvd.dao;

import com.rental_dvd.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment, Integer> {
}
