package com.rental_dvd.service;


import com.rental_dvd.entity.Actor;

import java.util.List;

public interface ActorService {

    void save(Actor actor);

    Actor findOne(int id);

    List<Actor> findAll();

    void delete(int id);

    void update(Actor actor);



}
