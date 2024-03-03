package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipeTimesCallingAMethod {
	
	@Test(invocationCount=5)
	public void multipleUser()
	{
		Reporter.log("User A",true);
	}

}
