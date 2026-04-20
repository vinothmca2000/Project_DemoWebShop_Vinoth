package Com.DemoWEbShop_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.DemoWebShop_POM.Home_Page;
import Com.DemoWebShop_POM.Login_Page;
import Com.DemoWebShop_POM.Welcome_Page;


public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public FileUtility fileUtility = new FileUtility();
	public WebDriverUtility webDriverUtility = new WebDriverUtility();

	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;

	public Welcome_Page welcomePage;
	public Login_Page loginPage;
	public Home_Page homePage;

	@BeforeSuite
	public void bs() {
		System.out.println("@BeforeSuite Database Connected");
	}

	@BeforeTest
	public void bt() {
		System.out.println("@BeforeTest Report Started");
		spark = new ExtentSparkReporter(FrameWorkConstants.reportspath);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("Address Module");
		

	}

	@BeforeClass
	public void bc() throws IOException {
		System.out.println("@BeforeClass Browser Launched Successsfully");
//		String url = fileUtility.readDataFromPropertyFile("baseUrl");
//		String browserName = fileUtility.readDataFromPropertyFile("browserName");
		

		String browserName=System.getProperty("browserName");
		String url=System.getProperty("baseUrl");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		test.log(Status.INFO, "Browser Launched");
		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		test.log(Status.INFO, "Navigated to WelcomePage");

	}

	@BeforeMethod
	public void bm() throws IOException {
		System.out.println("@BeforeMethod Login");
		welcomePage = new Welcome_Page(driver);
		welcomePage.getLoginBtnElement().click();
		test.log(Status.INFO, "Navigated to Login Page");

		loginPage = new Login_Page(driver);
		loginPage.getEmailTextField().sendKeys(fileUtility.readDataFromPropertyFile("emailID"));
		loginPage.getPasswordTextField().sendKeys(fileUtility.readDataFromPropertyFile("password"));
		loginPage.getLoginBtn().click();
		test.log(Status.INFO, "Log in Successfully");
		homePage = new Home_Page(driver);

	}

	@AfterMethod
	public void am() throws IOException {
		System.out.println("@AfterMethod Log Out");
		homePage.getLogoutBtn().click();
		test.log(Status.INFO, "Log out Successfully");
	}

	@AfterClass
	public void ac() throws InterruptedException {
		System.out.println("@AfterClass Browser Closed");

		Thread.sleep(2000);
		driver.quit();

	}

	@AfterTest
	public void at() {
		System.out.println("@AfterTest Report Closed");
		reports.flush();
	}

	@AfterSuite
	public void as() {
		System.out.println("@AfterSuite Database DisConnected");

	}

}
