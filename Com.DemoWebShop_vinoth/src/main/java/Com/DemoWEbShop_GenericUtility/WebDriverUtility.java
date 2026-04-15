package Com.DemoWEbShop_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public void webPageScreenShot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(FrameWorkConstants.screenshotPath);
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}
	
	public void webElementScreenShot(WebElement element) throws IOException
	{
		File temp=element.getScreenshotAs(OutputType.FILE);
		File dest=new File(FrameWorkConstants.screenshotPath);
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}
	
	public void javaScriptScrollToElement(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void javaScriptClick(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		}
	
	public void selectByvisibleText(WebElement element, String text) {
		Select se=new Select(element);
		se.selectByVisibleText(text);
	}
	
	public void alertForAccept(WebDriver driver) {
		driver.switchTo().alert().accept();

	}
	

}
