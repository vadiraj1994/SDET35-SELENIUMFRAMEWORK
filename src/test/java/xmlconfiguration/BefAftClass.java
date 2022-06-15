package xmlconfiguration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BefAftClass
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Running beforeClass");
	}
	@Test
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
