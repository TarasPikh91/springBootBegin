package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.RentalDao;
import com.rental_dvd.entity.Rental;
import com.rental_dvd.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalDao rentalDao;

    @Override
    public void save(Rental rental) {
        rentalDao.save(rental);
    }

    @Override
    public Rental findOne(int id) {
        return rentalDao.findOne(id);
    }

    @Override
    public List<Rental> findAll() {
        return rentalDao.findAll();
    }

    @Override
    public void delete(int id) {
        rentalDao.delete(id);
    }

    @Override
    public void update(Rental rental) {
        rentalDao.save(rental);
    }
}
