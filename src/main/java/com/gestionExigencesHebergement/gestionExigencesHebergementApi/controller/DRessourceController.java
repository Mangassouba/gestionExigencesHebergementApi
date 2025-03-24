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

import com.gestionExigencesHebergement.gestionExigencesHebergementApi.service.DRessourceService;
import com.gestionExigencesHebergement.gestionExigencesHebergementApi.model.DRessource;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dressource")
public class DRessourceController {
    @Autowired

    private DRessourceService dRessourceService;

    @GetMapping
    public List<DRessource>getAllDRessources() {
        return  dRessourceService.getAllDRessources();
    }

    @GetMapping("/{id}")
    public Optional<DRessource>getDRessourceById(@PathVariable Long id) {
        return dRessourceService.getDRessourceById(id);
    }

    @PostMapping
    public DRessource creatRessource(@RequestBody DRessource ressource) {
        return dRessourceService.creationDRessource(ressource);
    }

    @DeleteMapping
    public void delDRessource(@PathVariable Long id) {
        dRessourceService.deleteDRessource(id);
    }
}
