package com.example.models;

import java.util.Date;

public class VProduit {
    private int idproduit;
    private String nomproduit;
    private int idutilisateur;
    private int idcategorie;
    private String descri;
    private int prixenchere;
    private int prixmin;
    private int duree;
    private Date debut;
    private int statut;
    private String nomcategorie;

    public VProduit(int idproduit, String nomproduit, int idUtilisateur, int idcategorie, String descri, int prixenchere, int prixmin, int duree, Date debut, int statut, String nomcategorie) {
        this.idproduit = idproduit;
        this.nomproduit = nomproduit;
        this.idutilisateur = idUtilisateur;
        this.idcategorie = idcategorie;
        this.descri = descri;
        this.prixenchere = prixenchere;
        this.prixmin = prixmin;
        this.duree = duree;
        this.debut = debut;
        this.statut = statut;
        this.nomcategorie = nomcategorie;
    }

    public VProduit() {
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String getNomproduit() {
        return nomproduit;
    }

    public void setNomproduit(String nomproduit) {
        this.nomproduit = nomproduit;
    }

    public int getIdUtilisateur() {
        return idutilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idutilisateur = idUtilisateur;
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public int getPrixenchere() {
        return prixenchere;
    }

    public void setPrixenchere(int prixenchere) {
        this.prixenchere = prixenchere;
    }

    public int getPrixmin() {
        return prixmin;
    }

    public void setPrixmin(int prixmin) {
        this.prixmin = prixmin;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public String getNomcategorie() {
        return nomcategorie;
    }

    public void setNomcategorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }
    
    public static VProduit[] findValideByCategorie(int idcategorie)throws Exception{
        VProduit[] liste=null;
        String lien="/produits/bycategorie/"+idcategorie;
        String jsonData=AppelWS.getMethod(lien);
        Object[] objects=Data.arraytoObj(VProduit.class, jsonData);
        liste=new VProduit[objects.length];
        for(int i=0;i<objects.length;i++){
            liste[i]=(VProduit) objects[i];
        }
        return liste;
    }
    
}
