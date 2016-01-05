package com.scrum.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class AddProduct
 */
/*@WebServlet(description = "addind some product", urlPatterns = { "/AddProduct" })
*/
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
/*    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
	       response.setContentType("text/html");

		
		String Pname=request.getParameter("pname");
		String Pid=request.getParameter("pid");
		String Pbd=request.getParameter("pbd");
		String Prc=request.getParameter("prc");
		String Pmrp=request.getParameter("pmrp");
		String Pcode=request.getParameter("pcode");
		String Pdoa=request.getParameter("pdoa");
		
		
		try {
    	    Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/proj1", "root", "uttam");

        Statement st = con.createStatement();
        
        int i = st.executeUpdate("insert into product(ProductId,ProductName,ProductBrand,ProductPrice,ProductMrp,ProductAdditionDate,ProductBarCode) values('"+Pid+"','"+Pname+"','"+Pbd+"','"+Prc+"','"+Pmrp+"','"+Pdoa+"','"+Pcode+"')");
        
      if (i > 0)
      {
    	  out.println("You are successfully ADD PRODUCT...THANK YOU");
        RequestDispatcher rs = request.getRequestDispatcher("product.jsp");
        rs.include(request, response);
        
       /* response.sendRedirect("product.jsp");
        out.println("You are successfully ADD PRODUCT...THANK YOU");*/
      } 
		}

		

        
        
        catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
		
	}

}
