package com.ensias_docs.demo.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class TypeDoc {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String nom;

    @OneToMany(mappedBy = "elementModule", fetch = FetchType.LAZY)
    private Collection<Document> documents;

    public TypeDoc(String nom, Collection<Document> documents) {
        this.nom = nom;
        this.documents = documents;
    }

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

    public Collection<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Collection<Document> documents) {
        this.documents = documents;
    }
}
