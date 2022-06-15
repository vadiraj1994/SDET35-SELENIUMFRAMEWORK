package varm.crm.comcast.contactTest;

import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.ContactsPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;

public class DeleteContactTest extends BaseClass
{
	@Test(groups="regressionTest")
	public void deleteContactTest() throws Exception
	{
		int random = jlib.getRanDomNumber();

		String value1 = elib.getExcelData("Sheet1", 0, 4)+random;
		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.getContacts().click();

		ContactsPage contact=new ContactsPage(driver);
		contact.getCheckbox().click();
		contact.getDeleteButton().click();

		wlib.switchToAlertWindowAndAccept(driver,"Are you sure you want to delete the selected 1 records?");
//		String expected_Result = value1;
//		String actual_result=driver.getCurrentUrl();
//		
//		Assert.assertEquals(actual_result.contains(expected_Result),"Contact Name is not deleted");
//		
//		


	}
}
