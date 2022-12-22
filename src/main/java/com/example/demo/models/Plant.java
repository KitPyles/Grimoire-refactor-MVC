package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;

@Entity
public class Plant{
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @Size(max = 300)
    private String name;
    @NotNull
    @Size(max = 650)
    private String uses;
    @NotNull
    private String imgName;
    @NotNull
    @Size(max = 500)
    private String imgAlt;
    @NotNull
    @Size(max = 500)
    private String imgCaption;
    
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
    public String getUses() {
        return uses;
    }
    public void setUses(String uses) {
        this.uses = uses;
    }
    public String getImageName() {
        return imgName;
    }
    public void setImageName(String imgName) {
        this.imgName = imgName;
    }
    public String getImgAlt() {
        return imgAlt;
    }
    public void setImgAlt(String imgAlt) {
        this.imgAlt = imgAlt;
    }
    public String getImgCaption() {
        return imgCaption;
    }
    public void setImgCaption(String imgCaption) {
        this.imgCaption = imgCaption;
    }
    
    public static ArrayList<Plant> findByValue(String value, Iterable<Plant> allPlants) {
        String valueLC = value.toLowerCase();
        ArrayList<Plant> results = new ArrayList<>();
        
        for (Plant plant : allPlants) {
            if (plant.getName().toLowerCase().contains(valueLC) || plant.getUses().toLowerCase().contains(valueLC) || plant.toString().contains(valueLC)) {
                results.add(plant);
            }
        }
        return results;
    }
}