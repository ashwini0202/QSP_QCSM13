package testNG;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void soft() {
		String expectedTitle="qspiders";
		String actualTitle="qspider";
		
		

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedTitle,actualTitle);
		softAssert. ();
	}
		
		

		
		
		


}
