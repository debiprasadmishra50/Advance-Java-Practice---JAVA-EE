package jdbc_examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Provider 
{
	public static Connection getMysqlConnection() throws ClassNotFoundException, SQLException
	{
//		Class.forName("com.mysql.cj.jdbc.Driver"); // In mysql-connector 8.0.16
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "sipusipu18");
		if(con != null)
			System.out.println("Connection Established");
		else
			System.out.println("Connection Failed");
		return con;
	}
}
