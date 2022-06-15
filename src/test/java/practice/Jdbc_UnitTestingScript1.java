package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Jdbc_UnitTestingScript1
{
	public static void main(String[] args) throws SQLException 
	{
		String pName="shoe";
		String actName=null;

		Connection conn=null;
		try {
			//Register to the database

			Driver driverref=new Driver();//mysql.cj package

			DriverManager.registerDriver(driverref);
			//get the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "root");
			//create the query                                          //DB name|
			Statement stat=conn.createStatement();//my sql package..
			String query="Select * from product";
			//execute the query..
			ResultSet resultSet= stat.executeQuery(query);
			while(resultSet.next())
			{

				String actpName=resultSet.getString("pname");
				if(actpName.equals(pName))
				{
					System.out.println("Product is found");
					break;
				}

				else
				{
					System.out.println("product is not found");
				}

			}}catch(Exception e)
		{

				e.printStackTrace();

				System.out.println("Handling....");
		}
		finally 
		{
			//close the connection..
			conn.close();
		}


	}
}
