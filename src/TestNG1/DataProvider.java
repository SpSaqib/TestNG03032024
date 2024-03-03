package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="admin";
		data[0][1]="12345";
		data[1][0]="admin1";
		data[1][1]="123456";
		
		return data;
	}
	
	@Test(dataProvider ="getData")
	public void createUser(Object un, Object pw)
	{
		Reporter.log(un +"\t"+pw,true);
	}

}
