package Guru99.Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C://WorkDriver/geckodriver-v0.24.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/");
	    driver.findElement(By.name("uid")).sendKeys("mngr351369");
		driver.findElement(By.name("password")).sendKeys("jAvEhup");
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		
		driver.close();
		
		
		
  
	}

}
