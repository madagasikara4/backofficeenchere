package com.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import com.example.models.Photo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.models.Produit;
import com.example.models.VProduit;

@WebServlet(name = "ProduitDureeList", value = "/ProduitDureeList")
public class ProduitDureeList extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
            String idc=request.getParameter("c");
            int idcategorie=Integer.parseInt(idc);
            VProduit[] vproduit=VProduit.findValideByCategorie(idcategorie);
            Photo[] sary=Photo.getPhotoById(vproduit);
            request.setAttribute("vproduit", vproduit);
            request.setAttribute("photo", sary);

            RequestDispatcher d=request.getRequestDispatcher("listeproduitcategorie.jsp");
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
            String p=request.getParameter("p");
            String d=request.getParameter("duree");
            int idproduit=Integer.parseInt(p);
            int duree=Integer.parseInt(d);
            Produit.updateDuree(idproduit, duree);
            
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
