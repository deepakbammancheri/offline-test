package com.apisel.qa.selenium.framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverFactory {

	/**
	 * Method to create the browser instances
	 * @param browser
	 * @param website
	 * @return webdriver instance
	 * @throws IOException
	 */
	public static WebDriver getInstance(String browser, String website) {
		WebDriver driver = null;
		if (driver == null) {

			if (browser.equals("iexplorer")) {
				driver = new InternetExplorerDriver();

			} else if (browser.equals("firefox")) {
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities = DesiredCapabilities.firefox();
				capabilities.setBrowserName("firefox");
				capabilities.setPlatform(Platform.WINDOWS);
				capabilities.setCapability("marionette", false);
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			} else if (browser.equals("chrome")) {
				driver = new ChromeDriver();
			} else {
				driver = new HtmlUnitDriver(true);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				return driver;
			}

			// loading Browser with App URL
			driver.get(website);
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions
					.elementToBeClickable(driver.findElement(By.cssSelector("[value=\"Find Flights\"]"))));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.moveTo(0,0);");
			js.executeScript("window.resizeTo(screen.width,screen.height);");
		}
		return driver;
	}

}
