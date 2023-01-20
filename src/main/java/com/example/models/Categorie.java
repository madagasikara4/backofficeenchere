package com.example.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Categorie {
    private int idcategorie;
    private String nomcategorie;

    public Categorie(){}

    public Categorie(int idcategorie, String nomCategorie) {
        this.setIdcategorie(idcategorie);
        this.setNomCategorie(nomCategorie);
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getNomCategorie() {
        return nomcategorie;
    }

    public void setNomCategorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }
    
    public static Categorie[] findAll()throws Exception{
        Categorie[] categories=null;
        String jsonData=AppelWS.getMethod("/categories");
        Object[] objects=Data.arraytoObj(Categorie.class, jsonData);
        categories=new Categorie[objects.length];
        for(int i=0;i<objects.length;i++){
            categories[i]=(Categorie) objects[i];
        }
        return categories;
    }
    
    public static Categorie findById(int idCategorie)throws Exception{
        Categorie categorie=null;
        String lien="/categories/"+idCategorie;
        String jsonData=AppelWS.getMethod(lien);
        Object object=Data.toObj(jsonData);
        categorie=(Categorie) object;
        return categorie;
    }
        
    public static String toJsonString(Object o) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(o);
    }
    
    public void save()throws Exception{
        String jsonData=toJsonString(this);
        String lien="/categories";
        String result=AppelWS.postMethod(lien, jsonData);
    }
    
    public void update()throws Exception{
        String jsonData=toJsonString(this);
        String lien="/categories";
        String result=AppelWS.putMethod(lien, jsonData);
    }
    
}
