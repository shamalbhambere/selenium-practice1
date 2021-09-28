package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.util.TestUtil;
public class homePageTest extends TestBase {

	HomePage homePage;
	TestUtil mUtil = new TestUtil();
	
	public homePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {

		initialization();
		mUtil.printLog("Browser Trigger successful; Page Loaded");

		homePage = new HomePage();
    }
	@DataProvider
	public Object[][] getDataFromExcel() {
		Object data[][] = TestUtil.getTestData("Details");
		return data;
	}
	
	
	@Test
	public void clickONFlightTab() {
		  homePage.clickOnFlightTab();
		  mUtil.printLog("Flight linked opened");
			
	}
	
	@Test(dataProvider="getDataFromExcel")
	public void enterTravelDetails(String source ,  String destination) {
		
		mUtil.printLog("User entering source and destination details ");
		
		homePage.enterFromLocation(source);
		homePage.enterToLocation(destination);
		mUtil.printLog("Origin City - " + source
				+ " Destination City - " + destination);
		homePage.enterDates();
		homePage.clickOnSearch();

	}
	@AfterMethod
	public void tearDown() {
		homePage.closeBrowser();
	}
	
}