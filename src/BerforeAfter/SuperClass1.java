package BerforeAfter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuperClass1 extends BaseClass{
	
	@Test
	public void testA()
	{
		Reporter.log("I am from test A",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("I am from test B",true);
	}

}
