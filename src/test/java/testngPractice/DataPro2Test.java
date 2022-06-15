package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro2Test
{
	@DataProvider(name = "Credentials",parallel = true)//parallel for faster execution...
	public String[][] testData()
	{
		//String[][] sarr= {{"admin","manager"},{"trainee","trainee@123"},{"vaibhav","vaibhav@123"}};
		//return sarr;
		return new String[][] {{"admin","manager"},{"trainee","trainee@123"},{"Bhairav","Bhairav@123"}};

	}
	
	@Test(dataProvider = "Credentials")
	public void testMultipleLogins(String userData,String passwdData)
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(userData);
		driver.findElement(By.name("pwd")).sendKeys(passwdData);
		driver.findElement(By.id("loginButton")).click();
	}
}
