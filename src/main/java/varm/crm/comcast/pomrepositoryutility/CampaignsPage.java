package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage
{
	public WebDriver driver;

	public  CampaignsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;

	@FindBy(name="search_text")
	private WebElement searchField;

	@FindBy(name="submit")
	private WebElement searchButton;

	@FindBy(className="crmbutton small delete")
	private WebElement deleteButton;

	@FindBy(name="selected_id")
	private WebElement checkbox;

	public WebElement getPlusicon()
	{
		return plusicon;
	}

	public WebElement getSearchField() 
	{
		return searchField;
	}

	public WebElement getSearchButton()
	{
		return searchButton;
	}

	public WebElement getDeleteButton() 
	{
		return deleteButton;
	}

	public WebElement getCheckbox()
	{
		return checkbox;
	}

}
