package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acting3Test 
{
	//final int var=2;//annotaion methods will take only constant values..
	@Test(timeOut = 6000)//used to run time critical TC..(if not means it will throw ThreadTimeOutException)
	//@Test( description = "Login with Valid Credentials and verify LogoutLink is Displayed"(to run TC with scenario), invocationCount = 2, threadPoolSize = 2 )//to run same test script multiple times..(to tun parallel execution-thraed pool size is used)
	public void testActiLogin() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		//Hard Assert- if one step fails, it will not continue execution..
		Assert.assertTrue(driver.findElement(By.id("logoutLink")).isDisplayed(), "Logout link is not displayed");

	}
}