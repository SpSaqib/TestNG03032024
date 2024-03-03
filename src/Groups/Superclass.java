package Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Superclass extends BaseClass{
	
	@Test(priority=1, groups="sm")
	public void createUser()
	{
		Reporter.log("User is created",true);
	}
	
	@Test(priority=2, groups={"sm","reg"})
	public void editUser()
	{
		Reporter.log("User is Edited",true);
	}
	
	@Test(priority=3, groups="reg")
	public void deleteUser()
	{
		Reporter.log("User is deleted",true);
	}

}
