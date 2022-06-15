package varm.crm.comcast.contactTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.genericutility.ExcelUtility;
import varm.crm.comcast.genericutility.FileUtility;
import varm.crm.comcast.genericutility.JavaUtility;
import varm.crm.comcast.genericutility.WebDriverUtility;
import varm.crm.comcast.pomrepositoryutility.ContactsInformationPage;
import varm.crm.comcast.pomrepositoryutility.ContactsPage;
import varm.crm.comcast.pomrepositoryutility.CreatingContactPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;
import varm.crm.comcast.pomrepositoryutility.LoginToVtigerPage;

public class CreateContactTest extends BaseClass
{
	@Test(groups="regressionTest")
	public void createContactTest() throws Exception
	{
		
		int random = jlib.getRanDomNumber();

		String value1 = elib.getExcelData("Sheet1", 0, 4)+random;
		
		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.getContacts().click();
		
		ContactsPage contact=new ContactsPage(driver);
		contact.getPlusicon().click();
		
		CreatingContactPage create=new CreatingContactPage(driver);
		create.enterDataInFields(value1);
		
		ContactsInformationPage cInform=new ContactsInformationPage(driver);
		
		String actual_result=cInform.getContactInformation().getText();
		
		String expected_Result = value1;
		Assert.assertEquals(actual_result.contains(expected_Result),true,"Create contact Name not created");

	}
}
