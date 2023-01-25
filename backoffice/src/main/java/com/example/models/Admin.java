package com.example.models;

public class Admin {
    private Object _id;
    private String nom;
    private String mdp;

    public Admin() {
    }

    public Admin(Object _id, String nom, String mdp) {
        this._id = _id;
        this.nom = nom;
        this.mdp = mdp;
    }

    public Object get_id() {
        return _id;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }


}