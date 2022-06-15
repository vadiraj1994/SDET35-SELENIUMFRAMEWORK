package webdriver_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_SetSize 
{

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://in.bookmyshow.com/");
	
	Dimension targetSize = new Dimension(600, 800);
	
	driver.manage().window().setSize(targetSize);
	driver.quit();
	
	}
}
