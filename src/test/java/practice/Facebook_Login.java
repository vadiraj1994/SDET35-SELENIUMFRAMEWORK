package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login
{
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9945006508");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("11111994");
	driver.findElement(By.xpath("//button[.='Log In']")).click();
	}
}
