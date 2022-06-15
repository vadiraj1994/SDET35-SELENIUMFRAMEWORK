package varm.crm.comcast.contactTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.ContactsPage;
import varm.crm.comcast.pomrepositoryutility.CreatingContactPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;

public class CreateContactWithoutMandateTest extends BaseClass
{
	@Test
	public void createContactTest() throws EncryptedDocumentException, IOException
	{

		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.getContacts().click();

		ContactsPage contact=new ContactsPage(driver);
		contact.getPlusicon().click();

		CreatingContactPage create=new CreatingContactPage(driver);
		
		create.getSaveButton().click();
		create.switchToAlert();//For Negative Scenario...
		String title= driver.getTitle();
		Assert.assertTrue(title.equals("Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM"));
//		if(driver.getCurrentUrl().contains("Contacts&action"))
//		{
//			System.out.println("PopUp Handled SuccessFully.....");
//		}
//		else
//		{
//			System.out.println("Popup not handled Successfully....!!!");
//		}



	}
}
