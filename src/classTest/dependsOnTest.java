package classTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class dependsOnTest {
	
	@Test 
	public void loginTest(){
		System.out.println("login first");
		throw new SkipException("I am still working on it ");
	}
	
	@Test //(dependsOnMethods = {"loginTest","changePassword"})
	public void logOutTest(){
		System.out.println("logout at the end");
		
		//selenium code
	}

	@Test (dependsOnMethods = {"loginTest"})
	public void changePassword(){
		System.out.println("change password");
	}
	
	
}
