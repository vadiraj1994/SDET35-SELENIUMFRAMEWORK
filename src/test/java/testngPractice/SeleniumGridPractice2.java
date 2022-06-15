package testngPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridPractice2 
{
	RemoteWebDriver driver;
	@Parameters("browser")//cross browser ...
	@Test
	public void sampleTest(String browser) throws MalformedURLException
	{
		URL url=new URL("http://localhost:4444/wd/hub");//java.net
		DesiredCapabilities cap=new DesiredCapabilities();
		if(browser.equals("chrome"))
		{

			cap.setBrowserName("chrome");
			//cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(browser.equals("firefox"))
		{
			cap.setBrowserName("firefox");
			//cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		driver=new RemoteWebDriver(url, cap);//02 arguments..
		driver.get("http://google.com");

	}
}