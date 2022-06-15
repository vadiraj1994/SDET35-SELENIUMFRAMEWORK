package xmlconfiguration;

import org.testng.annotations.Test;

public class TC010
{
	@Test(groups= {"smoke","customer"})
	public void createCustomer()
	{
		System.out.println("Running create customer test case");
	}
	@Test(groups= "customer")
	public void deleteCustomer()
	{
		System.out.println("Running delete customer test case");
	}
	@Test(groups= {"smoke","project"})
	public void createProject()
	{
		System.out.println("Running create project test case");
	}
	@Test(groups= "project")
	public void deleteProject()
	{
		System.out.println("Running delete project test case");
	}
}
