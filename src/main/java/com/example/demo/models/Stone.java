package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity
public class Stone extends Abstract{
    private String elements;
    
    public Stone(){};
    
    public String getElements() {
        return elements;
    }
    public void setElements(String elements) {
        this.elements = elements;
    }
}
