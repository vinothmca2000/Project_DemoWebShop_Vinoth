package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Address_Page {
	public Address_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath  = "(//input[@value='Delete'])[1]")
	private WebElement deleteBtn;
	
	@FindBy(xpath ="//input[@value='Add new']")
	private WebElement addNewBtn;

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	

}
