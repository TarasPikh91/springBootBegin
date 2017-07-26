package com.rental_dvd.service;

import com.rental_dvd.entity.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    void delete(int id);

    Customer findOne(int id);

    List<Customer> findAll();

    void update(Customer customer);
}
