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
    @NotNull
    private String concepts;
    private String astrology;
    private List<Integer> colorList = new ArrayList<>();
    private List<Integer> deityList = new ArrayList<>();
    
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
    public List<Integer> getColorList() {
        return colorList;
    }
    public void setColorList(List<Integer> colorList) {
        this.colorList = colorList;
    }
    public List<Integer> getDeityList() {
        return deityList;
    }
    public void setDeityList(List<Integer> deityList) {
        this.deityList = deityList;
    }
    
    public static ArrayList<Time> findByValue(String value, Iterable<Time> allTimes) {
        String valueLC = value.toLowerCase();
        ArrayList<Time> results = new ArrayList<>();
        
        for (Time time : allTimes) {
            if (time.getName().toLowerCase().contains(valueLC)) {
                results.add(time);
            } else if (time.getConcepts().toLowerCase().contains(valueLC)) {
                results.add(time);
            } else if (time.getAstrology().toLowerCase().contains(valueLC)) {
                results.add(time);
            } else if (time.getDeityList().toString().toLowerCase().contains(valueLC)) {
                results.add(time);
            } else if (time.toString().contains(valueLC)) {
                results.add(time);
            }
        }
        return results;
    }
}
