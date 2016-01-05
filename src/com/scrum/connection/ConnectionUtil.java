package com.scrum.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.scrum.mymade.exception.SystemException;




public class ConnectionUtil {
	
		private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
        private static final String DB_URL = "jdbc:mysql://localhost:3306/proj1";
		private static final String USER = "root";
		private static final String PASSWORD = "uttam";
		private static Connection con = null;

		
	/*private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";	
			private static final String DB_URL = "jdbc:mysql://localhost:3306/Mymadedb1";
			private static final String USER = "PrateekChopra";
			private static final String PASSWORD = "Prateek@mymade#";
			private static Connection con = null;*/
		
		/*private static final String DB_URL = "jdbc:mysql://localhost:3306/mymade";*/

	
	/*private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/nitishch_mymade";
	private static final String USER = "nitishch_mymade";
	private static final String PASSWORD = "mymade.in";
	private static Connection con = null;*/
	
	/*public static Connection getConnection() throws SystemException
	{
		Context ctx;
		try {
			ctx = new InitialContext();
			Context envCtx=(Context)ctx.lookup("java:comp/env");
			DataSource ds =(DataSource)envCtx.lookup("jdbc/safeguard");
			
			
			InitialContext ctx = new InitialContext();
			DataSource ds =(DataSource)ctx.lookup("java:comp/env/jdbc/indus");
			Connection conn = ds.getConnection();
			return conn;
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new SystemException(Constants.SYSTEM_EXCEPTION_MESSAGE);
		}
		return con;
		
	}	
	
public static void closeConnection(Connection conn) throws SystemException
{
	try {
		conn.close();
	} catch (SQLException e) {
		throw new SystemException(Constants.SYSTEM_EXCEPTION_MESSAGE);
	}
}
	


	private ConnectionUtil() {

	}*/
	
	public static Connection getConnection(){

		System.out.println("inside the getconnection");
			try {
				Class.forName(DRIVER_NAME).newInstance();
				System.out.println("after getting the Drivers");
				con = DriverManager.getConnection(DB_URL, USER, PASSWORD);

				if(con==null)
				{
					System.out.println("Unable to get the connection");
				}
			} catch (SQLException e) {

				e.printStackTrace();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();

	//			throw new SystemException();
			} catch (InstantiationException e) {
				e.printStackTrace();

		//		throw new SystemException(e.getMessage());
			} catch (IllegalAccessException e) {
				e.printStackTrace();

			//	throw new SystemException(e.getMessage());
			}
		
		return con;
	}

	private ConnectionUtil() {

	}

}
