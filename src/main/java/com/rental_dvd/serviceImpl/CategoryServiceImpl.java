package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.CategoryDao;
import com.rental_dvd.entity.Category;
import com.rental_dvd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public Category findOne(int id) {
        return categoryDao.findOne(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public void delete(int id) {
        categoryDao.delete(id);
    }

    @Override
    public void update(Category category) {
        categoryDao.save(category);
    }
}
