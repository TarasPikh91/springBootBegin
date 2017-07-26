package com.rental_dvd.service;

import com.rental_dvd.entity.Category;

import java.util.List;

public interface CategoryService{

    void save (Category category);

    Category findOne(int id);

    List<Category> findAll();

    void delete(int id);

    void update(Category category);
}
