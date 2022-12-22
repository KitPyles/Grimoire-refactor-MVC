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
    private List<SpellComponent> components = new ArrayList<>();
    @NotNull
    private List<SpellStep> steps = new ArrayList<>();
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
    public List<SpellComponent> getComponents() {
        return components;
    }
    public void setComponents(List<SpellComponent> components) {
        this.components = components;
    }
    public List<SpellStep> getSteps() {
        return steps;
    }
    public void setSteps(List<SpellStep> steps) {
        this.steps = steps;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public static ArrayList<Spell> findByValue(String value, Iterable<Spell> allSpells) {
        String valueLC = value.toLowerCase();
        ArrayList<Spell> results = new ArrayList<>();
        
        for (Spell spell : allSpells) {
            if (spell.getName().toLowerCase().contains(valueLC) || spell.getComponents().toString().toLowerCase().contains(valueLC) || spell.getSteps().toString().toLowerCase().contains(valueLC) || spell.toString().contains(valueLC)) {
                results.add(spell);
            }
        }
        return results;
    }
}
