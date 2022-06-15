package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_Vtiger
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Property.properties");
		Properties pro=new Properties();//java.util
		pro.load(fis);
		String browser1 = pro.getProperty("browser1");
		String browser2 = pro.getProperty("browser2");
		WebDriver driver=null;
		if(browser1.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else if(browser1.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		//System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(pro.getProperty("un"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pro.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();






	}
}
