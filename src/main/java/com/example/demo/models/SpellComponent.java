package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class SpellComponent {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String component;
    
    public int getId() {
        return id;
    }
    public String getComponent() {
        return component;
    }
    public void setComponent(String component) {
        this.component = component;
    }
}
