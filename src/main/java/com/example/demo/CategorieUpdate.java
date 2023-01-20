/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.models.Categorie;

@WebServlet(name = "CategorieUpdate", value = "/CategorieUpdate")
public class CategorieUpdate extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        try{
            String idc=request.getParameter("idc");
            String nom=request.getParameter("nom");
            Categorie categ=new Categorie(Integer.parseInt(idc), nom);
            request.setAttribute("categorie", categ);
            
            RequestDispatcher d=request.getRequestDispatcher("updatecategorie.jsp");
            d.forward(request, response);
        }catch(Exception e){
            e.printStackTrace();
            out.print(e);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        try{
            String idc=request.getParameter("idc");
            String nom=request.getParameter("nom");
            Categorie categ=new Categorie(Integer.parseInt(idc), nom);
            categ.save();
            
            response.sendRedirect("CategorieList");
        }catch(Exception e){
            e.printStackTrace();
            out.print(e);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
