package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	public Cart_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@name='removefromcart'])[2]")
	private WebElement selectToCheckOut;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement terms_Condition;
	
	@FindBy(xpath = "//button[@value='checkout']")
	private WebElement checkout;

	public WebElement getSelectToCheckOut() {
		return selectToCheckOut;
	}

	public WebElement getTerms_Condition() {
		return terms_Condition;
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
