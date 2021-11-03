package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void Hard() {
		String expectedTitle="qspiders";
		String actualTitle="qspiders";
		
		boolean expectedflag=false;
		boolean actualflag=true;	
		
		//hard assertion
		//all methods are static in assert class
		//aasertequals method
		
		Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.assertEquals(actualflag, expectedflag);
		//Assert.assertTrue(actualflag);
		
	}

}
