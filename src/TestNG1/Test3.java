package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
	final int i=1;
	@Test(priority=i)
	public void registerUser()
	{
		Reporter.log("User is registered",true);
	}
	
	//if method is not declared with any priority it will by default take priority as 0
	@Test
	public void testB()
	{
		Reporter.log("I ams from method B",true);
	}
	
	@Test(priority=2)
	public void deleteUser()
	{
		Reporter.log("I am from delete user ",true);
	}

}
