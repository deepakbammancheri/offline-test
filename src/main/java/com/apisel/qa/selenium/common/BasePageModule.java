package com.apisel.qa.selenium.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.apisel.qa.selenium.framework.SeleniumDriverUtils;

/**
 * Base page class, a super class for all page factory classes *
 */
public class BasePageModule extends SeleniumDriverUtils {

	public BasePageModule(WebDriver driver) {
		super(driver);
	}

	protected static final int PAGE_LOAD_TIMEOUT = 20;

	/**
	 * Method to wait for a page to load completetly 
	 */
	@Deprecated
	public void waitForPageLoad() {

		try {
			Thread.sleep(3000);
			// waitForElementNotPresent(LOADING);
			setSeleniumImplicitWaitTimeout(PAGE_LOAD_TIMEOUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Selenium implicit wait timeout
	 * @param timeoutInSeconds
	 */
	public void setSeleniumImplicitWaitTimeout(int timeoutInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);
	}

}
