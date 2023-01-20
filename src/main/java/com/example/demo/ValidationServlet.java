package com.example.demo;

import com.example.models.AppelWS;
import com.example.models.Data;
import com.example.models.Rechargement;
import com.example.models.VRechargement;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ValidationServlet", value = "/ValidationServlet")
public class ValidationServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        String compte=request.getParameter("numcompte");
        int recharge=Integer.parseInt(request.getParameter("recharge"));
        int etat=Integer.parseInt(request.getParameter("etat"));

        Rechargement rec=new Rechargement();
        rec.setEtat(etat);
        rec.setIdrechargement(id);
        rec.setMontant(recharge);
        rec.setNumerocompte(compte);
        try {
            ObjectMapper mapper = new ObjectMapper();
            String str = mapper.writeValueAsString(rec);
            String json = AppelWS.putMethod("/recharge",str);
            this.doGet(request,response);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String json = AppelWS.getMethod("/recharge/validation/0");
            Object[] obj= Data.arraytoObj(VRechargement.class,json);
            VRechargement[] rec=new VRechargement[obj.length];
            for (int i = 0; i < obj.length; i++) {
                rec[i]=(VRechargement) obj[i];
            }
            req.setAttribute("recharge",rec);
            RequestDispatcher dispat = req.getRequestDispatcher("/validationRechargement.jsp");
            dispat.forward(req,resp);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
