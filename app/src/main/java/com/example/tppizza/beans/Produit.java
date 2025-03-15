package com.example.tppizza.beans;

public class Produit {

    private int id;
    private String nom;
    private int nbrIngredients;

    private int photo;
    private String duree;
    private String detailsIngred;
    private String description;
    private String Preparation;
    private static int comp = 0;

    public Produit() {
        this.id=comp++;
        this.nom = "";
        this.nbrIngredients = 0;
        this.photo = 0;
        this.duree = "";
        this.detailsIngred = "";
        this.description = "";
        Preparation = "";
    }

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detailsIngred, String description, String preparation) {
        this.id=comp++;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        Preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return Preparation;
    }

    public void setPreparation(String preparation) {
        Preparation = preparation;
    }
}
