package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import config.Initialize;

public class MenuPage extends Initialize
{
	public static WebElement mainMenuList()
	{
		element = driver.findElement(By.id("main-bar"));
		return element;
	}
	
	
	public static class CommonFunctions
	{
		public static boolean menuSelection(String menuName)
		{
			String mN = menuName.toUpperCase();
			
			Actions action = new Actions(driver);
			
			WebElement list = mainMenuList();
			
			List <WebElement> li = list.findElements(By.tagName("a"));
						
			for(int i =0; i <li.size(); i++)
			{
				if(li.get(i).getText().contains(mN))
				{
					action.moveToElement(li.get(i));
					action.build().perform();
					return true;
				}
			}
			return false;
			
		}
	}
}
