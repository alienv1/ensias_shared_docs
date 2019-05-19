package com.ensias_docs.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TypeDoc {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String nom;

    public TypeDoc() {
    }

    public TypeDoc(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
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
}
