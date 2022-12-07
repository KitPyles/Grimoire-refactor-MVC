package com.example.demo.controllers;

import com.example.demo.models.*;
import com.example.demo.models.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("search")
public class SearchController {
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private ColorRepository colorRepository;
    @Autowired
    private DeityRepository deityRepository;
    @Autowired
    private PlantRepository plantRepository;
    @Autowired
    private SpellRepository spellRepository;
    @Autowired
    private StoneRepository stoneRepository;
    @Autowired
    private TimeRepository timeRepository;
    
    @PostMapping("results")
    public String displaySearchResults(Model model, @RequestParam String searchTerm) {
        Iterable<Animal> animals = Animal.findByValue(searchTerm, animalRepository.findAll());
        Iterable<Color> colors = Color.findByValue(searchTerm, colorRepository.findAll());
        Iterable<Deity> deities = Deity.findByValue(searchTerm, deityRepository.findAll());
        Iterable<Plant> plants = Plant.findByValue(searchTerm, plantRepository.findAll());
        Iterable<Spell> spells = Spell.findByValue(searchTerm, spellRepository.findAll());
        Iterable<Stone> stones = Stone.findByValue(searchTerm, stoneRepository.findAll());
        Iterable<Time> times = Time.findByValue(searchTerm, timeRepository.findAll());
        model.addAttribute("title","Search for: " + searchTerm);
        model.addAttribute("animals", animals);
        model.addAttribute("colors", colors);
        model.addAttribute("deities", deities);
        model.addAttribute("plants", plants);
        model.addAttribute("spells", spells);
        model.addAttribute("stones", stones);
        model.addAttribute("times", times);
        return "search";
    }
}
