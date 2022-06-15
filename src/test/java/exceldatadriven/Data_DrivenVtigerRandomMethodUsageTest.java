package exceldatadriven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_DrivenVtigerRandomMethodUsageTest
{
	public static void main(String[] args) throws Exception
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//WebDriverWait wait=new WebDriverWait(driver, 10);

		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(pro.getProperty("un"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pro.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		Random r=new Random();//using Random method..
		int handle = r.nextInt(100);
		
		

		String path="./src/test/resources/dataExcel.xlsx";//from excel...
		FileInputStream fis1=new	FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis1);
		String value= book.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue()+handle;
		System.out.println(value);                                        //hayavadan1,2,3,4


		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//wait.until(ExpectedConditions.alertIsPresent());
		
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);//mouse hovering action...
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();


}
}
