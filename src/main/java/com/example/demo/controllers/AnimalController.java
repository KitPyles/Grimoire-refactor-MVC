package com.example.demo.controllers;

import com.example.demo.models.Animal;
import com.example.demo.models.data.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("animals")
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public Animal getAnimal(@PathVariable int id){
        return findAnimalById(id);
    };
    
    private Animal findAnimalById(int id) {
        Optional animalTest = animalRepository.findById(id);
        if(animalTest.isPresent()) {
            Animal animal = (Animal) animalTest.get();
            return animal;
        } else {
            return;
        }
    };
}
