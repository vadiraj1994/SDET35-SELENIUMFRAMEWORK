package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createLeadPage 
{

	public WebDriver driver;

	public createLeadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement plusIcon;
	
	@FindBy(name = "lastname")
	private WebElement lastNameField;
	
	
	@FindBy(name = "company")
	private WebElement companyNameField;
	
	@FindBy(xpath= "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	

	
	 public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getCompanyNameField() {
		return companyNameField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void lastNameEnterIn(String name)
	    {
		 lastNameField.sendKeys(name);
	    }
	
	 public void companyNameEnterIn(String name)
	    {
		 companyNameField.sendKeys(name);
	    }
	
	

}
