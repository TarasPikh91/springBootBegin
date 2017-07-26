package com.rental_dvd.dao;

import com.rental_dvd.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language, Integer> {
}
