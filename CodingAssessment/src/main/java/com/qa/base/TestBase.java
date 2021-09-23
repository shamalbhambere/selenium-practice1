package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\workspace\\selenium-practice\\CodingAssessment\\src\\main\\java\\com\\qa\\config\\Configration.Properties");
			prop.load(fis);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void initialization() {

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\WorkDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (prop.getProperty("browser").equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\WorkDriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (prop.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.gecko.driver", "C:\\WorkDriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
         driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}


}
