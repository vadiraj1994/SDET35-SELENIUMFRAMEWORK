package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiDataPro1Test
{
	@DataProvider
	public String[] getData()  //1D Array
	{
		//String[] usernames= {"admin","admin123","admin4567"};
		return new String[] {"admin","admin123","admin4567"} ;
	}


	@Test(dataProvider = "getData")
	public void testActiLogin(String userData) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(userData);

	}
}