package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import varm.crm.comcast.genericutility.WebDriverUtility;

public class CreatingNewPurchaseOrderPage extends WebDriverUtility
{

	public WebDriver driver;

	public  CreatingNewPurchaseOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;

	@FindBy(name="subject")
	private WebElement subjectField;

	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement vendorPlusBtn;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;


	@FindBy(xpath="//input[@onclick='selectContact(\"false\",\"general\",document.EditView)']")
	private WebElement contactPlusBtn;

	@FindBy(name="search_text")
	private WebElement vendorTextField;


	@FindBy(xpath="//input[@class='crmbutton small create']")
	private WebElement searchVendorBtn;


	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement vendorOptionClick;
	
	@FindBy(name="bill_street")
	private WebElement billingAddressField;
	
	@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement copyBillingRadioButton;
	
	@FindBy(id = "searchIcon1")
	private WebElement itemListIcon;

	@FindBy(id="search_txt")
	private WebElement searchField;
	
	@FindBy(name = "search")
	private WebElement searchButton;
	
	@FindBy(xpath="//a[@id='popup_product_3']")
	private WebElement proNameLink;
	
	@FindBy(id = "qty1")
	private WebElement qtyField;

	


	public WebElement getQtyField() {
		return qtyField;
	}

	public WebElement getBillingAddressField() {
		return billingAddressField;
	}

	public WebElement getCopyBillingRadioButton() {
		return copyBillingRadioButton;
	}

	public WebElement getItemListIcon() {
		return itemListIcon;
	}

	public WebElement getVendorTextField() {
		return vendorTextField;
	}

	public WebElement getSearchVendorBtn() {
		return searchVendorBtn;
	}

	public WebElement getVendorOptionClick() {
		return vendorOptionClick;
	}

	public WebElement getSubjectField() {
		return subjectField;
	}

	public WebElement getVendorPlusBtn() {
		return vendorPlusBtn;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getContactPlusBtn() 
	{
		return contactPlusBtn;
	}
	public void purchaseSubjectEnter(String subject)
	{
		subjectField.sendKeys(subject);
	}

	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getProNameLink() {
		return proNameLink;
	}
	


	public void handleVendorPopup(String name)
	{
		switchToWindow(driver,"Vendors&action");
		vendorTextField.sendKeys(name);
		searchVendorBtn.click();
		vendorOptionClick.click();
		switchToWindow(driver,"PurchaseOrder&action");
	}
	

	public void handleProductPopup(String billingAddress,String proName,String qty)
	{
		
		billingAddressField.sendKeys(billingAddress);
		copyBillingRadioButton.click();
		itemListIcon.click();
		switchToWindow(driver,"Products&action");
		searchField.sendKeys(proName);
		searchButton.click();
		proNameLink.click();
		switchToWindow(driver,"PurchaseOrder&action");
		qtyField.sendKeys(qty);;
		
		
		
	}

}
