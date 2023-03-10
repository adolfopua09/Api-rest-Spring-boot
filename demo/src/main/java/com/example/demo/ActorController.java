/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/sakila")
public class ActorController {

    
    @Autowired
    ActorRepositorio actorRepositorio;

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }


    @GetMapping("/actor")
    public List<Actor> findAll(){
        return ActorRepositorio.findAll();
    }

    @GetMapping("/actor/{id}")
    public Optional<Actor> findById(@PathVariable Integer id){
        return ActorRepositorio.findById();
    }

    @PostMapping("/actor")
    public Actor findById(@RequestBody Actor actor){
        return ActorRepositorio.save(actor);
    }
}

