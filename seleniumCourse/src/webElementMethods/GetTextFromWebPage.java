package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromWebPage {

	public static void main(String[] args) {

		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		
		System.out.println(driver.findElement(By.id("headerContainer")).getText());
		driver.quit();
	}

}
