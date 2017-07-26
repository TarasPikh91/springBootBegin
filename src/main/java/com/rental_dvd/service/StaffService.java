package com.rental_dvd.service;

import com.rental_dvd.entity.Staff;

import java.util.List;

public interface StaffService {

    void save (Staff staff);

    Staff findOne(int id);

    List<Staff> findAll();

    void delete(int id);

    void update(Staff staff);
}
