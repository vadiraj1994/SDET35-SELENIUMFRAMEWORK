package xmlconfiguration;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC004
{

	@Parameters({"browser"})
	@Test
	public void testLogin2(@Optional("edge")String browser)
	{
		System.out.println("From testLogin2::"+browser);

	}
}
