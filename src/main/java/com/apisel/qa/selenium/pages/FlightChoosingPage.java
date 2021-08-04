package com.apisel.qa.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apisel.qa.selenium.common.BasePageModule;

/**
 * Page factory class for Flight choosing page
 *
 */
public class FlightChoosingPage extends BasePageModule{
	
	
	public FlightChoosingPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//table[@class=\"table\"]//th[4]")
	private WebElement fromFlightTest;
	
	@FindBy(xpath = "//table[@class=\"table\"]//th[5]")
	private WebElement toFlightTest;
	
	
	@FindBy(css = "[value=\"Choose This Flight\"]")
	private List<WebElement> chooseFlight;
	
	public String getSourcePlaceText(){
		return fromFlightTest.getText().split(":")[1].trim();
	}
	
	public String getDestPlaceText(){
		return toFlightTest.getText().split(":")[1].trim();
	}
	
	public FlightReservingPage chooseFlight() {
		
		chooseFlight.get(0).click();
		return PageFactory.initElements(driver, FlightReservingPage.class);
		
	}
	
	/**
	 * Method to verify all Choose the flight button for all available flights to book
	 * @return flag
	 */
	public boolean verifyAllChooseButton() {
		boolean flag = false;
		for (WebElement webElement : chooseFlight) {
			if(webElement.isDisplayed()) {
				flag = true;
			}
		}
		return flag;
	}

}
