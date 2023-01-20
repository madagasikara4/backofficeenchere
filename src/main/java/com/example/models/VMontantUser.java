package com.example.models;

public class VMontantUser {

    private int idutilisateur;
    private int montant;

    public VMontantUser() {
    }

    public VMontantUser(int idutilisateur, int montant) {
        this.idutilisateur = idutilisateur;
        this.montant = montant;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
