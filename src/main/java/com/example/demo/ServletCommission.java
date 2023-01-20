package com.example.demo;

import com.example.models.Commission;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCommission", value = "/ServletCommission")
public class ServletCommission extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        try{
            Commission commission=Commission.findById(1);
            request.setAttribute("commission",commission);

            RequestDispatcher d=request.getRequestDispatcher("Updatecommission.jsp");
            d.forward(request,response);
        }catch(Exception e){
            e.printStackTrace();
            out.print(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        try{
            String idc=request.getParameter("idc");
            String c=request.getParameter("commission");
            Commission commission=new Commission();
            commission.setIdcommission(Integer.valueOf(idc));
            commission.setCommission(Float.valueOf(c));
            commission.update();

            response.sendRedirect("ServletCommission");
        }catch (Exception e){
            e.printStackTrace();
            out.print(e);
        }
    }
}
