package BerforeAfter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuperClass2 extends BaseClass{
	
	@Test
	public void test()
	{
		Reporter.log("I am from test",true);
	}

}
