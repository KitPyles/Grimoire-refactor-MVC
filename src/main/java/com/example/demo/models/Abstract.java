package com.example.demo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

@MappedSuperclass
public abstract class Abstract {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String imageName;
    @NotNull
    private String concepts;
    private String astrology;
    
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
    public String getAstrology() {
        return astrology;
    }
    public void setAstrology(String astrology) {
        this.astrology = astrology;
    }
}
