package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsInformationPage 
{
	public WebDriver driver;

	public  CampaignsInformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement campaignInformation;
	
	@FindBy(className="//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicateButton;


	public WebElement getCampaignInformation()
	{
		return campaignInformation;
	}
	
	public WebElement getDuplicateButton() 
	{
		return duplicateButton;
	}


}
