package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro3Test 
{
	@DataProvider(name = "courseDetails",parallel = true) //parallel execution...
	public  Object[][] testData()
	{
		//	Object[][] arr= {{"Javacourse",90},{"SeleniumCourse",20},{"projectCourse",40}};//object
		//	return arr;
		return new Object[][]{{"Javacourse",90},{"SeleniumCourse",20},{"projectCourse",40}};

	}

	@Test(dataProvider = "courseDetails")

	public void testCourse(String courseName,int yoe)
	{
		System.out.println("course Name:"+courseName);
		System.out.println("Experience of:"+yoe+"years");

	}
}
