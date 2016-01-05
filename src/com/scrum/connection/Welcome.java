package com.scrum.connection;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Welcome extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("hello welcomme");
       System.out.println("hello welcomme");
        out.println("<p>"+ "<a href='product.jsp'>"+"Click here to Add product"+"</a>"+"</p>");
        out.println("<p>"+" <a href='retrieve.jsp'>"+ "Click Here Show tables" + "</a>" + "</p>");
     /* int j=1;
        if(j>0){
        RequestDispatcher rs = request.getRequestDispatcher("/viewproduct");
        rs.forward(request, response);*/
       //}
        //out.println("<h1>" + "Welcome user on SCRUM TECHNOLOGY PAGE"+ " </h1>");
      }  
}