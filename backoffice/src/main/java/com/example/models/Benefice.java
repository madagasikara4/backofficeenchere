package com.example.models;

public class Benefice {

    private int idbenefice;
    private int idproduit;
    private float valeur;

    public Benefice() {
    }

    public Benefice(int idbenefice, int idproduit, float valeur) {
        this.idbenefice = idbenefice;
        this.idproduit = idproduit;
        this.valeur = valeur;
    }

    public static float getValeurBenefice()throws Exception{
        Benefice[] benef=Benefice.getAllBenefice();
        float val=0;
        for (int i = 0; i < benef.length; i++) {
            val+=benef[i].getValeur();
        }
        return val;
    }

    public static Benefice[] getAllBenefice()throws Exception{
        String lien="/benefices";
        String jsonData=AppelWS.getMethod(lien);
        Object[] objects=Data.arraytoObj(Categorie.class, jsonData);
        Benefice[] commission=new Benefice[objects.length];
        for(int i=0;i<objects.length;i++){
            commission[i]=(Benefice) objects[i];
        }
        return commission;
    }

    public int getIdbenefice() {
        return idbenefice;
    }

    public int getIdBenefice() {
        return idbenefice;
    }

    public void setIdbenefice(int idbenefice) {
        this.idbenefice = idbenefice;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
}
