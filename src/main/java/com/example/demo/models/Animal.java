package com.example.demo.models;

import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Animal extends Abstract{
    @NotNull
    private String imageName;
    
    @NotNull
    private String concepts;
    
    @ManyToMany
    private final List<Deity> deityList = new ArrayList<>();
    
    public String getImageName() {
        return imageName;
    }
    
    public void setImageName(String concepts) {
        this.imageName = imageName;
    }
    
    public String getConcepts() {
        return concepts;
    }
    
    public void setConcepts(String concepts) {
        this.concepts = concepts;
    }
    
    public List<Deity> getDeityList() {
        return deityList;
    }
}
