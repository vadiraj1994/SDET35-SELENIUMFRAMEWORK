package varm.crm.comcast.purchaseordertest;

import org.testng.Assert;
import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;
import varm.crm.comcast.pomrepositoryutility.CreatingNewPurchaseOrderPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;
import varm.crm.comcast.pomrepositoryutility.PuchaseOrderInformationPage;
import varm.crm.comcast.pomrepositoryutility.PurchaseOrderPage;

public class CreatePurchaseOrderTest extends BaseClass
{
	@Test
	public void createPurchaseOrder() throws Exception
	{
		int random = jlib.getRanDomNumber();

		String value1 = elib.getExcelData("Sheet1", 0, 7)+random;
		String value2 = elib.getExcelData("Sheet1", 0, 8)+random;
		String value3 = elib.getExcelData("Sheet1", 0, 9)+random;
		String value4 = elib.getExcelData("Sheet1", 1, 4)+random;
		String value5= elib.getExcelData("Sheet1", 2, 4)+random;
		String value6= elib.getExcelData("Sheet1", 2, 0)+random;


		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.navigateToPurchaseOrder();

		PurchaseOrderPage purchase=new PurchaseOrderPage(driver);
		purchase.getPlusicon().click();

		CreatingNewPurchaseOrderPage create=new CreatingNewPurchaseOrderPage(driver);
		create.purchaseSubjectEnter(value1);
		create.getVendorPlusBtn().click();
		create.handleVendorPopup(value2);
		create.handleProductPopup(value5, value3, value6);
		create.getSaveButton().click();

		PuchaseOrderInformationPage inform=new PuchaseOrderInformationPage(driver);
		String actual_result=inform.getPurchaseInformation().getText();
		
		String expected_Result = value1;
		Assert.assertEquals(actual_result.contains(expected_Result),true,"Purchase Order is not created");

		
	}
}
