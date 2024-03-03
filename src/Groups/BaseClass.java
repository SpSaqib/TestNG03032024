package Groups;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeMethod(alwaysRun=true)
	public void logIn()
	{
		Reporter.log("user is logged in",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logOut()
	{
		Reporter.log("user is logged out",true);
	}

}
