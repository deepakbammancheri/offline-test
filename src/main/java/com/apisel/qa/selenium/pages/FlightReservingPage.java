package com.apisel.qa.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apisel.qa.selenium.common.BasePageModule;

/**
 * Page factory class for reservation page
 *
 */
public class FlightReservingPage extends BasePageModule{
	
	
	public FlightReservingPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(css = "[placeholder=\"First Last\"]")
	private WebElement firstname;

	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "zipCode")
	private WebElement zipCode;
	
	@FindBy(id = "creditCardNumber")
	private WebElement creditCardNumber;	

	@FindBy(css = "[value=\"Purchase Flight\"]")
	private WebElement purchaseFlight;
	
	/**
	 * Flight reserving page factory class returning after filling the details
	 * @return
	 */
	public BookingCompletePage fillPassengerDetails(){
		
		firstname.sendKeys("Deepak B");
		address.sendKeys("KR Puram");
		city.sendKeys("Bangalore");
		state.sendKeys("KA");
		zipCode.sendKeys("560049");
		creditCardNumber.sendKeys("1234567891234567");
		purchaseFlight.click();		
		return PageFactory.initElements(driver, BookingCompletePage.class);
	}

}
