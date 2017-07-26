package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.LanguageDao;
import com.rental_dvd.entity.Language;
import com.rental_dvd.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageDao languageDao;

    @Override
    public void save(Language language) {
        languageDao.save(language);
    }

    @Override
    public Language findOne(int id) {
        return languageDao.findOne(id);
    }

    @Override
    public List<Language> findAll() {
        return languageDao.findAll();
    }

    @Override
    public void delete(int id) {
        languageDao.delete(id);
    }

    @Override
    public void update(Language language) {
        languageDao.save(language);
    }
}
