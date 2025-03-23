package com.gestionExigencesHebergement.gestionExigencesHebergementApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionExigencesHebergement.gestionExigencesHebergementApi.service.TechnologieService;
import com.gestionExigencesHebergement.gestionExigencesHebergementApi.model.Technologie;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/technologie")
public class TechnologieController {
    @Autowired
    private TechnologieService technologieService;


    @GetMapping
    public List<Technologie>getAllTechnologie() {
        return technologieService.getAllTechnologie();
    }

    @GetMapping("/{id}")
    public Optional<Technologie>getTechnologieById(@PathVariable Long id){
        return technologieService.getTechnologieById(id);
    }

    @PostMapping
    public Technologie createTechnologie(@RequestBody Technologie tech){
        return technologieService.createTechnologie(tech);
    }

    @DeleteMapping
    public void delTechnologie(@PathVariable Long id){
        technologieService.deleteTechnologie(id);
    }


}
