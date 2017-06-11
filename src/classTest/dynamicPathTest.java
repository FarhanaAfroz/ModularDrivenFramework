package classTest;

import org.testng.annotations.Test;

public class dynamicPathTest {
	
	
	@Test
	public void dynamicPath(){
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "//drivers//chromedriver.exe");
		
	
	
	
	}

}
