package varm.crm.comcast.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;
import varm.crm.comcast.pomrepositoryutility.LoginToVtigerPage;

public class BaseClass
{
	public   WebDriver driver;
	public static WebDriver sDriver;//For Screenshot method usage..
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriverUtility wlib=new WebDriverUtility();

	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void beforeSuite()
	{
		System.out.println("Database connection is achieved");

	}
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void beforeTest()
	{
		System.out.println("Launching browser for Execution");
	}

	@Parameters("BROWSER")//launching browser is common .....
	@BeforeClass(groups= {"smokeTest","regressionTest"})     //launch the browser...
	public void launchBrowser(@Optional("firefox")   String BROWSER) throws IOException
	{
		//String browser1 = flib.getPropertyKeyValue("browser1");
		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else if(BROWSER.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		wlib.waitForElementInDOM(driver);
		driver.get(flib.getPropertyKeyValue("url"));
		wlib.maximizeWindow(driver);
		sDriver=driver;

	}
	@BeforeMethod (groups= {"smokeTest","regressionTest"}) 
	public void LoginToApp() throws IOException //login to app...
	{

		LoginToVtigerPage login=new LoginToVtigerPage(driver);
		login.LoginToApp(flib.getPropertyKeyValue("un"),flib.getPropertyKeyValue("pwd"));
		login.getButton().click();

	}

	@AfterMethod (groups= {"smokeTest","regressionTest"}) 
	public void logOut() //logout from app.
	{
		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.signout();
	}
	@AfterClass(groups= {"smokeTest","regressionTest"}) 
	public void closeTheBrowser()//close the browser...
	{
		driver.quit();
	}
	@AfterTest(groups= {"smokeTest","regressionTest"}) 
	public void afterTest()
	{
		System.out.println("Closing of Browsers");
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"}) 
	public void afterSuite() 
	{
		System.out.println("Closing of Database Connection");

	}

}
