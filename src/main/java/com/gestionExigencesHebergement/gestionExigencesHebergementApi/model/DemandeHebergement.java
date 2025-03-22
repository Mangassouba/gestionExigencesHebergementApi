package com.gestionExigencesHebergement.gestionExigencesHebergementApi.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeHebergement {
    @Id
    @GeneratedValue

    private long id;
    private String libelle;
    private String description;
    private LocalDate date;
    private String statut;
    private String concerner;

    @ManyToOne
    private Utilisateur utilisateur;
}
