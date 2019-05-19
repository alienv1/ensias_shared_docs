package com.ensias_docs.demo.entities;

import javax.persistence.*;

@Entity
public class Document {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 30)
    private String nom;
    private String url;

    public Document(String nom, String url) {
        this.nom = nom;
        this.url = url;
    }

    public Document() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
