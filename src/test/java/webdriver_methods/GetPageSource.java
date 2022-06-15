package webdriver_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSource {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.actitime.com/");

		String page_Source = driver.getPageSource();
		System.out.println(page_Source);
		
		String page_Title = driver.getTitle();
		System.out.println(page_Title);
		if(page_Source.contains(page_Title))
		{
			System.out.println("Title is present");
		}
		else
		{
			System.out.println("Title is not present");
		}
	}

}
