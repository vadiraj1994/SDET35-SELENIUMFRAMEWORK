package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Practce3_SelectQuery
{
	//SELECT QUERY*******
		public static void main(String[] args) throws SQLException 
		{
			Connection conn=null;
			try {
				//Register to the database

				Driver driverref=new Driver();//mysql.cj package

				DriverManager.registerDriver(driverref);
				//get the connection
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Stationary", "root", "root");
				//create the query
				Statement stat=conn.createStatement();//my sql package..
				String query="Select * from stationary_info";
				//execute the query..
				ResultSet resultSet= stat.executeQuery(query);
				while(resultSet.next())
				{
					System.out.println(resultSet.getInt(1));
				}
			}catch(Exception e) 
			{
				e.printStackTrace();

				System.out.println("Handling....");
			}
			finally {
				//close the connection..
				conn.close();
			}

		}

}
