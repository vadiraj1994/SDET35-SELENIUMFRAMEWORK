package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PuchaseOrderInformationPage 
{

	public WebDriver driver;

	public  PuchaseOrderInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusIcon;
	

	@FindBy(className = "lvtHeaderText")
	private WebElement purchaseInformation;
	
	@FindBy(className="//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicateButton;

	
	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getPurchaseInformation() {
		return purchaseInformation;
	}

	public WebElement getDuplicateButton() {
		return duplicateButton;
	}



}
