package com.ensias_docs.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class ElementModule {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 10)
    private String abrv;
    @Column(length = 40)
    private String nom;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_module")
    private Module module;

    @OneToMany(mappedBy = "elementModule", fetch = FetchType.LAZY)
    private Collection<Document> documents;


    @ManyToMany(mappedBy = "elementModules", fetch = FetchType.LAZY)
    private Collection<Enseignant> enseignants;

    public ElementModule() {
    }

    public ElementModule(String abrv, String nom, String description) {
        this.abrv = abrv;
        this.nom = nom;
        this.description = description;
    }

    public ElementModule(String abrv, String nom, String description, Module module) {
        this.abrv = abrv;
        this.nom = nom;
        this.description = description;
        this.module = module;
    }

    public ElementModule(String abrv, String nom, String description, Module module, Collection<Document> documents, Collection<Enseignant> enseignants) {
        this.abrv = abrv;
        this.nom = nom;
        this.description = description;
        this.module = module;
        this.documents = documents;
        this.enseignants = enseignants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Collection<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Collection<Document> documents) {
        this.documents = documents;
    }

    public Collection<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Collection<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }
}
