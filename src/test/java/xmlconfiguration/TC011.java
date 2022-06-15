package xmlconfiguration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC011
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Running before method");
	}
	@Test
	public void testCase1()
	{
		System.out.println("Running testcase1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("Running testcase2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Running afterMethod");
	}
}
