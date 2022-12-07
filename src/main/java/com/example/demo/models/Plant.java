package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Plant{
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String concepts;
    @NotNull
    private String imageName;
    
    public Plant(){};
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getConcepts() {
        return concepts;
    }
    public void setConcepts(String concepts) {
        this.concepts = concepts;
    }
    public String getImageName() {
        return imageName;
    }
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    
    public static ArrayList<Plant> findByValue(String value, Iterable<Plant> allPlants) {
        String valueLC = value.toLowerCase();
        ArrayList<Plant> results = new ArrayList<>();
        
        for (Plant plant : allPlants) {
            if (plant.getName().toLowerCase().contains(valueLC)) {
                results.add(plant);
            } else if (plant.getConcepts().toLowerCase().contains(valueLC)) {
                results.add(plant);
            } else if (plant.toString().contains(valueLC)) {
                results.add(plant);
            }
        }
        return results;
    }
}