package com.models;

public class CAclient {

    private int idutilisateur;

    private String nomuser;

    private String mdp;

    private String numerocompte;

    private float montant;

    private float sum;

    public CAclient(int idutilisateur, String nomuser, String mdp, String numerocompte, float montant, float sum) {
        this.idutilisateur = idutilisateur;
        this.nomuser = nomuser;
        this.mdp = mdp;
        this.numerocompte = numerocompte;
        this.montant = montant;
        this.sum = sum;
    }

    public CAclient() {
    }

    public int getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getNumerocompte() {
        return numerocompte;
    }

    public void setNumerocompte(String numerocompte) {
        this.numerocompte = numerocompte;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}
