package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acting0Test 
{
	@Test
	public void testActiLogin() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		
		SoftAssert as=new SoftAssert();//If one step fails,it moves to futher step..
		
		as.assertTrue(driver.findElement(By.id("username")).isEnabled());
		as.assertFalse(driver.findElement(By.name("pwd")).isEnabled(),"Pasword textfield is not disabled");
		as.assertTrue(driver.findElement(By.id("keepLoggedInCheckBox")).isSelected(),"Remember checkbox is not selected");;
		//issue in above step...checkbox is not selected..
		as.assertTrue(driver.findElement(By.id("loginButton")).isEnabled());
		driver.findElement(By.id("loginButton")).click();
		
		as.assertAll();//It should be the last statement of script...It will stop the execution by throwing assertion error..
		
		
	}
}