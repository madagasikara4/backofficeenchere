package com.models;


public class Photo {
    private Object id;
    private int idproduit;
    private String[] image;

    public Photo() {
    }

    public Photo(Object id, int idproduit, String[] image) {
        this.id = id;
        this.idproduit = idproduit;
        this.image = image;
    }

    public static Photo[] getPhotoById(VProduit[] produits)throws Exception{
        Photo[] photos=new Photo[produits.length];
        for (int i = 0; i < photos.length; i++) {
            String jsonData=AppelWS.getMethod("/photo/"+produits[i].getIdproduit());
            Object objects=Data.maptoObj( Photo.class,jsonData);
            photos[i]=(Photo) objects;
        }
        return photos;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String[] getImage() {
        return image;
    }

    public void setImage(String[] image) {
        this.image = image;
    }
}
