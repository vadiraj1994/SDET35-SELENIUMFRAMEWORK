package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import varm.crm.comcast.genericutility.WebDriverUtility;

public class HomeVtigerPage extends WebDriverUtility
{
	public WebDriver driver;

	public  HomeVtigerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[.='Organizations']")
	private WebElement organization;

	@FindBy(xpath="//a[.='Calendar']")
	private WebElement calender;

	@FindBy(xpath="//a[.='Contacts']")
	private WebElement contacts;

	@FindBy(xpath="//a[.='Campaigns']")
	private WebElement campaigns;

	@FindBy(name="Vendors")
	private WebElement vendors;

	@FindBy(name="Purchase Order")
	private WebElement purchaseorder;

	@FindBy(xpath="//a[.='Dashboard']")
	private WebElement dashboard;

	@FindBy(xpath="//a[.='Products']")
	private WebElement products;

	@FindBy(linkText="More")
	private WebElement moredrop;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;


	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signout;
	
	@FindBy(linkText="Leads")
	private WebElement leads;
		

	public WebElement getLeads() {
		return leads;
	}


	public WebElement getOrganization() 
	{
		return organization;
	}


	public WebElement getCalender() 
	{
		return calender;
	}


	public WebElement getContacts()
	{
		return contacts;
	}


	public WebElement getCampaigns()
	{
		return campaigns;
	}


	public WebElement getVendors() 
	{
		return vendors;
	}


	public WebElement getPurchaseorder()
	{
		return purchaseorder;
	}


	public WebElement getDashboard() 
	{
		return dashboard;
	}


	public WebElement getProducts() 
	{
		return products;
	}


	public WebElement getMoredrop() 
	{
		return moredrop;
	}

	public WebElement getAdministrator() 
	{
		return administrator;
	}


	public WebElement getSignout()
	{
		return signout;
	}
	public void navigateToCampaign()
	{
		mouseOverOnElement(driver, moredrop);	
		campaigns.click();
	}
	public void navigateToVendor()
	{
		mouseOverOnElement(driver,moredrop);	
		vendors.click();
	}
	public void navigateToPurchaseOrder()
	{
		mouseOverOnElement(driver, moredrop);	
		purchaseorder.click();
	}
	public void signout()
	{
		mouseOverOnElement(driver, administrator);
		signout.click();
		
	}
}
