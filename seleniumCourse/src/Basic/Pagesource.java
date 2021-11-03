package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    driver.get("https://www.kushals.com/?utm_source=adyogi&utm_medium=google-search&utm_campaign=KUSH_3261_adyogi_Brand-Search_Engage");
	    String source=driver.getPageSource();
	}

}
