package webdriver_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_GetSize
{

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://in.bookmyshow.com/");
	
	
	int height = driver.manage().window().getSize().getHeight();
	int width= driver.manage().window().getSize().getWidth();
	
	 System.out.println("Height:"+height);
	 System.out.println("Width:"+width);
	 
	 driver.quit();
	
//	  Dimension dimension = window.getSize();
//	
//	  int height = dimension.getHeight();
//	 int width = dimension.getWidth();

	
	}

}
