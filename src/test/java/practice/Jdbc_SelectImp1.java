package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_SelectImp1

{
	public static void main(String[] args) throws SQLException 
	{
		String dbUrl="jdbc:mysql://localhost:3306/credentials";
		String username="root";
		String password="root";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		Statement stat = conn.createStatement();
		String query = "Select * from test1;";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			System.out.print(result.getString("username")+" ");
			System.out.println(result.getString("password"));

		}
	}
}
