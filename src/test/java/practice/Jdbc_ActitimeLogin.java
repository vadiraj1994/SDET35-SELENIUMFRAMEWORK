package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jdbc_ActitimeLogin 
{
	public static void main(String[] args) throws SQLException 
	{
		String dbUrl="jdbc:mysql://localhost:3306/credentials";
		String username="root";
		String password="root";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		Statement stat = conn.createStatement();
		String query = "Select * from details;";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(result.getString("username1"));
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(result.getString("password1"));
			driver.findElement(By.xpath("//a[.='Login ']")).click();
		}
	}
}
