package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	public CheckOut(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Checkout']")
	private WebElement checkoutPage;

	public WebElement getCheckoutPage() {
		return checkoutPage;
	}
	

}
