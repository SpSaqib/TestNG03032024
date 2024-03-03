package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testA()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String providedTiltle="Facebook – log in or sign up";
		String outputTitle=driver.getTitle();
		
		Assert.assertEquals(providedTiltle, outputTitle);
	}
	

}
