package testngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_Login
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[.='Login ']")).click();
	
}
}
