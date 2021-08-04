package com.apisel.qa.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Selenium driver uitility class
 */
public abstract class SeleniumDriverUtils {
	protected WebDriver driver;
	public long totalTimeToLaunChPage = 0l;

	
	public SeleniumDriverUtils(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebDriver getWebDriver() {
		return driver;
	}

	/**
	 * Do refresh the current browser session
	 */
	public void refresh() {
		driver.navigate().refresh();
	}


	/**
	 * 
	 * @param element
	 * @param optionToSelect
	 */
	public void selectOption(WebElement element, String optionToSelect) {
		Select sel = new Select(element);
		sel.selectByVisibleText(optionToSelect);
	}

	

}
