package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Home_Page {
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);	
	}
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutBtn;
	
	@FindBy(partialLinkText = "Addresses")
	private WebElement addressBtn;
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement books;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement Computers;
	
	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement Electronics;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel')])[1]")
	private WebElement Apparel;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital')])[1]")
	private WebElement Digital;
	
	@FindBy(xpath = "(//a[contains(text(),'Jewelery')])[1]")
	private WebElement Jewelery;
	
	@FindBy(xpath = "(//a[contains(text(),'Gift')])[1]")
	private WebElement Gift;

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getAddressbtn() {
		return addressBtn;
	}
	
	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputers() {
		return Computers;
	}

	public WebElement getElectronics() {
		return Electronics;
	}

	public WebElement getApparel() {
		return Apparel;
	}

	public WebElement getDigital() {
		return Digital;
	}

	public WebElement getJewelery() {
		return Jewelery;
	}

	public WebElement getGift() {
		return Gift;
	}

}
