package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	
	@Test
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String providedTiltle="Facebook – log in or sign up";
		String outputTitle=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(providedTiltle, outputTitle);
	}

}
