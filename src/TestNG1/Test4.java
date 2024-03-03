package TestNG1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test()
	public void registerUser()
	{
		Reporter.log("User is registered",true);
		
		
	}
	
	@Test()
	public void editUser()
	{
		Reporter.log("User is edited",true);
		Assert.fail();
	}
	
	//If sing;e depends on 
//	@Test(dependsOnMethods ="registerUser")
//	public void deleteUser()
//	{
//		Reporter.log("I am from delete user ",true);
//	}
	
	//If multiple depends on
	//If one one of the methods in depends on method fails then dependent method will be skipped
	@Test(dependsOnMethods ={"registerUser","editUser"})
	public void deleteUser()
	{
		Reporter.log("I am from delete user ",true);
	}
	

	//tp ignore
	@Test(enabled=false)
	public void deleteUser1()
	{
		Reporter.log("I am from delete user ",true);
	}
	
}
