package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import varm.crm.comcast.genericutility.WebDriverUtility;

public class CreatingNewCampaignPage extends WebDriverUtility
{
	public WebDriver driver;

	public  CreatingNewCampaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="campaignname")
	private WebElement campNameField;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement productPlusBtn;
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchProduct;
	
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement productButton;
	
	@FindBy(xpath="//a[.='Watch']	")
	private WebElement productClick;
	
	public WebElement getSearchProduct() {
		return searchProduct;
	}

	public WebElement getEnterProductName() {
		return productButton;
	}

	public WebElement getProductClick() {
		return productClick;
	}

	public WebElement getProductPlusBtn() {
		return productPlusBtn;
	}

	public WebElement getCampNameField()
	{
		return campNameField;
	}

	public WebElement getSaveButton()
	{
		return saveButton;
	}
    public void campainNameEnter(String name)
    {
    	campNameField.sendKeys(name);
    }
    public void handlePopup(String name)
    {
    	switchToWindow(driver,"Products&action");
    	searchProduct.sendKeys(name);
    	productButton.click();
    	 productClick.click();
    	 switchToWindow(driver,"Campaigns&action");
    }
    
}
