package com.example.demo;

import com.example.models.Admin;
import com.example.models.AppelWS;
import com.example.models.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom=request.getParameter("nom");
        String mdp=request.getParameter("mdp");
        Admin admin=new Admin();
        admin.setMdp(mdp);
        admin.setNom(nom);
        try{
            ObjectMapper mapper = new ObjectMapper();
            String str = mapper.writeValueAsString(admin);
            String json = AppelWS.postMethod("/admin/login",str);
            Object val= Data.toObj(json);
            if((boolean)val==false){
                RequestDispatcher dispat = request.getRequestDispatcher("/index.jsp");
                dispat.forward(request,response);
                return;
            }
            response.sendRedirect("validationRecharge");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
