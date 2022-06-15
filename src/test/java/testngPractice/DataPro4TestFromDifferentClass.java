package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro4TestFromDifferentClass
{
	@Test(dataProviderClass = DataPro2Test.class,dataProvider = "Credentials")

	public void testLoginData(String userData,String passwordData)
	
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(userData);
	driver.findElement(By.name("pwd")).sendKeys(passwordData);

}
}
