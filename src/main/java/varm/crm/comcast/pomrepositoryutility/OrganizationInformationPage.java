package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage 
{

	public WebDriver driver;
	public  OrganizationInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusIcon;
	
	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getOrganizeInformation() {
		return OrganizeInformation;
	}

	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	@FindBy(className="dvHeaderText")
	private WebElement OrganizeInformation;
	
	@FindBy(className="//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicateButton;

}
