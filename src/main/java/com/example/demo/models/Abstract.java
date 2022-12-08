package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Objects;

@MappedSuperclass
public abstract class Abstract {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String imgAlt;
    @NotNull
    private String imgCaption;
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
    public String getImgAlt() {
        return imgAlt;
    }
    public void setImgAlt(String imgAlt) {
        this.imgAlt = imgAlt;
    }
    public String getImgCaption() {
        return imgCaption;
    }
    public void setImgCaption(String imeCaption) {
        this.imgCaption = imgCaption;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abstract that = (Abstract) o;
        return id == that.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
