package varm.crm.comcast.genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility implements ITestListener
{
	public void onTestFailure(ITestResult result) //Method Overriding...
	
	{
		System.out.println("======Failure=====");

		JavaUtility jlib=new JavaUtility();

		String testName = result.getMethod().getMethodName();

		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.sDriver);
		
		File sourceFile=eDriver.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("./src/test/resources/screenShot/"+testName+"_"+jlib.getSystemDate()+".png");
		try{
			FileUtils.copyFile(sourceFile, destinationFile);
		}
		catch(IOException e)
		{
			System.out.println("========Exception Handled======");
		}
	}
	
	
}
