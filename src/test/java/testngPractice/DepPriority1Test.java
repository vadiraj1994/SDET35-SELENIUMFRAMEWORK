package testngPractice;

import org.testng.annotations.Test;

public class DepPriority1Test 
{

	@Test(priority=-2)
	public void addFriend()
	{
		System.out.println("Running addFriend Test Case");	
	}
	
	@Test(priority=1)
	public void addCloseFriend()
	{
		System.out.println("Running closeFriend Test Case");	
	}
	@Test//defalut will be 0 priority
	public void addComment()
	{
		System.out.println("Running addComment Test Case");	
	}
	@Test(priority = -1)
	public void addFProfilePic()
	{
		System.out.println("Running addProfilePic Test Case");	
	}



	
	
}
