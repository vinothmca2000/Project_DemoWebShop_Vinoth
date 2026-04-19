package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.DemoWEbShop_GenericUtility.BaseTest;
import Com.DemoWEbShop_GenericUtility.ListenerUtility;
import Com.DemoWebShop_POM.Book_Page;
import Com.DemoWebShop_POM.Cart_Page;
import Com.DemoWebShop_POM.CheckOut;


@Listeners(ListenerUtility.class)
public class TC003_Verify_User_is_able_to_add_product_to_Carts_Test extends BaseTest{

	@Test
	public void addToCart() throws IOException
	{
	homePage.getBooks().click();
	
	Book_Page book_Page=new Book_Page(driver);
	webDriverUtility.javaScriptScrollToElement(driver, book_Page.getComputer_Internet_AddToCart());
	book_Page.getComputer_Internet_AddToCart().click();
	webDriverUtility.javaScriptScrollToElement(driver, book_Page.getShopping_Cart());
	book_Page.getShopping_Cart().click();
	webDriverUtility.javaScriptScrollToElement(driver, book_Page.getShopping_Cart());
	book_Page.getShopping_Cart().click();
	
	Cart_Page cart_Page=new Cart_Page(driver);
	cart_Page.getSelectToCheckOut().click();
	cart_Page.getTerms_Condition().click();
	cart_Page.getCheckout().click();
	
	CheckOut checkOut=new CheckOut(driver);
	
	try {
		checkOut.getCheckoutPage().isDisplayed();
		webDriverUtility.webPageScreenShot(driver);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
