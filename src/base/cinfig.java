package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cinfig {
	
	//log - log4j
	//baseURL - company website
	
	
	//set up browsers
	
	
	//start the suite
	//end suite 
	
    public WebDriver driver = null;
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before suite");
		//DB connection
		//suite start time
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("after suite");
		//close db
		//suite end time
	}
	
	//set up the browser
	@BeforeTest
	public void beforeTest(){
		System.out.println("Start the browser");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ 
				"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@AfterTest
	public void afterTest(){
		System.out.println("Browser will close now");
		//driver.close();
	}
	@Test
	public void Login(){
	System.out.println("fb signup test");
		
	}
	
	@Test
	public void Signout(){
	System.out.println("fb signup test");
		
	}
	
	
	
	
	@Test
	public void fbFooterlink(){
	System.out.println("fb footer link test");
		
	}


}
