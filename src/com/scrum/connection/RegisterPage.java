/*package com.scrum.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*//**
 * Servlet implementation class RegisterPage
 *//*
//@WebServlet(description = "this is a register page", urlPatterns = { "/RegisterPagePath" })
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       out.println("hello");
        String name = request.getParameter("fname");
        String Uid=request.getParameter("uname");
        String email = request.getParameter("umail");
        String Phone = request.getParameter("uphone");
        String Add = request.getParameter("uadd");
        String Dob = request.getParameter("udob");
        String Gender = request.getParameter("ugender");
 
        try {
        	Class.forName("com.mysql.jdbc.Driver"); 
        	
        	Connection con= null;        			
     
        	System.out.println("hello");
           
           con = ConnectionUtil.getConnection();
       
           String query = "insert into UserRegister values(?,?,?,?,?,?,?)";
           PreparedStatement ps=con.prepareStatement(query);
        
 
            ps.setString(1, name);
            ps.setString(2, Uid);
            ps.setString(3, email);
            ps.setString(4, Phone);
            ps.setString(5, Add);
            ps.setString(6, Dob);
            ps.setString(7, Gender);
 
            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered...");
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
    }

}
*/

package com.scrum.connection;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
 
public class RegisterPage extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        
        String name = request.getParameter("fname");
        String id=request.getParameter("uid");
        String pwd=request.getParameter("upwd");
        String email = request.getParameter("umail");
        String phone = request.getParameter("uphone");
        String add = request.getParameter("uadd");
        String dob = request.getParameter("udob");
        String gender = request.getParameter("ugender");
       
        
        /*
 */
        try {
        	    Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/proj1", "root", "uttam");
 
            Statement st = con.createStatement();
            
           int i= st.executeUpdate("insert into RegisterForm(UserFullName,UniqueId,UserEmailId,UserPhoneNo,UserAddress,UserDob,UserGender) values('"+name+"','"+id+"','"+email+"','"+phone+"','"+add+"','"+dob+"','"+gender+"')");
            
           st.executeUpdate("insert into UserLogin(UniqueId,UserPassword) values('"+id+"','"+pwd+"')");
          
           /*
            PreparedStatement ps = con
                    .prepareStatement("insert into RegisterForm values(?,?,?,?,?,?,?,?)");*/
 
 /*           ps.setString(1, "1");
            ps.setString(2, name);
            ps.setString(3, Uid);
            ps.setString(4, email);
            ps.setString(5, Phone);
            ps.setString(6, Add);
            ps.setString(7, Dob);
            ps.setString(8, Gender);
 */           
 
           // int i = ps.executeUpdate();
        /*int i=1;*/   
        if (i > 0)
                out.print("You are successfully registered...");
            
            RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
	           rs.include(request, response);
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
    }
 
}