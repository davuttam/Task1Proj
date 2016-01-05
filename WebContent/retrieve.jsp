<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Retrieving table</h1>
		
		<%
		try{
			

			 Class.forName("com.mysql.jdbc.Driver");
		       Connection  con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/proj1", "root", "uttam");

		        Statement st = con.createStatement();
		        
		      ResultSet rs = st.executeQuery("select *from product");
		       
		      while(rs.next()){%>		    	  
		      <table border="1">
		      <tr>
		    	<!-- <th>ProductNumber</th>   -->
		    	 <th>Product_Id</th>
		    	 <th>Product_Name</th>
		    	 <th>Product_Brand</th>  
		    	 <th>Product_Price</th>
		    	 <th>Product_Mrp</th>
		    	 <th>Product_addition</th>
		    	 <th>Product_BarCode</th>
		      </tr> 
		      
		      <tr>
		      	 <%--  <td> <%out.println(rs.getString(1));%> </td> --%>
		      	  <td><%=rs.getString(2)%></td>
		      	  <td><%=rs.getString(3)%></td>
		      	  <td><%=rs.getString(4)%></td>
		      	  <td><%=rs.getString(5)%></td>
		      	  <td><%=rs.getString(6)%></td>
		      	  <td><%=rs.getString(7)%></td>
		      	  <td><%=rs.getString(8)%></td>
		      	  <td><a href=delete?id=<%=rs.getString(1) %>> Delete </a>  </td>
		      </tr>
		      <br/>
		    	  </table>
		    	  <%}
		    	  
		}
		
		catch (Exception ex)
		{
			out.println(ex);
		}	
		
		%>
<br/>
<button type="button"><a href="welcome.jsp" >Click TO BACK!</a></button>
</body>
</html>