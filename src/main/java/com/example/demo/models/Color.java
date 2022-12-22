package com.example.demo.models;

import jakarta.persistence.Entity;

import java.util.ArrayList;

@Entity
public class Color extends Abstract{
    private String elements;
    
    public Color() {};
    
    public String getElements() {
        return elements;
    }
    public void setElements(String elements) {
        this.elements = elements;
    }
    
    public static ArrayList<Color> findByValue(String value, Iterable<Color> allColors) {
        String valueLC = value.toLowerCase();
        ArrayList<Color> results = new ArrayList<>();
        
        for (Color color : allColors) {
            if (color.getName().toLowerCase().contains(valueLC) || color.getConcepts().toString().contains(valueLC) || color.getElements().toLowerCase().contains(valueLC) || color.getAstrology().toLowerCase().contains(valueLC) || color.toString().contains(valueLC)) {
                results.add(color);
            }
        }
        return results;
    }
}
