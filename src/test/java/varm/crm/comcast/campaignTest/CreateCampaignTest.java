package varm.crm.comcast.campaignTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.CampaignsInformationPage;
import varm.crm.comcast.pomrepositoryutility.CampaignsPage;
import varm.crm.comcast.pomrepositoryutility.CreatingNewCampaignPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;

public class CreateCampaignTest extends BaseClass 
{
	@Test(groups= "smokeTest")
	public void createCampaignTest() throws Exception
	{

		int random = jlib.getRanDomNumber();

		String value1 = elib.getExcelData("Sheet1", 1, 3)+random;
		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.navigateToCampaign();

		CampaignsPage camp=new CampaignsPage(driver);
		camp.getPlusicon().click(); 

		CreatingNewCampaignPage create=new CreatingNewCampaignPage(driver);	
		create.campainNameEnter(value1);
		create.getSaveButton().click();

		CampaignsInformationPage inform=new CampaignsInformationPage(driver);
		String actual_result=	inform.getCampaignInformation().getText();
		
		String expected_Result = value1;
		Assert.assertEquals(actual_result.contains(expected_Result),true,"Campaign Name not created");
//		if(actual_result.contains(value1))
//		{
//			System.out.println("Campaign is succesfully logged out..");
//		}
//		else
//		{
//			System.out.println("campaign is not created...!");
//		}



	}
}
