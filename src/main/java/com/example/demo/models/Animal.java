package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal extends Abstract{
    @ManyToMany
    private final List<Deity> deityList = new ArrayList<>();
    private String elements;
    private String astrology;
    
    public Animal(){};
    
    public List<Deity> getDeityList() {
        return deityList;
    }
    public String getElements() {
        return elements;
    }
    public void setElements(String elements) {
        this.elements = elements;
    }
    public String getAstrology() {
        return astrology;
    }
    public void setAstrology(String astrology) {
        this.astrology = astrology;
    }
}
