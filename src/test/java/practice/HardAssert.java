package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{

	@Test
	public void CreateContact()
	{
		System.out.println("test1");
		System.out.println("test2");

		Assert.assertEquals("A", "B");//test3 and test4 are not executed....
	//OR	Assert.fail();
		System.out.println("test3");
		System.out.println("test4");
	}
	@Test
	public void modifyContact()
	{
		System.out.println("test4");
		System.out.println("test5");
		System.out.println("test6");
		System.out.println("test7");

	}
}