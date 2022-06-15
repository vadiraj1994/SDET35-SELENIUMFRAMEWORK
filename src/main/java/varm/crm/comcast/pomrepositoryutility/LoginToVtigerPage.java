package varm.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToVtigerPage 
{
	public WebDriver driver;

	public  LoginToVtigerPage(WebDriver driver)
	{
		this.driver=driver;

		PageFactory.initElements(driver,this);
	}

	@FindBy(name="user_name")
	private WebElement username;

	@FindBy(name="user_password")
	private WebElement password;

	@FindBy(id="submitButton")
	private WebElement button;

	

	public WebElement getUsername() 
	{
		return username;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getButton()
	{
		return button;
	}


	public void LoginToApp(String user_name,String pass_word)
	{
		username.sendKeys(user_name);
		password.sendKeys(pass_word);
	}

}




