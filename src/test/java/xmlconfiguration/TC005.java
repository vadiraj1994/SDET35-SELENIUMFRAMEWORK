package xmlconfiguration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC005 
{

	@Parameters("browser")
	@Test
	public void testLogin3(String browser)
	{
		System.out.println("From testLogin3::"+browser);

	}
}
