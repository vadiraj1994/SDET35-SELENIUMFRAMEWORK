package webdriver_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMethod
{
public static void main(String[] args) {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://in.bookmyshow.com/");
	driver.manage().window().maximize();
	Navigation navigation = driver.navigate();
	navigation.to("http://localhost:8888/");
	navigation.back();
	navigation.refresh();
	navigation.forward();
	
	driver.quit();
	

}
}