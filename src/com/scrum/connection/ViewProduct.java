package com.scrum.connection;

import java.io.*;
/*import java.util.*;
import javax.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewProduct
 */
//@WebServlet(description = "view the record of product", urlPatterns = { "/ViewProduct" })
public class ViewProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Connection con= null;
	    Statement st=null;
		PrintWriter out=response.getWriter();
		
		try{
			
			 Class.forName("com.mysql.jdbc.Driver");
		         con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/proj1", "root", "uttam");

		        st = con.createStatement();
		        
		        
		        ResultSet rs = st.executeQuery("select *from product");
		        System.out.println("view product not");
		        while(rs.next()){
		           System.out.println("view product");
		        	
		          out.println("ProductNumber" + "   " +"Product_Id" + "   " + "Product_Name" + "   " + "Product_Brand" + "   " + "Product_Price"+ "   "+ "Product_Mrp"+ "   "+ "Product_BarCode"+ "   " + "Product_addition"+ "   " + "<br>");
		          out.println(rs.getString(1) + "   " + rs.getString(2) +"  "+ rs.getString(3) +"  "+ rs.getString(4)+"  "+ rs.getString(5)+"  "+ rs.getString(6)+"  "+ rs.getString(7)+"  "+ rs.getString(8)+ "<br>");
		     
		       
		        }
		}
		
		catch (Exception e){
		      out.println(e);
		    }
		finally {
		            // close all the connections.
		    try {
		      st.close();
		      con.close();
		    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		         
		 
		         }
	}

}
}
