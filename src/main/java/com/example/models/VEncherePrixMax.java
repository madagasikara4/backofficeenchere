package com.example.models;


public class VEncherePrixMax {

    private int idproduit;

    private int prix;

    public VEncherePrixMax(int idproduit, int prix) {
        this.idproduit = idproduit;
        this.prix = prix;
    }

    public VEncherePrixMax() {
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
