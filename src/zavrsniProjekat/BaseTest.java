package zavrsniProjekat;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import zavrsniProjekat.BaseClass;
 
public class BaseTest {
 
	public static WebDriver driver;
	protected static BaseClass basePage;
 
	@BeforeTest
	public static void launchApplication(){
		setFirefoxDriverProperty();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		basePage = new BaseClass();
		basePage.setWebDriver(driver);
	}
 
	@AfterTest
	public static void closeBrowser(){
		driver.quit();
	}
 
	private static void setFirefoxDriverProperty(){
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\m\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	}
}
