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

    @ManyToOne
    @JoinColumn(name = "id_element_module")
    private ElementModule elementModule;

    @ManyToOne
    @JoinColumn(name = "id_type_doc")
    private TypeDoc typeDoc;

    public Document(String nom, String url, TypeDoc typeDoc) {
        this.nom = nom;
        this.url = url;
        this.typeDoc = typeDoc;
    }

    public Document(String nom, String url, ElementModule elementModule, TypeDoc typeDoc) {
        this.nom = nom;
        this.url = url;
        this.elementModule = elementModule;
        this.typeDoc = typeDoc;
    }

    public Document(String nom, String url, ElementModule elementModule) {
        this.nom = nom;
        this.url = url;
        this.elementModule = elementModule;
    }

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

    public ElementModule getElementModule() {
        return elementModule;
    }

    public void setElementModule(ElementModule elementModule) {
        this.elementModule = elementModule;
    }

    public TypeDoc getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(TypeDoc typeDoc) {
        this.typeDoc = typeDoc;
    }
}
