package com.ensias_docs.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Filiere implements Serializable {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 6)
    private String abrv;

    @Column(length = 50)
    private String nom;
    private String description;

    public Filiere(String abrv, String nom, String description) {
        this.abrv = abrv;
        this.nom = nom;
        this.description = description;
    }

    public Filiere() {
    }

    public Filiere(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAbrv() {
        return abrv;
    }

    public void setAbrv(String abrv) {
        this.abrv = abrv;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
