package com.rental_dvd.service;

import com.rental_dvd.entity.Film;

import java.util.List;

public interface FilmService {

    void save (Film film);

    Film findOne(int id);

    List<Film> findAll();

    void delete(int id);

    void update(Film film);
}
