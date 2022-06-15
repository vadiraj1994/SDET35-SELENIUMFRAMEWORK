package xmlconfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiScript1Test extends BaseTest
{
	@Test
	public void testReport()
	
	{
		
	WebElement ReportsLink = driver.findElement(By.linkText("Reports"));
	Assert.assertTrue(ReportsLink.isDisplayed(), "Reports link is not displayed");
	Assert.assertEquals(ReportsLink.getText(), "Reports","Reports Text is not displayed");
	ReportsLink.click();
}}
