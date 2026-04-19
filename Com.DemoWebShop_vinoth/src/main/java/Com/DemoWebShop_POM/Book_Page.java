package Com.DemoWebShop_POM;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Book_Page {
	public Book_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../../div[2]/div[3]/div[2]") 
	private WebElement computer_Internet_AddToCart;
	
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	private WebElement shopping_Cart;
	
	public WebElement getShopping_Cart() {
		return shopping_Cart;
	}

	public WebElement getComputer_Internet_AddToCart() {
		return computer_Internet_AddToCart;
	}
	
	

}
