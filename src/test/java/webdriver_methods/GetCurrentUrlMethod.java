package webdriver_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentUrlMethod 
{
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");

		String expected_Url ="https://www.actitime.com/";
		String actual_Url = driver.getCurrentUrl();
		System.out.println(actual_Url);
		if(expected_Url.equals(actual_Url))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case  is failed...!!");
		}
		driver.close();
	}
}
