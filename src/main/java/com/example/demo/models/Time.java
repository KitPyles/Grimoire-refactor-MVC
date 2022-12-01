package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Time {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    private String astrology;
    private List<Color> colorList = new ArrayList<>();
    private List<Deity> deityList = new ArrayList<>();
    
    public Time (){};
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAstrology() {
        return astrology;
    }
    public void setAstrology(String astrology) {
        this.astrology = astrology;
    }
    public List<Color> getColorList() {
        return colorList;
    }
    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }
    public List<Deity> getDeityList() {
        return deityList;
    }
    public void setDeityList(List<Deity> deityList) {
        this.deityList = deityList;
    }
}
