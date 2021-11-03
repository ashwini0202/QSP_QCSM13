package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase11 {
	
	@Test
	public void login() {
		System.out.println("testcase");
		Reporter.log("test case id is 01", false);
		Reporter.log("test case is 02", true);
		Reporter.log("test case is displayed");
	}

}
