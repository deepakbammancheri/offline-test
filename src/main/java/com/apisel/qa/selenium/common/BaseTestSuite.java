/**
 * 
 */
package com.apisel.qa.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.apisel.qa.selenium.framework.WebDriverFactory;

/**
 * Base test class. A super class for all test classes *
 */
public class BaseTestSuite {
	protected WebDriver driver;
	protected HomePage homePage;

	/**
	 * Before class method to initialize the web driver
	 * @param context
	 * @throws Exception
	 */
	@BeforeClass(alwaysRun = true)
	public void intializePage(ITestContext context) throws Exception {
		String baseDir = System.getProperty("user.dir");
		String driverFilepath = "\\tools\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", baseDir+driverFilepath);
		driver = WebDriverFactory.getInstance(context.getCurrentXmlTest().getParameter("browser"), context.getCurrentXmlTest().getParameter("pageUrl"));
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	protected void refresh() {
		homePage.refresh();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
