package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Stone extends Abstract{
    private String elements;
    @ManyToMany
    private List<Deity> deityList = new ArrayList<>();
    
    public Stone(){};
    
    public String getElements() {
        return elements;
    }
    public void setElements(String elements) {
        this.elements = elements;
    }
    public List<Deity> getDeityList() {
        return deityList;
    }
    public void setDeityList(List<Deity> deityList) {
        this.deityList = deityList;
    }
    
    public static ArrayList<Stone> findByValue(String value, Iterable<Stone> allStones) {
        String valueLC = value.toLowerCase();
        ArrayList<Stone> results = new ArrayList<>();
        
        for (Stone stone : allStones) {
            if (stone.getName().toLowerCase().contains(valueLC)) {
                results.add(stone);
            } else if (stone.getConcepts().toLowerCase().contains(valueLC)) {
                results.add(stone);
            } else if (stone.getElements().toLowerCase().contains(valueLC)) {
                results.add(stone);
            } else if (stone.getAstrology().toLowerCase().contains(valueLC)) {
                results.add(stone);
            } else if (stone.getDeityList().toString().toLowerCase().contains(valueLC)) {
                results.add(stone);
            } else if (stone.toString().contains(valueLC)) {
                results.add(stone);
            }
        }
        return results;
    }
}