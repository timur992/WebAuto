package Automation.WebAuto;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWebTest {
	// driver is a Class Level variable and its empty
	WebDriver driver;
	
	@BeforeMethod// -- will be run before each test method.
	public void setUp() throws InterruptedException {
		// System variables need to know what type of the driver we are using and the
		// path to the driver
		WebDriverManager.chromedriver().setup();//webdriver manager

		// instantiate and initialized a webdriver variable which is Chrome
		driver = new ChromeDriver();
		
		String urlLoginPage = "https://facebook.com";

		driver.get(urlLoginPage);

		Thread.sleep(2000);
	}
	
	@AfterMethod // -- will be run after each test method.
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	
	@Test
	public void loginWithIncorrectPasswordTest() throws InterruptedException {
		
		System.out.println("Hello FaceBook");

	}
}
