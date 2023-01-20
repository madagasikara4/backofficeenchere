package com.example.models;

public class Rechargement {

    private int idrechargement;

    private String numerocompte;

    private int montant;

    private int etat;

    public Rechargement(int idrechargement, String numerocompte, int montant, int etat) {
        this.idrechargement = idrechargement;
        this.numerocompte = numerocompte;
        this.montant = montant;
        this.etat = etat;
    }

    public Rechargement() {
    }

    public int getIdrechargement() {
        return idrechargement;
    }

    public void setIdrechargement(int idrechargement) {
        this.idrechargement = idrechargement;
    }

    public String getNumerocompte() {
        return numerocompte;
    }

    public void setNumerocompte(String numerocompte) {
        this.numerocompte = numerocompte;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
