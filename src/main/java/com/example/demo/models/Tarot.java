package com.example.demo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;


import java.util.List;

public class Tarot {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
//    # & Name for Major Arcana, # & Suit for Minor Arcana
    private String name;
    @NotNull
    private String deck;
    @NotNull
    private String intuitiveMeaning;
    @NotNull
    private String bookMeaning;
    private String reversedMeaning;

    private List<Animal> animalSymbols;
    private List<Concept> conceptSymbols;
}
