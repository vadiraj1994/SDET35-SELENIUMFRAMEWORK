package varm.crm.comcast.LeadTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;
import varm.crm.comcast.pomrepositoryutility.LeadInformationPage;
import varm.crm.comcast.pomrepositoryutility.createLeadPage;

public class createLeadTest extends BaseClass
{
	@Test
	public void createLead() throws Exception
	{

		int random = jlib.getRanDomNumber();

		String value1 = elib.getExcelData("Sheet1", 1, 3)+random;
		String value2 = elib.getExcelData("Sheet1", 0, 6)+random;

		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.getLeads().click();;

		createLeadPage  create=new createLeadPage(driver);
		create.getPlusIcon().click();
		create.lastNameEnterIn(value1);
		create.companyNameEnterIn(value2);
		create.getSaveButton().click();

		LeadInformationPage linform=new LeadInformationPage(driver);
		String actual_result = linform.getLeadInformation().getText();

		String expected_result=value1;

		Assert.assertEquals(actual_result.contains(expected_result),true,"Lead is not created");


	}
}
