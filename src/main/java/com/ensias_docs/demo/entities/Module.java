package com.ensias_docs.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Module {
    @Id
    @GeneratedValue
    private Long id;
    private String abrv;
    @Column(length = 50)
    private String nom;
    private Integer volumeHoraire;

    @ManyToOne
    @JoinColumn(name = "id_filiere")
    private Filiere filiere;

    @OneToMany(mappedBy = "module", fetch = FetchType.LAZY)
    private Collection<ElementModule> elementModules;

    @ManyToOne
    @JoinColumn(name = "id_semestre")
    private Semestre semestre;

    public Module(String abrv, String nom, Integer volumeHoraire, Collection<ElementModule> elementModules, Semestre semestre) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.elementModules = elementModules;
        this.semestre = semestre;
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Filiere filiere, Collection<ElementModule> elementModules, Semestre semestre) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.filiere = filiere;
        this.elementModules = elementModules;
        this.semestre = semestre;
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Semestre semestre) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.semestre = semestre;
    }

    public Module() {
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Filiere filiere) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.filiere = filiere;
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Filiere filiere, Collection<ElementModule> elementModules) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.filiere = filiere;
        this.elementModules = elementModules;
    }

    public Module(String abrv, String nom, Integer volumeHoraire) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Collection<ElementModule> elementModules) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.elementModules = elementModules;
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

    public Integer getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(Integer volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public Collection<ElementModule> getElementModules() {
        return elementModules;
    }

    public void setElementModules(Collection<ElementModule> elementModules) {
        this.elementModules = elementModules;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
}
