package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.FilmDao;
import com.rental_dvd.entity.Film;
import com.rental_dvd.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmDao filmDao;

    @Override
    public void save(Film film) {
        filmDao.save(film);
    }

    @Override
    public Film findOne(int id) {
        return filmDao.findOne(id);
    }

    @Override
    public List<Film> findAll() {
        return filmDao.findAll();
    }

    @Override
    public void delete(int id) {
        filmDao.delete(id);
    }

    @Override
    public void update(Film film) {
        filmDao.save(film);
    }
}
