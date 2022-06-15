package webdriver_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");

		String expected_Title ="actiTIME - Time Tracking Software for Smart Teams";
		String actual_Title = driver.getTitle();
		System.out.println(actual_Title);
		if(expected_Title.equals(actual_Title))
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
