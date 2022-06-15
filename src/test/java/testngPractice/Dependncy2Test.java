package testngPractice;

import org.testng.annotations.Test;

//@Ignore
@Test(enabled = true)
public class Dependncy2Test
{

	public void addFriend()
	{
		System.out.println("Running addFriend Test Case");	
	}


	public void addCloseFriend()
	{
		System.out.println("Running addcloseFriend Test Case");	
	}

	public void addComment()
	{
		System.out.println("Running addComment Test Case");	
	}

	public void addFProfilePic()
	{
		System.out.println("Running addProfilePic Test Case");	
	}
}
