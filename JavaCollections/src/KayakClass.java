package KayakFlights;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KayakClass {

	private static WebDriver mDriver = null;
	private static final String mBrowser = "firefox";
	private static final String mUrl = "http://www.kayak.com";
	private static final long mSleepTime = 3000;
	private static final Utils mUtil = new Utils();
	private static int SelectResultEntryNumberFromTheList = 3;
	private static final String[] mOriginCities = { "AMD", "LAX", "SFO"};
	private static final String[] mDestinationCities = { "SFO", "AMD", "AMD"};
	private static int mCounter = 0;
	private static final String FLIGHT_TAB = "/html/body/div[1]/div/div[2]/div/div/header/div/div[2]/nav/div/div[2]/a";
	private static final String COMPARE_SOURCE_ADDRESS = "/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/span[1]";
	private static final String COMPARE_DESTINATION_ADDRESS = "/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/span[3]";
	
	public static void main(String[] args) {
		getBrowser(mBrowser);
		mDriver.get(mUrl);
		mUtil.printLog("Browser Trigger successful; Page Loaded");

		// Click on the flight Tab
		mDriver.findElement(By.xpath(FLIGHT_TAB)).click();		
		mUtil.printLog("Flight linked opened");
		mUtil.sleep(mSleepTime);

		// Search for the flights
		searchTrips();
		
		// Select the search results
		selectSearchResult(SelectResultEntryNumberFromTheList);
		
		// Close the browser
		mUtil.printLog("Test completed. Closing the browser.");
		mDriver.close();
	}

	/**
	 * Initialize the browser by passing the browser
	 * 
	 * @param browser
	 */
	public static void getBrowser(String browser) {
		mUtil.printLog("Trying to trigger " + browser + " browser");
		if (browser.equals("firefox")) {
			mDriver = new FirefoxDriver();
		} 
	}

	/**
	 * A method to enter the values of the origin city and the destination city
	 * 
	 * @param origin
	 * @param destination
	 */
	public static void enterTravelCities(String origin, String destination) {
		mDriver.findElement(By.id("origin")).sendKeys(origin);
		mDriver.findElement(By.id("destination")).sendKeys(destination);
	}

	/**
	 * A method to select the dates from the date picker
	 * 
	 * @param departureDate
	 * @param arrivalDate
	 */
	public static void selectDates() {
		mDriver.findElement(By.id("travel_dates-start-wrapper")).click();
		mDriver.findElement(By.id("travel_dates-start-wrapper")).click();
		mUtil.sleep(mSleepTime);
		if (mCounter == 0) {
			// First Iteration (Flight Search Initial Page)
			mDriver.findElement(
					By.xpath("/html/body/div[10]/div[3]/span[2]/span[2]/span[4]/span[4]/span"))
					.click();
			mUtil.printLog("Departure Date Selected");
			mUtil.sleep(mSleepTime);
			mDriver.findElement(By.id("travel_dates-end-wrapper")).click();
			mDriver.findElement(
					By.xpath("/html/body/div[10]/div[4]/span[2]/span[2]/span[4]/span[3]/span"))
					.click();
			mUtil.printLog("Arrival Date Selected");
		} else {
			// Other Iterations (Flight Result Page)
			mDriver.findElement(
					By.xpath("/html/body/div[8]/div[3]/span[2]/span[2]/span[4]/span[4]/span"))
					.click();
			mUtil.printLog("Departure Date Selected");
			mUtil.sleep(mSleepTime);
			mDriver.findElement(By.id("travel_dates-end-wrapper")).click();
			mDriver.findElement(
					By.xpath("/html/body/div[8]/div[4]/span[2]/span[2]/span[4]/span[3]/span"))
					.click();
			mUtil.printLog("Arrival Date Selected");
		}
	}

	public static void searchTrips() {
		for (int i = 0; i < mOriginCities.length; i++) {
			clearSearchCriteria();

			// Enter the origin and destination cities
			mUtil.sleep(mSleepTime);
			enterTravelCities(mOriginCities[i], mDestinationCities[i]);
			mUtil.printLog("Origin City - " + mOriginCities[i]
					+ " Destination City - " + mDestinationCities[i]);

			
			mDriver.findElement(By.name("nearbyO")).click();
			mDriver.findElement(By.id("nearbyD")).click();
			mUtil.printLog("Nearby checkbox selected");
			
			// Select the arrival and departure date
			selectDates();
			// mUtil.printLog("Entered the dates in the system");

			// Pressing the change button on the Flight List to check for
			// the
			// next trip. The Search button is the Submit button on the
			// flight
			// list page.
			if (mCounter == 0) {
				mDriver.findElement(By.id("fdimgbutton")).click();
				mUtil.sleep(mSleepTime);
			} else {
				// Reset the search for the next screen
				// Tapping on Change button on the flight search result
				// screen
				mUtil.printLog("Inside else Condition. Trying to click the search button");
				if (mCounter == 0) {
					mUtil.printLog("Clicking the search button first time");
					mDriver.findElement(
							By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[10]/button"))
							.click();
				} else {
					mUtil.printLog("Clicking the search button second/third time");
					mDriver.findElement(
							By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/form/div/div[6]/button"))
							.click();
				}
			}

			mUtil.sleep(mSleepTime);

			// Check if the dialog box has shown up
			if (mCounter > 0) {
				WebElement dialogBox = mDriver.findElement(By
						.id("dialogContentnull"));
				mUtil.printLog("Ad Dialog Showed up - "
						+ dialogBox.getAttribute("visible"));
				if (Boolean.getBoolean(dialogBox.getAttribute("visible"))) {
					mDriver.findElement(
							By.xpath("/html/body/div[10]/div[2]/div[1]/div[2]"))
							.click();
				}
			}

			// Assert that the values are same as entered from the program
			mUtil.printLog("Comparing the entered source/destination cities with the cities in the flight search list");
			compareDestinations(mOriginCities[i], mDestinationCities[i]);

			// Press the search button to look for the results
			mUtil.printLog("Iteration - " + (i + 1)
					+ " completed. Starting the next iteration");
			mCounter++;
		}
	}

	public static void clearSearchCriteria() {
		if (mCounter != 0) {
			mDriver.findElement(
					By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[10]/button"))
					.click();
		}
		mDriver.findElement(By.id("origin")).clear();
		mDriver.findElement(By.id("destination")).clear();
	}

	public static void compareDestinations(String origin, String destination) {
		// Get the values from the text boxes
		String sourceCity = mDriver
				.findElement(
						By.xpath(COMPARE_SOURCE_ADDRESS))
				.getText();
		String destinationCity = mDriver
				.findElement(
						By.xpath(COMPARE_DESTINATION_ADDRESS))
				.getText();

		// Comapare the values
		Assert.assertTrue("The Origin Cities do not match",
				origin.contains(sourceCity));
		Assert.assertTrue("The destination cities do not match",
				destination.contains(destinationCity));
	}
	
	public static void selectSearchResult(int n) {
		mUtil.printLog("Selecting the search result as per the user input");
		mDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[8]/div[" + n+ "]/div/div/div[1]/div[2]/span[1]/a/span")).click();
	}
	
}
