package scripts;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import pageObjects.LoginPage;
import config.Constants;
import config.Initialize;

public class LoginTest extends Initialize 
{
	@BeforeClass
	public void beforeClass()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void loginTest()
	{
		
		driver.get("https://paytm.com/shop/");
	}
}
