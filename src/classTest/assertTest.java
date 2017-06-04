package classTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class assertTest {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority = 1)
	public void assertPass(){
		
		String act = "abc";
		String exp = "abc";
		
		Assert.assertEquals(act, exp);
		System.out.println("TC1: PASS");
	}

	@Test (priority = 3)
	public void assertFail(){
		
		String act = "abc";
		String exp = "abcd";
		System.err.println("TC3: Going to fail");
		Assert.assertEquals(act, exp);
		System.out.println("FAILED");
	}
	
	
	@Test (priority = 2)
	public void softAssert(){
		
		String act = "abc";
		String exp = "abc";
		System.err.println("TC2: Going to fail");
		Assert.assertEquals(act, exp);
		System.out.println("Soft assert is working");
		softAssert.assertAll();
	}



	
}
