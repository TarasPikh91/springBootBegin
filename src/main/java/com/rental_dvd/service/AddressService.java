package com.rental_dvd.service;

import com.rental_dvd.entity.Address;

import java.util.List;

public interface AddressService {

    void save(Address address);

    Address findOne(int id);

    List<Address> findAll();

    void delete(int id);

    void update(Address address);
}
