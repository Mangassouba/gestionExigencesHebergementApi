package com.gestionExigencesHebergement.gestionExigencesHebergementApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionExigencesHebergement.gestionExigencesHebergementApi.model.Technologie;

public interface TechnologieRepository extends JpaRepository<Technologie, Long> {
    
} 
