package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.Initialize;

public class HomePage extends Initialize
{
	public static WebElement click_Login()
	{
		element = driver.findElement(By.cssSelector(".profile1>span"));
		return element;
	}
	
	
}
