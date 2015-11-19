package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import config.Initialize;

public class LoginPage extends Initialize 
{
	public static  void brandLists()
	{
		System.out.print("function called");
		driver.switchTo().alert();
		
	}
	public static class CommonFunctions
	{
		public static boolean brandSelection(String brandName,String brandName1)
		{
			
			brandLists();
			driver.findElement(By.id("mobileNumber")).sendKeys(brandName);;
			driver.findElement(By.id("password")).sendKeys(brandName1);;
			driver.findElement(By.cssSelector(".proceedButton.btn-4.btn-4c.icon-arrow-right.btn.btn-primary.btn-lg.btn-block.proceedButtonAnimate"));
			return false;
		}
		
		

	}
		
}
	

