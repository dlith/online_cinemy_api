package com.dzmitry.online_cinema_api.dao;

import com.dzmitry.online_cinema_api.entity.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ActorDAOImpl implements ActorDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Actor> getAllActors() {
        Query query = entityManager.createQuery(" from Actor");
        return query.getResultList();
    }

    @Override
    public void saveActor(Actor actor) {

    }

    @Override
    public Actor getActor(int id) {
        return null;
    }

    @Override
    public void deleteActor(int id) {

    }
}
