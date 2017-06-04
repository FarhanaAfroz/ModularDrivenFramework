package classTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationTest {
	
	
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
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("before the test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("after the test");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before the method");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("after the method");
	}
	
	@Test (priority = 1)
	public void loginTest(){
		System.out.println("login first");
	}
	
	@Test (priority = 3)
	public void logOutTest(){
		System.out.println("logout at the end");
	}

	@Test (priority = 2, dependsOnMethods = {"loginTest"})
	public void changePassword(){
		System.out.println("change password");
	}
	
	

}
