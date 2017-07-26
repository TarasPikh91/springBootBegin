package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.PaymentDao;
import com.rental_dvd.entity.Payment;
import com.rental_dvd.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public void save(Payment payment) {
        paymentDao.save(payment);
    }

    @Override
    public Payment findOne(int id) {
        return paymentDao.findOne(id);
    }

    @Override
    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

    @Override
    public void delete(int id) {
        paymentDao.delete(id);
    }

    @Override
    public void update(Payment payment) {
        paymentDao.save(payment);
    }
}
