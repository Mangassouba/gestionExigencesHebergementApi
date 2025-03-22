package com.gestionExigencesHebergement.gestionExigencesHebergementApi.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionExigencesHebergement.gestionExigencesHebergementApi.model.Technologie;
import com.gestionExigencesHebergement.gestionExigencesHebergementApi.repository.TechnologieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TechnologieService {
    @Autowired
    private TechnologieRepository technologieRepository;

    public List<Technologie>getAllTechnologie() {
        return technologieRepository.findAll();
    }

    public Optional <Technologie> getTechnologieById(Long id) {
        return technologieRepository.findById(id);
    }

    public Technologie createTechnologie(Technologie tech) {
        return technologieRepository.save(tech);
    }

    public void deleteTechnologie(Long id) {
        technologieRepository.deleteById(id);
    }

    
}
