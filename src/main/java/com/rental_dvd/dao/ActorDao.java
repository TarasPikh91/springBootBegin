package com.rental_dvd.dao;

import com.rental_dvd.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDao extends JpaRepository<Actor, Integer> {
}
