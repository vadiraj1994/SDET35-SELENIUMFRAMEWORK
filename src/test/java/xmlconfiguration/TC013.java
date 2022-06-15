package xmlconfiguration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC013 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Running beforeClass");
	}
	@Test(invocationCount = 2)
	public void addCloseFriend()
	{
		System.out.println("Running addCloseFriend testcase");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Running afterClass testcase");


	}
}
