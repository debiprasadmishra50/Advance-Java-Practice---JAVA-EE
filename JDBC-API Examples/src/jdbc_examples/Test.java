package jdbc_examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = Provider.getMysqlConnection();
		Statement st = con.createStatement();
		String sql = "Show databases";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
			System.out.println(rs.getString(1));
		
		con.close();
	}
}
