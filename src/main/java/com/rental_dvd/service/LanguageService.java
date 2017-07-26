package com.rental_dvd.service;

import com.rental_dvd.entity.Language;

import java.util.List;

public interface LanguageService {

    void save (Language language);

    Language findOne(int id);

    List<Language> findAll();

    void delete(int id);

    void update(Language language);
}
