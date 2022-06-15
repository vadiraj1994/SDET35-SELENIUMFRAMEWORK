package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganisationPage 
{
	public WebDriver driver;

	public  CreateOrganisationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusIcon;

	@FindBy(name="accountname")
	private WebElement organiseNameField;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;


	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getOrganiseNameField() {
		return organiseNameField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	public void OrgNameEnter(String orgName)
	{
		organiseNameField.sendKeys(orgName);
	}
}
