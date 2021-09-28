package xeproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class projectxe {
	
	public static void main(String[] arg) {
		
		System.setProperty("webdriver.gecko.driver","C:\\\\WorkDriver\\\\geckodriver-v0.24.0-win64\\\\geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://xe.com");
		
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@id='midmarketFromCurrency']")).sendKeys("IQD");
		
		driver.findElement(By.xpath("//ul[@id='midmarketFromCurrency-listbox']//li[@id='midmarketFromCurrency-option-0']")).click();
		
		driver.findElement(By.xpath("//input[@id='midmarketToCurrency']")).sendKeys("JPY");
		
		driver.findElement(By.xpath("//ul[@id='midmarketToCurrency-listbox']//li[@id='midmarketToCurrency-option-0']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
}