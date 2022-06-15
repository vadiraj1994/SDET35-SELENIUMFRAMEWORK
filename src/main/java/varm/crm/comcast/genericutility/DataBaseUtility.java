package varm.crm.comcast.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility 
{
	static Driver driver;
	static Connection connection;
	static ResultSet result;

	public void connectDB()
	{
		try {
			driver=new Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection(IConstants.JDBC_URL_String, IConstants.JDBC_USERNAME, IConstants.JDBC_PASSWORD);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void closeDB()
	{
		try {
			connection.close();
		}
		catch(Exception e)
		{

		}
	}
	public ResultSet executeQuery(String query) throws Throwable
	{
		result=connection.createStatement().executeQuery(query);
		return result;
	}
	public int executeUpdate(String query) throws SQLException
	{
		int result=connection.createStatement().executeUpdate(query);
		return result;
	}
	public boolean executeQueryAndVerify(String query,int columnIndex,String expectedData) throws SQLException
	{
		boolean flag=false;
		result=connection.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equals(expectedData))
			{
				flag=true;
				break;
			}

		}
		if(flag)
		{
			System.out.println(expectedData+"==>Data is verified in the data base table");
			return flag;
		}
		else
		{
			System.out.println(expectedData+"==>data is not verified in the database");
			return flag;

		}
	}

}
