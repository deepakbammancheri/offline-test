package com.apisel.qa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apisel.qa.selenium.common.BasePageModule;

/**
 * Page factory class for Booking completed page
 *
 */
public class BookingCompletePage extends BasePageModule {
	
	
	public BookingCompletePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class='container hero-unit']//h1")
	private WebElement successText;
	
	@FindBy(xpath = "//table//tr/td[text()='Id']/following-sibling::td")
	private WebElement bookingId;
	
	/**
	 * Method to get the success message
	 * @return
	 */
	public String getSuccessMessage() {
		return successText.getText();
	}
	
	/**
	 * Method to get the booking id
	 * @return
	 */
	public String getBookingId() {
		return bookingId.getText();
	}

}
