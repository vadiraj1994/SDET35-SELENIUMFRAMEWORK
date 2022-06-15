package exceldatadriven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_DrivenExcelVtigerTest
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

		WebDriverWait wait=new WebDriverWait(driver, 10);

		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(pro.getProperty("un"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pro.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();

		String path="./src/test/resources/dataExcel.xlsx";//from excel...
		FileInputStream fis1=new	FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis1);
		String value= book.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(value);


		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		wait.until(ExpectedConditions.alertIsPresent());



		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.linkText("Hayavadan")).click();




	}
}
