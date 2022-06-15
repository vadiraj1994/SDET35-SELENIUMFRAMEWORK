package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import varm.crm.comcast.genericutility.WebDriverUtility;

public class ContactsPage extends WebDriverUtility
{
	public WebDriver driver;

	public  ContactsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;
	
	@FindBy(name="selected_id")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deleteButton;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getPlusicon() 
	{
		return plusicon;
	}
	public void alertHandle()
	{
	switchToAlertWindowAndAccept(driver,"Are you sure you want to delete the selected 1 records?");	
	}


}
