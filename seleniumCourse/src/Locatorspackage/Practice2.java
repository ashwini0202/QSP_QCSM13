package Locatorspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver =new ChromeDriver();
			 driver.get("https://www.myntra.com/");
			 driver.findElement(By.id("Mobile Number")).sendKeys("8867456104");
			 
	}
}
