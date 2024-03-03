package Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuperClass2 extends BaseClass{
	
	@Test(priority=4, groups="sm")
	public void createTask()
	{
		Reporter.log("Task is created",true);
	}
	
	@Test(priority=5, groups={"sm","reg"})
	public void editTask()
	{
		Reporter.log("Task is edited",true);
	}

	@Test(priority=6, groups={"sm","reg"})
	public void deleteTask()
	{
		Reporter.log("Task is deleted",true);
	}
}
