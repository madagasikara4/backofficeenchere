package com.example.demo;

import com.example.models.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "StatistiqueServlet", value = "/StatistiqueServlet")
public class StatistiqueServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            String json = AppelWS.getMethod("/statistiques/CAclient");
            Object[] obj= Data.arraytoObj(CAclient.class,json);
            CAclient[] rec=new CAclient[obj.length];
            for (int i = 0; i < obj.length; i++) {
                rec[i]=(CAclient) obj[i];
            }
            request.setAttribute("CAclient",rec);

            json=AppelWS.getMethod("/statistiques/CAcategorie");
            obj= Data.arraytoObj(CAcategorie.class,json);
            CAcategorie[] cat=new CAcategorie[obj.length];
            for (int i = 0; i < cat.length; i++) {
                cat[i]=(CAcategorie) obj[i];
            }
            request.setAttribute("CAcategorie",cat);

            json=AppelWS.getMethod("/statistiques/produitMax");
            Resultat res= (Resultat)Data.maptoObj(Resultat.class,json);
            request.setAttribute("maxprod",res);

            json=AppelWS.getMethod("/statistiques/produitMin");
            res= (Resultat)Data.maptoObj(Resultat.class,json);
            request.setAttribute("minprod",res);

            request.setAttribute("maxcat",null);
            request.setAttribute("badcat",null);

            if(cat.length!=0) {
                request.setAttribute("maxcat", cat[cat.length - 1]);
                request.setAttribute("badcat",cat[0]);
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        RequestDispatcher dispat = request.getRequestDispatcher("/statistique.jsp");
        dispat.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
