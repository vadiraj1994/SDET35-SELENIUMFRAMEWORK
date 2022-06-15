package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Non_SelectQuery1
{
	//Non SELECT QUERY*******
	public static void main(String[] args) throws SQLException 
	{
		Connection conn=null;
		int result=0;
		try {
			//Register to the database

			Driver driverref=new Driver();//mysql.cj package

			DriverManager.registerDriver(driverref);
			//get the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "root");
			//create the query
			Statement stat=conn.createStatement();//my sql package..
			String query = "insert into product(pid,pname,pbrand) values('p3','shoe','bata');";
			//execute the query..
			result=stat.executeUpdate(query);
		}
		catch(Exception e) 
		{
			e.printStackTrace();

			System.out.println("Handling....");
		}
		finally
		{
			if(result==1)
			{
				System.out.println("product added succesfully...");
			}
			else	
			{
			System.out.println("product not added succesfully...!");	
			}
		
		//close the connection..
			conn.close();
		}



	}

}
