package com.models;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Data {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Data(Object data) {
        this.data = data;
    }

    public Data(){}

    public static Object[] arraytoObj(Class cl,String json)throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Data obj = mapper.readValue(json, Data.class);
        ArrayList recharge=(ArrayList) obj.getData();
        Object[] val=new Object[recharge.size()];
        for (int i = 0; i < recharge.size(); i++) {
            String str = mapper.writeValueAsString(recharge.get(i));
            val[i]=mapper.readValue(str,cl);
        }
        return val;
    }

    public static Object maptoObj(Class cl,String json)throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Data obj = mapper.readValue(json, Data.class);
        LinkedHashMap recharge=(LinkedHashMap) obj.getData();
        Object val=mapper.convertValue(recharge,cl);
        return val;
    }

    public static Object toObj(String json)throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Data obj = mapper.readValue(json, Data.class);
        return obj.getData();
    }



}
