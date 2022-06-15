package xmlconfiguration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC014 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Running beforeClass");
	}
	@Test
	public void addCloseFriend2()
	{
		System.out.println("Running addCloseFriend2 testcase");
	}
	@Test
	public void addCloseFriend3()
	{
		System.out.println("Running addCloseFriend3 testcase");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Running afterClass testcase");


	}
}
