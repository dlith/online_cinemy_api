package com.dzmitry.online_cinema_api.controller;

import com.dzmitry.online_cinema_api.entity.Actor;
import com.dzmitry.online_cinema_api.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CinemaRestController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/actors")
    public List<Actor> showAllActors(){
        return cinemaService.getAllActors();
    }

    @GetMapping("/actors/{id}")
    public Actor getActor(@PathVariable int id){
        return cinemaService.getActor(id);
    }

    @PostMapping("/actors")
    public Actor addNewActor(@RequestBody Actor actor){
        cinemaService.saveActor(actor);
        return actor;
    }

    @PutMapping("/actors")
    public Actor updateActor(@RequestBody Actor actor){
        cinemaService.saveActor(actor);
        return actor;
    }

    @DeleteMapping("/actors/{id}")
    public String deleteEmployee(@PathVariable int id){
        cinemaService.deleteActor(id);
        return "Actor with ID = " + id + " wsa deleted";
    }
}
