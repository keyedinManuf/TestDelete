package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import config.Initialize;

public class ProductListPage extends Initialize 
{
	public static WebElement brandLists()
	{
		element = driver.findElement(By.className("filters"));
		return element;
	}
	
	public static class CommonFunctions
	{
		public static boolean brandSelection(String brandName)
		{
			String brandN = brandName;
			
			WebElement list = brandLists();
			
			List <WebElement> li = list.findElements(By.tagName("span"));
						
			for(int i =0; i <li.size(); i++)
			{
				System.out.print(li.get(i).getText()+"\n");
				if(li.get(i).getText().contains(brandN))
				{
					li.get(i).click();
					return true;
				}
			}
			return false;
			
		}
		
	}

}
