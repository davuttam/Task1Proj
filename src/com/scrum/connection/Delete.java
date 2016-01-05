package com.scrum.connection;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
//@WebServlet(description = "delete  the row of product table", urlPatterns = { "/Delete" })
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			
			
			String value = request.getParameter("id");
			
			
			
			
			
			try {
	    	    Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/proj1", "root", "uttam");

	        Statement st = con.createStatement();
	        int i = st.executeUpdate("delete from product where ProductSerialNo="+ value);
	        
	        if(i!=0){
	        	out.println("SuccessfulLy deleted the product the record");
	        	 RequestDispatcher rs = request.getRequestDispatcher("retrieve.jsp");
	             rs.include(request, response);
	        	
	                }
		        }
			

	        catch (Exception e2) {
	            System.out.println(e2);
	        }
	 
	        out.close();
			
	}
}
