package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.CustomerDao;
import com.rental_dvd.entity.Country;
import com.rental_dvd.entity.Customer;
import com.rental_dvd.service.CountryService;
import com.rental_dvd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void delete(int id) {
        customerDao.delete(id);
    }

    @Override
    public Customer findOne(int id) {
        return customerDao.findOne(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public void update(Customer customer) {
customerDao.save(customer);
    }
}
