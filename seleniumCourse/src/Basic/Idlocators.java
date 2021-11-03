package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	     driver.get("https://login.yahoo.com/");
	     
	    WebElement username= driver.findElement(By.id("login-username"));
	    username.sendKeys("ashwini@yahoo.com");
	    
	    WebElement nextBtn=driver.findElement(By.id("login-signin"));
	    nextBtn.click();
	    driver.close();

	}

}
