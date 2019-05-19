package com.ensias_docs.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module {
    @Id
    private String id;

    @Column(length = 50)
    private String nom;
    private Integer volumeHoraire;

    public Module(String id, String nom, Integer volumeHoraire) {
        this.id = id;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
    }

    public Module() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(Integer volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }
}
