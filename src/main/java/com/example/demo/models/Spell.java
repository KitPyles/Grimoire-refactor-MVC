package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Spell {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private List<String> components = new ArrayList<>();
    @NotNull
    private List<String> steps = new ArrayList<>();
    @NotNull
    private String category;
    
    public Spell(){};
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getComponents() {
        return components;
    }
    public void setComponents(List<String> components) {
        this.components = components;
    }
    public List<String> getSteps() {
        return steps;
    }
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
