package practice;

import org.testng.annotations.Test;

import varm.crm.comcast.genericutility.BaseClass;

public class SampleTest extends BaseClass
{
	@Test(groups="smokeTest")
	public void createContactTest() 
	{
		System.out.println("contact created");
	}

	@Test(groups="regressionTest")
	public void editContactTest() 
	{
		System.out.println("contact edited");
	}
	@Test
	public void deleteContactTest() 
	{
		System.out.println("contact deleted");
	}
	@Test
	public void updateContactTest() 
	{
		System.out.println("contact updated");
	}
}