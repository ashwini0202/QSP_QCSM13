package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).submit();
	}
	

}
