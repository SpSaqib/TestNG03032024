package TestNG1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CheckStatus {
	
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int status=res.getStatus();
		String name = res.getName();
		Reporter.log("Test method name = "+name,true);
	}
	
	
	@Test
	public void testA()
	{
		Reporter.log(" Test A ",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log(" Test B",true);
		Assert.fail();
	}
	
}
