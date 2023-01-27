package com.models;

import java.util.Date;

public class Bloquage {

    private int idbloquage;

    private int idproduit;

    private int idutilisateur;

    private int prix;

    private Date datemise;

    public int getIdbloquage() {
        return idbloquage;
    }

    public void setIdbloquage(int idbloquage) {
        this.idbloquage = idbloquage;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDatemise() {
        return datemise;
    }

    public void setDatemise(Date datemise) {
        this.datemise = datemise;
    }
}
