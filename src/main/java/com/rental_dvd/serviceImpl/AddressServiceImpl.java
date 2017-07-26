package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.AddressDao;
import com.rental_dvd.entity.Address;
import com.rental_dvd.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;


    @Override
    public void save(Address address) {
        addressDao.save(address);
    }

    @Override
    public Address findOne(int id) {
        return addressDao.findOne(id);
    }

    @Override
    public List<Address> findAll() {
        return addressDao.findAll();
    }

    @Override
    public void delete(int id) {
        addressDao.delete(id);
    }

    @Override
    public void update(Address address) {
        addressDao.save(address);
    }
}
