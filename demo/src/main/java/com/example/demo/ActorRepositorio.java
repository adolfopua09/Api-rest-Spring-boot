package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.yaml.snakeyaml.events.Event.ID;

public class ActorRepositorio extends JpaRepository<Actor, Integer> {
    
}
