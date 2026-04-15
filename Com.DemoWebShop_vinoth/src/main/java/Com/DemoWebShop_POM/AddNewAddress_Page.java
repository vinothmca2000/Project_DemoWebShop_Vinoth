package Com.DemoWebShop_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddress_Page {
	public AddNewAddress_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Address_FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "Address_LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "Address_Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Address_Company")
	private WebElement companyTextField;
	
	@FindBy(id = "Address_CountryId")
	private WebElement countryDropDown;
	
	@FindBy(id = "Address_City")
	private WebElement cityTextField;
	
	@FindBy(id = "Address_Address1")
	private WebElement AddressTextField_1;
	
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement zipCodeTextField;
	
	@FindBy(id="Address_PhoneNumber")
	private WebElement PhoneNumberTextField;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getAddressTextField_1() {
		return AddressTextField_1;
	}

	public WebElement getZipCodeTextField() {
		return zipCodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return PhoneNumberTextField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
		
	}

}
