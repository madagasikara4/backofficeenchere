package com.models;


public class CAcategorie {

    private int idcategorie;

    private String nomcategorie;

    private int sum;

    public CAcategorie() {
    }

    public CAcategorie(int idcategorie, String nomcategorie, int sum) {
        this.idcategorie = idcategorie;
        this.nomcategorie = nomcategorie;
        this.sum = sum;
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getNomcategorie() {
        return nomcategorie;
    }

    public void setNomcategorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
