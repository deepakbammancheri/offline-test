package com.apisel.qa.selenium.flightbooking;

import org.testng.annotations.Test;

import com.apisel.qa.selenium.common.BaseTestSuite;
import com.apisel.qa.selenium.pages.BookingCompletePage;
import com.apisel.qa.selenium.pages.FlightChoosingPage;
import com.apisel.qa.selenium.pages.FlightReservingPage;

import junit.framework.Assert;

/**
 * Test class for flight booking feature
 */
public class FlightBookingTest extends BaseTestSuite {

	FlightChoosingPage flightChosingPage;

	@Test
	public void verifySourceAndDestination() {
		
		String source = "Paris";
		String destination = "Rome";
		flightChosingPage = homePage.chooseSourceAndDestination(source, destination);
		Assert.assertEquals("Not matching with the source selected", flightChosingPage.getSourcePlaceText(), source);
		Assert.assertEquals("Not matching with the destination selected", flightChosingPage.getDestPlaceText(), destination);

	}

	@Test
	public void verifyAllChooseButton() {
		Assert.assertTrue("Not all buttons enabled though flight available", flightChosingPage.verifyAllChooseButton());
	}

	@Test
	public void verifyFlightBooking() {
		FlightReservingPage flightReservingPage = flightChosingPage.chooseFlight();
		BookingCompletePage bookingCompletePage = flightReservingPage.fillPassengerDetails();
		Assert.assertEquals("Not matching with the success message", bookingCompletePage.getSuccessMessage(),
				"Thank you for your purchase today!");
		Assert.assertNotSame("Something wrong, id not got created", bookingCompletePage.getBookingId(), "");
	}
}
