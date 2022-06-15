package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rocky
{
	@Test
	public void mainTest() {

		Reporter.log("tc is running...");
		throw new ArithmeticException();
	}
}
