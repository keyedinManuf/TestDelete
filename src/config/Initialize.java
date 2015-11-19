package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pageObjects.LoginPage;

public class Initialize 
{
	public static WebDriver driver = null;
	public static WebElement element = null;
	
	
	@BeforeClass
	public void beforeClass()
	{
		driver = new FirefoxDriver();
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		driver.get("https://paytm.com/");
	}
}
