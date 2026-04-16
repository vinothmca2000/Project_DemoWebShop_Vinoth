package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.DemoWEbShop_GenericUtility.BaseTest;
import Com.DemoWEbShop_GenericUtility.ListenerUtility;
import Com.DemoWebShop_POM.Address_Page;
@Listeners(ListenerUtility.class)
public class TC_002_Verify_user_is_able_to_delete_adress_or_not_Test extends BaseTest{
	
	@Test
	public void addAdress() throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		webDriverUtility.javaScriptScrollToElement(driver, homePage.getAddressbtn());
		homePage.getAddressbtn().click();
		
		Address_Page address_Page=new Address_Page(driver);
		address_Page.getDeleteBtn().click();
		
		Thread.sleep(2000);
		webDriverUtility.alertForAccept(driver);
		
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);
		
		
	}
	

}
