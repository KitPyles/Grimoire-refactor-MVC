package com.example.demo.controllers;

import com.example.demo.models.Deity;
import com.example.demo.models.data.DeityRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping("deities")
public class DeityController {
    @Autowired
    private DeityRepository deityRepository;
    
    @GetMapping("index")
    public String deityList(Model model){
        model.addAttribute("title","Deity Correspondences");
        model.addAttribute("deities", deityRepository.findAll());
        return "deities/index";
    }
    @GetMapping("view/{deityId}")
    public String displayViewDeity(Model model, @PathVariable int deityId) {
        Optional optDeity = deityRepository.findById(deityId);
        if (optDeity.isPresent()) {
            Deity deity = (Deity) optDeity.get();
            model.addAttribute("deity", deity);
            return "deities/view";
        } else {
            return "redirect:../";
        }
    }
    
    @GetMapping("add")
    public String displayAddDeityForm(Model model) {
        model.addAttribute("title", "Add an Deity");
        model.addAttribute("deities", deityRepository.findAll());
        model.addAttribute(new Deity());
        return "deities/add";
    }
    
    @PostMapping("add")
    public String processAddDeityForm(@ModelAttribute @Valid Deity newDeity,
                                       Errors errors, Model model) {
        
        if (errors.hasErrors()) {
            return "deities/add";
        }
        
        deityRepository.save(newDeity);
        return "deities/index";
    }
}