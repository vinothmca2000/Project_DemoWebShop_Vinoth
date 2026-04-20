package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.DemoWEbShop_GenericUtility.BaseTest;
import Com.DemoWEbShop_GenericUtility.ListenerUtility;
import Com.DemoWebShop_POM.AddNewAddress_Page;
import Com.DemoWebShop_POM.Address_Page;
@Listeners(ListenerUtility.class)
public class TC_001_Verify_user_is_able_to_add_new_address_or_not_Test extends BaseTest{
	
	@Test
	public void addAdress() throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		webDriverUtility.javaScriptScrollToElement(driver, homePage.getAddressbtn());
		homePage.getAddressbtn().click();
		
		Address_Page address_Page=new Address_Page(driver);
		webDriverUtility.javaScriptScrollToElement(driver, address_Page.getAddNewBtn());
		address_Page.getAddNewBtn().click();
		
		AddNewAddress_Page addNewAddress_Page=new AddNewAddress_Page(driver);
		addNewAddress_Page.getFirstNameTextField().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 0));
		addNewAddress_Page.getLastNameTextField().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 1));
		addNewAddress_Page.getEmailTextField().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 2));
		webDriverUtility.selectByvisibleText(addNewAddress_Page.getCountryDropDown(), fileUtility.readDataFromExcelStringFile("Sheet1", 1, 3));
		addNewAddress_Page.getCityTextField().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 4));
		addNewAddress_Page.getAddressTextField_1().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 5));
		addNewAddress_Page.getZipCodeTextField().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 6));
		addNewAddress_Page.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelStringFile("Sheet1", 1, 7));
		addNewAddress_Page.getSaveBtn().click();
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);
		System.out.println("New Commit for Scm test");
	}
	

}
