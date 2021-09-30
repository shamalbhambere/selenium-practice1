package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	WebDriverWait wait = new WebDriverWait(driver, 30);

	@FindBy(xpath = "//div[@class='zEiP-formFieldOutline'][1]//input[@placeholder='From?']")
	WebElement fromLocation;

	@FindBy(xpath = "//div[@class='lNCO-textInputWrapper']//input[@placeholder='From?']")
	WebElement fromLocation2;

	@FindBy(xpath = "//ul[@role='tablist']//li[1]")
	WebElement NearestOption;

	@FindBy(xpath = "//div[@class='zEiP-formFieldOutline']//input[@placeholder='To?'][1]")
	WebElement toLocation;

	@FindBy(xpath = "//div[@class='lNCO-textInputWrapper']//input[@placeholder='To?']")
	WebElement toLocation2;

	@FindBy(xpath = "//a[@href='/flights']")
	WebElement Flight_Tab;

	@FindBy(xpath = "//div[@class='cQtq-input'][1]//span[@class='cQtq-date' and @role='button']")
	WebElement fromDate;

	@FindBy(xpath = "//div[@class='cQtq-input'][2]//span[@class='cQtq-date' and @role='button']")
	WebElement toDate;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;

	@FindBy(xpath = "//div[@role='list']//div[@role='button']")
	WebElement cleanUp;

	@FindBy(xpath = "//div[@role='textbox' and @aria-label='Flight origin input']")
	WebElement textWrapper;
	
	@FindBy(xpath = "//div[@role='textbox' and @aria-label='Flight destination input']")
	WebElement toTextWrapper;
	
	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnFlightTab() {
		Flight_Tab.click();

	}

	public void enterFromLocation() throws InterruptedException {
		cleanUp.click();

		// For input case 1 when input is directly available
		boolean fromPresent = driver
				.findElements(By.xpath("//div[@class='zEiP-formFieldOutline']//input[@placeholder='From?']"))
				.size() > 0;
		// For input case 2 when input is available after clicking on wrapper
		boolean from2Present = driver
				.findElements(By.xpath("//div[@class='lNCO-textInputWrapper']//input[@placeholder='From?']"))
				.size() > 0;

		if (fromPresent) {
			System.out.println("executing case 1 for source");
			fromLocation.sendKeys("BOM");
		} else if (from2Present) {
			System.out.println("executing case 2 for source");
			fromLocation2.sendKeys("BOM");
		} else {
			System.out.println("executing case 3 for source");
			textWrapper.click();
			fromLocation2.sendKeys("BOM");
		}
		System.out.println("selecting nearest option for source");
		Thread.sleep(1000);
		NearestOption.click();
	}

	public void enterToLocation() throws InterruptedException {

		boolean toPresent = driver.findElements(By.xpath("//div[@class='zEiP-formFieldOutline']//input[@placeholder='To?'][1]"))
				.size() > 0;
		boolean to2Present = driver
				.findElements(By.xpath("//div[@class='lNCO-textInputWrapper']//input[@placeholder='To?']")).size() > 0;

		if (toPresent) {
			System.out.println("executing case 1 for destination");
			toLocation.sendKeys("JFK");
		} else if (to2Present) {
			System.out.println("executing case 2 for destination");
			toLocation2.sendKeys("JFK");
		} else {
			System.out.println("executing case 3 for destination");
			toTextWrapper.click();
			toLocation2.sendKeys("JFK");
		}
		System.out.println("selecting nearest option for destination");
		Thread.sleep(1000);
		NearestOption.click();
	}

//	public void fromeDateClick() {
//		fromDate.click();
//	}
//
//	public void toDateClick() {
//		toDate.click();
//	}

	public void enterDates() throws InterruptedException {
		fromDate.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mkUa mkUa-pres-default' and @aria-label='October 29, 2021']"))
				.click();

//		toDate.click();
		driver.findElement(By.xpath("//div[@class='mkUa mkUa-pres-default' and @aria-label='November 9, 2021']"))
				.click();

	}

	public void clickOnSearch() {
		search.click();
	}

	public void closeBrowser() {
		driver.close();
	}

}
