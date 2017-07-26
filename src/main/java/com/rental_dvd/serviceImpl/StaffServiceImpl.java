package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.StaffDao;
import com.rental_dvd.entity.Staff;
import com.rental_dvd.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;

    @Override
    public void save(Staff staff) {
        staffDao.save(staff);
    }

    @Override
    public Staff findOne(int id) {
        return staffDao.findOne(id);
    }

    @Override
    public List<Staff> findAll() {
        return staffDao.findAll();
    }

    @Override
    public void delete(int id) {
        staffDao.delete(id);
    }

    @Override
    public void update(Staff staff) {
        staffDao.save(staff);
    }
}
