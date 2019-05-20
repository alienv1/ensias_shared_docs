package com.ensias_docs.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Semestre {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 4)
    private String abrv;

    @Column(length = 30)
    private String nom;

    @OneToMany(mappedBy = "semestre", fetch = FetchType.LAZY)
    private Collection<Module> modules;

    public Semestre(String abrv, String nom, Collection<Module> modules) {
        this.abrv = abrv;
        this.nom = nom;
        this.modules = modules;
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Module> getModules() {
        return modules;
    }

    public void setModules(Collection<Module> modules) {
        this.modules = modules;
    }
}
