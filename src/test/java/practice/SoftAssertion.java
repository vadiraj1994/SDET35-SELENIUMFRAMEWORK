package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{

	@Test
	public void CreateContact()
	{
		System.out.println("test1");
		System.out.println("test2");

		SoftAssert soft = new SoftAssert();
		soft.assertEquals("A", "B");//test3 and test4 are not executed....
	//OR	Assert.fail();
		System.out.println("test3");
		System.out.println("test4");
		
		soft.assertAll();//It is Mandatory.....
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
