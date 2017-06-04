package classTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class priorityTest {
	
	
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
	
	//skipping the test --- but will be showing under the report
	//disable the test ---- won't show in report

	
	@Test (priority = 4)
	public void skipTest() {
		System.out.println("skip Test");
		throw new SkipException("I am still working on it ");
	}
	
	
	@Test (priority = 5, enabled = false)
	public void disableskipTest(){
		System.out.println("disable the Test");
	}

	

}
