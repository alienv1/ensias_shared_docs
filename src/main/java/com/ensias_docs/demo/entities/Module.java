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

    @ManyToMany(mappedBy = "modules", fetch = FetchType.LAZY)
    private Collection<Filiere> filieres;

    @OneToMany(mappedBy = "module", fetch = FetchType.LAZY)
    private Collection<ElementModule> elementModules;

    @ManyToOne
    @JoinColumn(name = "id_semestre")
    private Semestre semestre;

    @ManyToOne
    @JoinColumn(name = "id_responsable")
    private Enseignant responsable;

    public Module() {
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Semestre semestre) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.semestre = semestre;
    }

    public Module(String abrv, String nom, Integer volumeHoraire) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Enseignant responsable) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.responsable = responsable;
    }

    public Module(String abrv, String nom, Integer volumeHoraire, Collection<Filiere> filieres, Collection<ElementModule> elementModules, Semestre semestre, Enseignant responsable) {
        this.abrv = abrv;
        this.nom = nom;
        this.volumeHoraire = volumeHoraire;
        this.filieres = filieres;
        this.elementModules = elementModules;
        this.semestre = semestre;
        this.responsable = responsable;
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

    public Collection<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(Collection<Filiere> filieres) {
        this.filieres = filieres;
    }

    public Collection<ElementModule> getElementModules() {
        return elementModules;
    }

    public void setElementModules(Collection<ElementModule> elementModules) {
        this.elementModules = elementModules;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseignant responsable) {
        this.responsable = responsable;
    }
}
