package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=myntra+url");
		String actualTitle=driver.getTitle();
		String expectedTitle="myntra-login";
		System.out.println("expectedTitle="+expectedTitle);
		System.out.println("actualTitle="+actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS::Title is correct+");
		}
		else {
			System.out.println("FAIL::Title is incorrect+");
		}
		

	}

}
