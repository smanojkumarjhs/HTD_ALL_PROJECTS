package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepo.DemoHomePage;
import utility.ExcelFileUtility;
import utility.PropertyFileUtility;
import utility.WebDriverUtility;

public class DemoBase {
	/**
	 * TO READ DATA
	 */
	PropertyFileUtility putil = new PropertyFileUtility();
	ExcelFileUtility eutil = new ExcelFileUtility();
	// TO PERFORM COMMON ACTIONS
	WebDriverUtility wutil = new WebDriverUtility();
	public WebDriver driver = null;

	@BeforeClass
	public void beforeClassConfiguration() throws IOException {
		driver = new ChromeDriver();
		Reporter.log("chrome browser got launched ", true);
		wutil.toMaximize(driver);
		wutil.toGiveImplicitWait(driver);
		String URL = putil.toReadDataFromPropertyFile("url");
		driver.get(URL);

	}

	@BeforeMethod
	public void beforeMethodConfiguration() throws IOException {
		String USERNAME = putil.toReadDataFromPropertyFile("Username");
		String PASSWORD = putil.toReadDataFromPropertyFile("Password");
		DemoHomePage DHP = new DemoHomePage(driver);
		DHP.getUserNameLink().sendKeys(USERNAME);
		DHP.getPasswordLink().sendKeys(PASSWORD);
		DHP.getSubmitButtonLink().click();

	}

	@AfterMethod
	public void afterMethodConfiguration() {
		DemoHomePage DHP = new DemoHomePage(driver);
		DHP.getLogoutdropDownMenuLink().click();
		DHP.getLogouLink().click();

	}

	@AfterClass
	public void afterClassconfiguration() {
		driver.quit();
	}

}
