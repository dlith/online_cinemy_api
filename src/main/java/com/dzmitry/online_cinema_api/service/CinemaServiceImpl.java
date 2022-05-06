package com.dzmitry.online_cinema_api.service;

import com.dzmitry.online_cinema_api.dao.ActorDAO;
import com.dzmitry.online_cinema_api.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService{

    @Autowired
    ActorDAO actorDAO;


    @Override
    @Transactional
    public List<Actor> getAllActors() {
        return actorDAO.getAllActors();
    }

    @Override
    @Transactional
    public void saveActor(Actor actor) {
        actorDAO.saveActor(actor);
    }

    @Override
    @Transactional
    public Actor getActor(int id) {
        return actorDAO.getActor(id);
    }

    @Override
    @Transactional
    public void deleteActor(int id) {
        actorDAO.deleteActor(id);
    }
}
