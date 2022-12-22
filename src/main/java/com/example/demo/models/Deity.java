package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Deity{
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String bailiwick;
    @NotNull
    private String pantheon;
    @NotNull
    private String offerings;
    @ManyToMany
    private List<Concept> symbols;
    @ManyToMany
    private List<Animal> animalSymbols;
    private String imgName;
    private String imgAlt;
    private String imgCaption;
    private String personal;
    
    public Deity(){};
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBailiwick() {
        return bailiwick;
    }
    public void setBailiwick(String bailiwick) {
        this.bailiwick = bailiwick;
    }
    public String getPantheon() {
        return pantheon;
    }
    public void setPantheon(String pantheon) {
        this.pantheon = pantheon;
    }
    public String getOfferings() {
        return offerings;
    }
    public void setOfferings(String offerings) {
        this.offerings = offerings;
    }
    public List<Concept> getSymbols() {
        return symbols;
    }
    public void setSymbols(List<Concept> symbols) {
        this.symbols = symbols;
    }
    public List<Animal> getAnimalSymbols() {
        return animalSymbols;
    }
    public void setAnimalSymbols(List<Animal> animalSymbols) {
        this.animalSymbols = animalSymbols;
    }
    public String getImgName() {
        return imgName;
    }
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
    public String getImgAlt() {
        return imgAlt;
    }
    public void setImgAlt(String imgAlt) {
        this.imgAlt = imgAlt;
    }
    public String getPersonal() {
        return personal;
    }
    public void setPersonal(String personal) {
        this.personal = personal;
    }
    public String getImgCaption() {
        return imgCaption;
    }
    public void setImgCaption(String imgCaption) {
        this.imgCaption = imgCaption;
    }
    
    public static ArrayList<Deity> findByValue(String value, Iterable<Deity> allDeities) {
        String valueLC = value.toLowerCase();
        ArrayList<Deity> results = new ArrayList<>();
        
        for (Deity deity : allDeities) {
            if (deity.getName().toLowerCase().contains(valueLC) || deity.getBailiwick().toLowerCase().contains(valueLC) || deity.getSymbols().toString().contains(valueLC) || deity.getOfferings().toLowerCase().contains(valueLC) || deity.getPantheon().toLowerCase().contains(valueLC) ||deity.toString().contains(valueLC)) {
                results.add(deity);
            }
        }
        return results;
    }
}
