package com.example.models;
public class VRechargement {

    private int idrechargement;

    private int idutilisateur;

    private String nomuser;

    private String mdp;

    private String numerocompte;

    private int montant;

    private int recharge;

    private int etat;

    public VRechargement() {
    }

    public VRechargement(int idutilisateur, String nomuser, String mdp, String numerocompte, int montant, int recharge, int etat) {
        this.idutilisateur = idutilisateur;
        this.nomuser = nomuser;
        this.mdp = mdp;
        this.numerocompte = numerocompte;
        this.montant = montant;
        this.recharge = recharge;
        this.etat = etat;
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

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getRecharge() {
        return recharge;
    }

    public void setRecharge(int recharge) {
        this.recharge = recharge;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getIdrechargement() {
        return idrechargement;
    }

    public void setIdrechargement(int idrechargement) {
        this.idrechargement = idrechargement;
    }
}
