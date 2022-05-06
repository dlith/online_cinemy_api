package com.dzmitry.online_cinema_api.dao;

import com.dzmitry.online_cinema_api.entity.Actor;

import java.util.List;

public interface ActorDAO {

    public List<Actor> getAllActors();
    public void saveActor(Actor actor);
    public Actor getActor(int id);
    public void deleteActor(int id);
}
