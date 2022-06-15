package varm.crm.comcast.campaignTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.CampaignsInformationPage;
import varm.crm.comcast.pomrepositoryutility.CampaignsPage;
import varm.crm.comcast.pomrepositoryutility.CreatingNewCampaignPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;

public class CreateCampaignWithProductTest extends BaseClass
{
	
	@Test(groups="smokeTest")
	public void createCampaignWithProductTest() throws Exception
	{
	
		int random = jlib.getRanDomNumber();
		String value1 = elib.getExcelData("Sheet1", 0, 5)+random;
		String value2 = elib.getExcelData("Sheet1", 0, 6)+random;

		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.navigateToCampaign();

		CampaignsPage camp=new CampaignsPage(driver);
		camp.getPlusicon().click(); 

		CreatingNewCampaignPage create=new CreatingNewCampaignPage(driver);
		create.campainNameEnter(value1);
		create.getProductPlusBtn().click();
		create.handlePopup(value2);
		create.getSaveButton().click();
	

		CampaignsInformationPage cinform=new CampaignsInformationPage(driver);
		String actual_result=cinform.getCampaignInformation().getText();
		
		String expected_Result = value1;
		Assert.assertEquals(actual_result.contains(expected_Result),true,"Create Campaign With Prodcut not created");


	}

}

