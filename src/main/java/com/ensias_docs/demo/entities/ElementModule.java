package com.ensias_docs.demo.entities;

import javax.persistence.*;

@Entity
public class ElementModule {
    @Id
    private String id;

    @Column(length = 40)
    private String nom;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_module")
    private Module module;

    public ElementModule() {
    }

    public ElementModule(String id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public ElementModule(String id, String nom, String description, Module module) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.module = module;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
