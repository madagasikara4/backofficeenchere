package com.models;

public class Commission {

    private int idcommission;
    private float commission;

    public int getIdcommission(){return idcommission;}
    public void setIdcommission(int idcommission) {
        this.idcommission = idcommission;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public Commission(int idcommission, float commission) {
        this.idcommission = idcommission;
        this.commission = commission;
    }

    public Commission(){}



    public static Commission[] findAll()throws Exception{
        String lien="/commission";
        String jsonData=AppelWS.getMethod(lien);
        Object[] objects=Data.arraytoObj(Categorie.class, jsonData);
        Commission[] commission=new Commission[objects.length];
        for(int i=0;i<objects.length;i++){
            commission[i]=(Commission) objects[i];
        }
        return commission;
    }

    public static Commission findById(int idcommission)throws Exception{
        String lien="/commission/"+idcommission;
        String jsonData=AppelWS.getMethod(lien);
        Object object=Data.maptoObj(Commission.class, jsonData);
        Commission commission=(Commission) object;
        return commission;
    }

    public void update()throws Exception{
        String lien="/commission";
        String jsonToSend=Categorie.toJsonString(this);
        String res=AppelWS.putMethod(lien, jsonToSend);
    }

}
