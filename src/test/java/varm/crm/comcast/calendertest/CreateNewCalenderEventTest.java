package varm.crm.comcast.calendertest;

import org.testng.Assert;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.CreatingCalenderPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;

public class CreateNewCalenderEventTest extends BaseClass
{
	@Test(groups= "smokeTest")
	public void createNewCalenderEvent() throws Exception
	{

		int random = jlib.getRanDomNumber();

		String value1 = elib.getExcelData("Sheet1", 2,2)+random;
		String value2 = elib.getExcelData("Sheet1", 2,3)+random;
		String value3 = elib.getExcelData("Sheet1", 1,4)+random;


		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.getCalender().click();

		CreatingCalenderPage create=new CreatingCalenderPage(driver);
		create.getAddBtn().click();
		create.getMeetingOption().click();
		create.addEventPopup(value1, value2, value3);

		String actual_result=create.getCalenderEventConfirmMsg().getText();
		String expected_Result = value1;
		Assert.assertEquals(actual_result.contains(expected_Result),true,"Calender event is not created");

	}
}
