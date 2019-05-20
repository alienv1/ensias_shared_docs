package com.ensias_docs.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Enseignant {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String nom;
    @Column(length = 30)
    private String prenom;
    private String email;

    @OneToMany(mappedBy = "responsable", fetch = FetchType.LAZY)
    private Collection<Module> modules; //ce prof est responsable de ces modules
    public Enseignant() {
    }

    public Enseignant(String nom, String prenom, String email, Collection<Module> modules) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.modules = modules;
    }

    public Enseignant(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Module> getModules() {
        return modules;
    }

    public void setModules(Collection<Module> modules) {
        this.modules = modules;
    }
}
