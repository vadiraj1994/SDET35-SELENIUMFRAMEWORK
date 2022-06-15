package xmlconfiguration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006 
{
	@Parameters({"browserName","username","password"})
	@Test
	public void testUsers(@Optional("chrome") String browserName,
			@Optional("trainee") String username,
			@Optional("trainee@123") String password) 
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();


		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();


		}
		else {
			Assert.fail("Only 2 vbrowsers are supported");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		WebElement usersLink = driver.findElement(By.linkText("Users"));
		Assert.assertTrue(usersLink.isDisplayed(), "users link is not displayed");
		Assert.assertEquals(usersLink.getText(), "users Text is not displayed");
		usersLink.click();
	
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();


	}
}