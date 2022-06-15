package xmlconfiguration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiScript2Test extends BaseTest
{
	@Test
	public void testUsers() {
		
	
	WebElement usersLink = driver.findElement(By.linkText("Users"));
	Assert.assertTrue(usersLink.isDisplayed(), "users link is not displayed");
	Assert.assertEquals(usersLink.getText(), "users Text is not displayed");
	usersLink.click();

}
}