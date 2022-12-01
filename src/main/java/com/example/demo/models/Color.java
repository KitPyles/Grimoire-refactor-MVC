package com.example.demo.models;

import jakarta.persistence.Entity;

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
}
