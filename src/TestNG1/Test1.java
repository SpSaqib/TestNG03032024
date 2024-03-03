package TestNG1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testA()
	{
		Reporter.log("Hello",true);
		
	}
	
	@Test
	public void testB()
	{
		Reporter.log("I am from method B",true);
	}
	
	@Test
	public void testA1()
	{
		Reporter.log("I am from testA1 ",true);
	}

}
