package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@MappedSuperclass
public abstract class Abstract {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    
    private String imgAlt;
    private String imgCaption;
    @NotNull
    @ManyToMany
    private List<Concept> concepts;
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
    public List<Concept> getConcepts() {
        return concepts;
    }
    public void setConcepts(List<Concept> concepts) {
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
