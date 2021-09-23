package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	int mCounter = 0;
	@FindBy(xpath = "//div[@aria-label='Flight origin input']")
	WebElement fromLocation;
	@FindBy(xpath = "//div[@class='Flight destination input']")
	WebElement toLocation;
	@FindBy(xpath = "//a[@href='/flights']")
	WebElement Flight_Tab;
	@FindBy(xpath = "//div[@class='mkUa mkUa-pres-default mkUa-isStartDate mkUa-isSelected']")
	WebElement fromDate;
	@FindBy(xpath = "//div[@class='mkUa mkUa-pres-default mkUa-isEndDate mkUa-isSelected']")
	WebElement toDate;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnFlightTab() {
		Flight_Tab.click();

	}

	public void enterFromLocation(String fromData) {
		fromLocation.sendKeys(fromData);
	}

	public void enterToLocation(String toData) {
		toLocation.sendKeys(toData);
	}

	public void fromeDateClick() {
		fromDate.click();
	}

	public void toDateClick() {
		toDate.click();
	}

	public void enterDates() {
		fromDate.click();

		driver.findElement(By.xpath("/html/body/div[10]/div[3]/span[2]/span[2]/span[4]/span[4]/span")).click();

		toDate.click();
		driver.findElement(By.xpath("/html/body/div[10]/div[4]/span[2]/span[2]/span[4]/span[3]/span")).click();

	}

	public void clickOnSearch() {
		search.click();
	}
	
	public void closeBrowser() {
		driver.close();
	}

}
