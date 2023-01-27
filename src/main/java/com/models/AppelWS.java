package com.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AppelWS {
    private static String url="https://webservice-production-6ef4.up.railway.app";

    public static String postMethod(String urlString,String requestBody)throws Exception{
        URL url = new URL(AppelWS.url+urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.connect();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(requestBody.getBytes());
        outputStream.flush();
        outputStream.close();

        int statusCode = connection.getResponseCode();
        if (statusCode != 200) {
            throw new Exception("Error: HTTP Status Code: " + statusCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        return response.toString();
    }

    public static String getMethod(String urlString)throws Exception{
        URL url = new URL(AppelWS.url+urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    public static String putMethod(String urlString,String requestBody)throws Exception{
        URL url = new URL(AppelWS.url+urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.connect();

        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(requestBody.getBytes());
        outputStream.flush();
        outputStream.close();

        int statusCode = connection.getResponseCode();
        if (statusCode != 200) {
            throw new Exception("Error: HTTP Status Code: " + statusCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }



}
