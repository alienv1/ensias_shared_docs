package com.ensias_docs.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Filiere implements Serializable {
    @Id @GeneratedValue
    private Long id;

    @Column(length = 6)
    private String abrv;

    @Column(length = 50)
    private String nom;
    private String description;

    @OneToMany(mappedBy = "filiere", fetch = FetchType.LAZY)
    private Collection<Module> modules;

    public Filiere(String abrv, String nom, String description, Collection<Module> modules) {
        this.abrv = abrv;
        this.nom = nom;
        this.description = description;
        this.modules = modules;
    }

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

    public Collection<Module> getModules() {
        return modules;
    }

    public void setModules(Collection<Module> modules) {
        this.modules = modules;
    }
}
