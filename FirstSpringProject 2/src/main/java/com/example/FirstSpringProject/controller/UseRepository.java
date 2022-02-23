package com.example.FirstSpringProject.controller;

import com.example.FirstSpringProject.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;


 interface UseRepository extends JpaRepository<Alien, Integer> {

  //@Query(value = "SELECT aname from AlienDatabase where name=?1", nativeQuery = true)
  List<Alien> findByaname(String name);


}
