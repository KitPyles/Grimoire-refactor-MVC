package com.example.demo.controllers;

import com.example.demo.models.data.SpellComponentRepository;
import com.example.demo.models.data.SpellRepository;
import com.example.demo.models.data.SpellStepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spells")
public class SpellController {
    @Autowired
    private SpellRepository spellRepository;
    @Autowired
    private SpellStepRepository spellStepRepository;
    @Autowired
    private SpellComponentRepository spellComponentRepository;
    
    
}
