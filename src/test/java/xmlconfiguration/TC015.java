package xmlconfiguration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC015
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Running beforeTest testcase");
	}
	@Test
	public void addFamily1()
	{
		System.out.println("Running addFamily1 testcase");
	}
	@Test
	public void addFamily2()
	{
		System.out.println("Running addFamily2 testcase");
	}
	@AfterClass
	public void afterTest()
	{
		System.out.println("Running afterTest testcase");


	}
}
