package com.rental_dvd.service;

import com.rental_dvd.entity.Store;

import java.util.List;

public interface StoreService {

    void save (Store store);

    Store findOne(int id);

    List<Store> findAll();

    void delete(int id);

    void update(Store store);
}
