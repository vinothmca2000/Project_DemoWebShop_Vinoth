package Com.DemoWEbShop_GenericUtility;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility implements ITestListener{
	WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot) BaseTest.sDriver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(FrameWorkConstants.listenersScreenShotPath);
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
