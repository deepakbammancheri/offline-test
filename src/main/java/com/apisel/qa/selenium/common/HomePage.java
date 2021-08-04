/**
 * 
 */
package com.apisel.qa.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apisel.qa.selenium.pages.FlightChoosingPage;

/**
 * Landing page class - Home page class *
 */
public class HomePage extends BasePageModule {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private static final String SOURCE_CSS = "[name='fromPort']";
	private static final String DEST_CSS = "[name='toPort']";
	private static final String FIND_FLIGHT = "[value=\"Find Flights\"]";

	@FindBy(css = SOURCE_CSS)
	private WebElement sourceElement;

	@FindBy(css = DEST_CSS)
	private WebElement destElement;

	@FindBy(css = FIND_FLIGHT)
	private WebElement findFlight;

	/**
	 * Method to select source and destination
	 * @param source
	 * @param dest
	 * @return FlightChosingPage
	 */
	public FlightChoosingPage chooseSourceAndDestination(String source, String dest) {
		selectOption(sourceElement, source);
		selectOption(destElement, dest);
		findFlight.click();
		waitForPageLoad();
		return PageFactory.initElements(driver, FlightChoosingPage.class);
	}

}