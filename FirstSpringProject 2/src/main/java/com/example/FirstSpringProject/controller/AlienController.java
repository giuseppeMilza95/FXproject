package com.example.FirstSpringProject.controller;

import com.example.FirstSpringProject.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {
    @Autowired
    UseRepository repo;

    @GetMapping("/alien")
    public List<Alien> listAll(){
        return repo.findAll();

        }

    @PostMapping(path = "/alien", consumes = {"application/json"})
    public Alien addAlien(@RequestBody Alien alien){
        repo.save(alien);
        return alien;
    }

    @GetMapping("/alien/{aid}")
    public Optional<Alien> findById(@PathVariable int aid){
        return repo.findById(aid);

    }
    

    @DeleteMapping("/alien/{aid}")
    public String delete(@PathVariable int aid){
        repo.deleteById(aid);
        return "Deleted";

    }

    @PutMapping(path = "/alien", consumes = {"application/json"})
    public Alien update(@RequestBody Alien newAlien){
        repo.save(newAlien);
        return newAlien;
    }


    }



