package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.BB;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.PP;
import pageObjects.ProductListPage;
import pageObjects.SubMenuPage;
import config.Constants;
import config.Initialize;

public class ProductSelectionTest extends Initialize
{
	
	/*@Test
	public void mainMenuSelection()
	{
		MenuPage.CommonFunctions.menuSelection(Constants.menu1);
	}
	*/
	
	/*@Test
	public void subMenuSelection()
	{
		MenuPage.CommonFunctions.menuSelection(Constants.menu1);
		SubMenuPage.CommonFunctions.menuSelection(Constants.subMenu_1);
	}*/
	
	@Test
	public void brandSelection()
	{
		MenuPage.CommonFunctions.menuSelection(Constants.menu1);
		SubMenuPage.CommonFunctions.menuSelection(Constants.subMenu_1);
		ProductListPage.CommonFunctions.brandSelection(Constants.brandName_1);
		PP.CommonFunctions.brandSelection(Constants.brandName_2);
		BB.CommonFunctions.brandSelection(Constants.brandName_3);
		LoginPage.CommonFunctions.brandSelection(Constants.MobNo,Constants.PassWord);
		
	}
}
