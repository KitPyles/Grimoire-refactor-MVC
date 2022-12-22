package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal extends Abstract{
    @ManyToMany
    private List<Deity> deityList = new ArrayList<>();
    
    private String elements;
    
    public Animal(){};
    
    public Animal(String name, String imageMeta, List<Concept> concepts, String astrology, List<Deity> deityList) {
        super();
        this.deityList = deityList;
    }
    public Animal(String name, String imageMeta, List<Concept> concepts, String astrology, String elements) {
        super();
        this.elements = elements;
    }
    public Animal(String name, String imageMeta, List<Concept> concepts, String astrology, List<Deity> deityList, String elements) {
        super();
        this.deityList = deityList;
        this.elements = elements;
    }
    public void setDeityList(List<Deity> deityList) {
        this.deityList = deityList;
    }
    public Iterable<Deity> getDeityList() {
        return deityList;
    }
    public String getElements() {
        return elements;
    }
    public void setElements(String elements) {
        this.elements = elements;
    }
    
    public static ArrayList<Animal> findByValue(String value, Iterable<Animal> allAnimals) {
        String valueLC = value.toLowerCase();
        ArrayList<Animal> results = new ArrayList<>();
    
        for (Animal animal : allAnimals) {
            if (animal.getName().toLowerCase().contains(valueLC) ||animal.getConcepts().toString().toLowerCase().contains(valueLC) || animal.getElements().toLowerCase().contains(valueLC) || animal.getAstrology().toLowerCase().contains(valueLC) || animal.getDeityList().toString().toLowerCase().contains(valueLC) || animal.toString().contains(valueLC)) {
                results.add(animal);
            }
        }
        return results;
    }
}
