package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage 
{

	public WebDriver driver;

	public  LeadInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(className ="dvHeaderText")
	private WebElement leadInformation;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLeadInformation() {
		return leadInformation;
	}

}
