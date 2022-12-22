package com.example.demo.controllers;

import com.example.demo.models.Animal;
import com.example.demo.models.data.AnimalRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping("animals")
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;
    
     @GetMapping("index")
    public String animalList(Model model){
        model.addAttribute("title","Animal Correspondences");
        model.addAttribute("animals", animalRepository.findAll());
        return "animals/index";
    }
    @GetMapping("view/{animalId}")
    public String displayViewAnimal(Model model, @PathVariable int animalId) {
        Optional optAnimal = animalRepository.findById(animalId);
        if (optAnimal.isPresent()) {
            Animal animal = (Animal) optAnimal.get();
            model.addAttribute("animal", animal);
            return "animals/view";
        } else {
            return "redirect:../";
        }
    }
    
    @GetMapping("add")
    public String displayAddAnimalForm(Model model) {
        model.addAttribute("title", "Add an Animal");
        model.addAttribute("animals", animalRepository.findAll());
        model.addAttribute(new Animal());
        return "animals/add";
    }
    
    @PostMapping("add")
    public String processAddAnimalForm(@ModelAttribute @Valid Animal newAnimall,
                                      Errors errors, Model model) {
        
        if (errors.hasErrors()) {
            return "animals/add";
        }
        
        animalRepository.save(newAnimall);
        return "animals/index";
    }
}
