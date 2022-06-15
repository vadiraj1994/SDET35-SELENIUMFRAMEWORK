package testngPractice;

import org.testng.annotations.Test;

public class Dependency4GroupTest
{
	@Test(groups = "login")
	public void login()
	{
		System.out.println("Running addFriend Test Case");	
		//Assert.fail("Login Unsuccessful");
	}

	@Test(groups = "login")
	public void addFriend()
	{
		System.out.println("Running closeFriend Test Case");


	}
	
}
