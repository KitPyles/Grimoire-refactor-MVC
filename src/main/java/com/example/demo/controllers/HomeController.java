package com.example.demo.controllers;

import com.example.demo.models.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {
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
    
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title","Grimoire");
        return "index";
    }
}
