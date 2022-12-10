package com.example.demo.controllers;

import com.example.demo.models.Animal;
import com.example.demo.models.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("add")
public class AddController {
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
    
    @GetMapping("animal")
    public String displayAddAnimalForm(Model model) {
    model.addAttribute("title", "Add an Animal");
    model.addAttribute("animals", animalRepository.findAll());
    model.addAttribute(new Animal());
    return "animal";
    }
}
