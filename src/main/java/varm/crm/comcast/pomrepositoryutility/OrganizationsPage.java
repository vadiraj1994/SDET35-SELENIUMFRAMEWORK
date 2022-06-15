package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage 
{
	public WebDriver driver;

	public  OrganizationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusIcon;
	
	@FindBy(name="search_text")
	private WebElement searchField;
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
	
	@FindBy(xpath="//input[@onclick='check_object(this)']")
	private WebElement checkbox;

	@FindBy(xpath="//input[@onclick='return massDelete('Accounts')']")
	private WebElement deleteButton;
	
	
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	
	
	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}
	public void searchNameEnter(String name)
	{
		searchField.sendKeys(name);
	}

}
