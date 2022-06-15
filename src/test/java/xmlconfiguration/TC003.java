package xmlconfiguration;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC003
{
	
	@Parameters({"browser","url"})
	@Test
	public void testLogin1(String b,String u)
	{
		System.out.println("From testLogin1::"+b);
		System.out.println("From testLogin1::"+u);

	}
}
