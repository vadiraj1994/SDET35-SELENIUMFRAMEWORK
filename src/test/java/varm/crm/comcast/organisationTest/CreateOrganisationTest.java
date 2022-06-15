package varm.crm.comcast.organisationTest;

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
import varm.crm.comcast.pomrepositoryutility.CreateOrganisationPage;
import varm.crm.comcast.pomrepositoryutility.HomeVtigerPage;
import varm.crm.comcast.pomrepositoryutility.LoginToVtigerPage;
import varm.crm.comcast.pomrepositoryutility.OrganizationInformationPage;
import varm.crm.comcast.pomrepositoryutility.OrganizationsPage;

public class CreateOrganisationTest extends BaseClass
{
	@Test(groups={"smokeTest","regressionTest"})
	public void createOrganisationTest() throws Exception
	{

		int random = jlib.getRanDomNumber();//random num..
		String value = elib.getExcelData("Sheet1", 1, 3)+random;


		HomeVtigerPage home=new HomeVtigerPage(driver);
		home.getOrganization().click();

		OrganizationsPage org=new OrganizationsPage(driver);
		org.getPlusIcon().click();

		CreateOrganisationPage create=new CreateOrganisationPage(driver);
		create.OrgNameEnter(value);
		create.getSaveButton().click();

		OrganizationInformationPage inform=new OrganizationInformationPage(driver);
		String actual_result =inform.getOrganizeInformation().getText();
		

		String expected_Result = value;
		Assert.assertEquals(actual_result.contains(expected_Result),true,"Organization Name is not created");
		


	}
}
