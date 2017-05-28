package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WDFunctions {
	
	public static WebDriver driver;
	
	public void typeByXpath(String locators, String values){
		driver.findElement(By.xpath(locators)).clear();
		driver.findElement(By.xpath(locators)).sendKeys(values);
		
		
	}
	
	public void typeByName(String locators, String values){
		driver.findElement(By.name(locators)).clear();
		driver.findElement(By.name(locators)).sendKeys(values);
		
		
	}
	
	public void typeById(String locators, String values){
		driver.findElement(By.id(locators)).clear();
		driver.findElement(By.id(locators)).sendKeys(values);
		
		
	}
	
	public void clickByXpath(String locators){
		driver.findElement(By.id(locators)).click();
		
		
	}

}
