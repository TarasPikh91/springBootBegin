package com.rental_dvd.dao;

import com.rental_dvd.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmDao extends JpaRepository<Film, Integer> {
}
