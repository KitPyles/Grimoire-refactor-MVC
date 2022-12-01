package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

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
}
