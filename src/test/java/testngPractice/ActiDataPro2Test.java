package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiDataPro2Test
{

	@DataProvider(name = "Numeric Values")//it takes only two arguments..
	public Integer[] getData()  //1D Array
	{
	   //Integer[] arr= {10,20,30,40};
		return new Integer[] {10,20,30,40};
	}
	
	
	@Test(dataProvider = "Numeric Values")//it should be String
	public void testSomething(int a) 
	{
		System.out.println(a);
	}
		
}
