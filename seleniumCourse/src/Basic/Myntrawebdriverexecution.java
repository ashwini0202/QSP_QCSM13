package Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntrawebdriverexecution {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SHIVANAND\\eclipse-workspace\\Facebook\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
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
