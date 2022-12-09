package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;
import java.util.ArrayList;

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
    @NotNull
    private String symbols;
    @NotNull
    private String imgName;
    @NotNull
    private String imgAlt;
    @NotNull
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
    public String getSymbols() {
        return symbols;
    }
    public void setSymbols(String symbols) {
        this.symbols = symbols;
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
            if (deity.getName().toLowerCase().contains(valueLC)) {
                results.add(deity);
            } else if (deity.getBailiwick().toLowerCase().contains(valueLC)) {
                results.add(deity);
            } else if (deity.getSymbols().toLowerCase().contains(valueLC)) {
                results.add(deity);
            } else if (deity.getOfferings().toLowerCase().contains(valueLC)) {
                results.add(deity);
            } else if (deity.getPantheon().toLowerCase().contains(valueLC)) {
                results.add(deity);
            } else if (deity.toString().contains(valueLC)) {
                results.add(deity);
            }
        }
        return results;
    }
}
