package testngPractice;

import org.testng.annotations.Test;

public class Dependency1Test 
{
	@Test
	public void addFriend()
	{
		System.out.println("Running addFriend Test Case");	
	}
	
	@Test
	public void addCloseFriend()
	{
		System.out.println("Running closeFriend Test Case");	
	}
	@Test
	public void addComment()
	{
		System.out.println("Running addComment Test Case");	
	}
	@Test
	public void addFProfilePic()
	{
		System.out.println("Running addProfilePic Test Case");	
	}




}
