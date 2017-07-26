package com.rental_dvd.serviceImpl;

import com.rental_dvd.dao.ActorDao;
import com.rental_dvd.entity.Actor;
import com.rental_dvd.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorDao actorDao;


    @Override
    public void save(Actor actor) {

        actorDao.save(actor);

    }

    @Override
    public Actor findOne(int id) {
        return actorDao.findOne(id);
    }

    @Override
    public List<Actor> findAll() {
        return actorDao.findAll();
    }

    @Override
    public void delete(int id) {

        actorDao.delete(id);
    }

    @Override
    public void update(Actor actor) {

        actorDao.save(actor);
    }
}
