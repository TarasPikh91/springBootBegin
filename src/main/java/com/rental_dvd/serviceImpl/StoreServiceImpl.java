package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.StoreDao;
import com.rental_dvd.entity.Store;
import com.rental_dvd.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    private StoreDao storeDao;

    @Override
    public void save(Store store) {
        storeDao.save(store);
    }

    @Override
    public Store findOne(int id) {
        return storeDao.findOne(id);
    }

    @Override
    public List<Store> findAll() {
        return storeDao.findAll();
    }

    @Override
    public void delete(int id) {
            storeDao.delete(id);
    }

    @Override
    public void update(Store store) {
        storeDao.save(store);
    }
}
