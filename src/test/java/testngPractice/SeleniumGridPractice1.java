package testngPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridPractice1 
{
	@Test
	public void sampleTest() throws MalformedURLException
	{
		URL url=new URL("http://localhost:4444/wd/hub");//java.net
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		//cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(url, cap);//02 arguments..
		driver.get("http://google.com");

	}
}
