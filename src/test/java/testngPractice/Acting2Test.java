package testngPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acting2Test 
{
	@Test
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

		//Thread.sleep(10000);
		List<WebElement> alltags = driver.findElements(By.tagName("Vadiraj"));
		//Assert.assertEquals(alltags.isEmpty(), false,"The list of tagname with tag Vadiraj is not displayed");
		//		Assert.assertTrue(alltags.isEmpty(),"It is not empty");
		//		Assert.assertFalse(alltags.isEmpty(),"It is empty");
		//Assert.fail();
		Assert.fail("Sorry");


	}
}

