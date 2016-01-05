package com.scrum.connection;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;



public class Login extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 
	// PrintWriter out = response.getWriter();
			//out.println("It is working 2");
			
		 
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String email = request.getParameter("umail");
	        String pass = request.getParameter("upwd");
	        
	        if(LoginCheck.checkUser(email, pass))
	        {
	            System.out.println("you are in");
	        //response.sendRedirect("http//www.google.com");
	            /*RequestDispatcher rs = request.getRequestDispatcher("/welcome");*/
	            RequestDispatcher rs = request.getRequestDispatcher("welcome.jsp");
	            rs.forward(request, response);
	        }
	        else
	        {
	           out.println("Username or Password incorrect");
	           //System.out.println("you are wrong");
	           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
	           rs.include(request, response);
	        }
	    }  

}
