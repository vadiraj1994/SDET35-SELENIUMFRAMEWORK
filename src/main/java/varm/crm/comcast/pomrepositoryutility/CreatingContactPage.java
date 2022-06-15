package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingContactPage
{
	public WebDriver driver;

	public  CreatingContactPage(WebDriver driver)
	{
		this.driver=driver;

		PageFactory.initElements(driver,this);
	}

	@FindBy(name = "lastname")
	private WebElement lastnamefield;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public void switchToAlert()
	{
		 Alert alt=driver.switchTo().alert();
		 String altText = alt.getText();
		 System.out.println("Alert Text is :"+altText);	
		 alt.accept();
		
	}

	public WebElement getLastnamefield() 
	{
		return lastnamefield;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	public void enterDataInFields(String lastname)
	{
		lastnamefield.sendKeys(lastname);
		saveButton.click();
	}


}
