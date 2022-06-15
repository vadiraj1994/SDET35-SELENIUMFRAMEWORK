package varm.crm.comcast.genericutility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility
{
	public void waitForElementInDOM(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(IConstants.Implicitly_TIMEOUT, TimeUnit.SECONDS);

	}
	public void waitForPage(WebDriver driver,String partialPageURL)
	{
		WebDriverWait wait=new WebDriverWait(driver, IConstants.Explicitly_TIMEOUT);
		wait.until(ExpectedConditions.urlContains(partialPageURL));
	}
	public void waitForElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, IConstants.Explicitly_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void switchToWindow(WebDriver driver,String partialWindowUrl)
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String wID=it.next();
			driver.switchTo().window(wID);
			String currentWindowUrl = driver.getCurrentUrl();
			
			if(currentWindowUrl.contains(partialWindowUrl))
			{
				break;
			}
		}
	}
	public void switchToAlertWindowAndAccept(WebDriver driver,String expectedMsg)
	{
		Alert alt = driver.switchTo().alert();
		if(alt.getText().trim().equalsIgnoreCase(expectedMsg.trim()))
		{
			System.out.println("Alert Message is verified");
		}
		else
		{
			System.out.println("Alert Message is not verified");
		}
		alt.accept();
	}
	public void switchToAlertWindowAndCancel(WebDriver driver,String expectedMsg)
	{
		Alert alt = driver.switchTo().alert();
		if(alt.getText().equals(expectedMsg))
		{
			System.out.println("Alert Message is verified");
		}
		else
		{
			System.out.println("Alert Message is not verified");
		}
		alt.dismiss();
	}

	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String id_name_attribute)
	{
		driver.switchTo().frame(id_name_attribute);
	}
	public void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void select(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void mouseOverOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void executeJavaScript(WebDriver driver,String javascript)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript(javascript, null);
	}
	public void executeJavaScriptForScrollAction(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(x,y)");
	}
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitAndClick(WebElement element ) throws InterruptedException 
	{
		int count=0;
		while(count<20)
		{
			try {
				element.click();
				break;
			}
			catch(Throwable e)
			{
				Thread.sleep(1000);
				count++;
			}
		}

	}
	public void passEnterKey(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}


}

