package com.example.demo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Objects;

public class Concept {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String meaning;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concept concept1 = (Concept) o;
        return id == concept1.id && Objects.equals(name, concept1.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
