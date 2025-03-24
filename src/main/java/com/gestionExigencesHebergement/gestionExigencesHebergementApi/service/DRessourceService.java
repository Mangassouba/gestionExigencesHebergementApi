package com.gestionExigencesHebergement.gestionExigencesHebergementApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionExigencesHebergement.gestionExigencesHebergementApi.model.DRessource;
import com.gestionExigencesHebergement.gestionExigencesHebergementApi.repository.DRessourceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DRessourceService {
    @Autowired

    private DRessourceRepository dRessourceRepository;

    public List<DRessource>getAllDRessources() {
        return dRessourceRepository.findAll();
    }

    public Optional<DRessource> getDRessourceById(Long id){
        return dRessourceRepository.findById(id);
    }

    public DRessource creationDRessource(DRessource ressource) {
        return dRessourceRepository.save(ressource);
    }

    public void deleteDRessource(Long id) {
        dRessourceRepository.deleteById(id);
    }
    
}
