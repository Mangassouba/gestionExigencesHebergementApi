package com.gestionExigencesHebergement.gestionExigencesHebergementApi.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class DRessource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String CPU;
    private String RAM;
    private String STOCK;
    
}
