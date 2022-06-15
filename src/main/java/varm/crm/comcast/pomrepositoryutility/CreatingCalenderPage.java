package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import varm.crm.comcast.genericutility.WebDriverUtility;

public class CreatingCalenderPage extends WebDriverUtility
{

	public WebDriver driver;

	public  CreatingCalenderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className="calAddButton")
	private WebElement addBtn;
	
	@FindBy(id="addmeeting")
	private WebElement meetingOption;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement eventNameField;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptionAreaField;
	
	@FindBy(xpath="//input[@name='location']")
	private WebElement locationNameField;
	
	@FindBy(name="sendnotification")
	private WebElement sendCheckbox;
	
	@FindBy(xpath="//select[@id='starthr']")
	private WebElement startHour;

	@FindBy(xpath="//select[@id='startmin']")
	private WebElement startMin;

	@FindBy(xpath="//select[@id='startfmt']")
	private WebElement startFmt;
	

	@FindBy(xpath="//select[@id='endhr']")
	private WebElement endHour;

	@FindBy(xpath="//select[@id='endmin']")
	private WebElement endMin;

	@FindBy(xpath="//select[@id='endfmt']")
	private WebElement endFmt;
	
	@FindBy(name="eventsave")
	private WebElement saveEventBtn;

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	@FindBy(xpath="//td[@class='calendarNav']")
	private WebElement calenderEventConfirmMsg;


	public WebElement getMeetingOption() {
		return meetingOption;
	}
	
	public WebElement getEventNameField() {
		return eventNameField;
	}

	public WebElement getDescriptionAreaField() {
		return descriptionAreaField;
	}

	public WebElement getLocationNameField() {
		return locationNameField;
	}

	public WebElement getSendCheckbox() {
		return sendCheckbox;
	}

	public WebElement getStartHour() {
		return startHour;
	}

	public WebElement getStartMin() {
		return startMin;
	}

	public WebElement getStartFmt() {
		return startFmt;
	}

	public WebElement getEndHour() {
		return endHour;
	}

	public WebElement getEndMin() {
		return endMin;
	}

	public WebElement getEndFmt() {
		return endFmt;
	}

	public WebElement getSaveEventBtn() {
		return saveEventBtn;
	}

	public void addEventPopup(String event,String description ,String location)
	{
		switchToWindow(driver, "Calendar&action");
		eventNameField.sendKeys(event);
		descriptionAreaField.sendKeys(description);
		locationNameField.sendKeys(location);
		sendCheckbox.click();
		select(startHour,"09" );
		select(startMin,"30" );
		select(startFmt,"PM" );
		select(endHour,"10" );
		select(endMin,"30" );
		select(endFmt,"PM" );	
		saveEventBtn.click();
	}

	public WebElement getCalenderEventConfirmMsg() 
	{
		return calenderEventConfirmMsg;
	}
	
}
