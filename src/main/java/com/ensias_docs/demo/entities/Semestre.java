package com.ensias_docs.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Semestre {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 4)
    private String abrv;

    @Column(length = 30)
    private String nom;

    public Semestre() {
    }

    public Semestre(String abrv, String nom) {
        this.abrv = abrv;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAbrv() {
        return abrv;
    }

    public void setAbrv(String abrv) {
        this.abrv = abrv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
