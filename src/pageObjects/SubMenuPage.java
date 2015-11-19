package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.Initialize;

public class SubMenuPage extends Initialize 
{
	public static WebElement subMenuList()
	{
		element = driver.findElement(By.id("menu-pane"));
		return element;
	}
	
	public static class CommonFunctions
	{
		public static boolean menuSelection(String subMenuName)
		{
			String subMN = subMenuName;
			
			WebElement list = subMenuList();
			
			List <WebElement> li = list.findElements(By.tagName("a"));
						
			for(int i =0; i <li.size(); i++)
			{
				System.out.print(li.get(i).getText()+"\n");
				if(li.get(i).getText().contains(subMN))
				{
					li.get(i).click();
					return true;
				}
			}
			return false;			
		}
	}
	
}
