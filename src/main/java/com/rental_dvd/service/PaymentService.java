package com.rental_dvd.service;

import com.rental_dvd.entity.Payment;

import java.util.List;

public interface PaymentService {

    void save (Payment payment);

    Payment findOne(int id);

    List<Payment> findAll();

    void delete(int id);

    void update(Payment payment);
}
