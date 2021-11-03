package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		
		
		WebElement flag=driver.findElement(By.xpath("//input[@class='form-control']"));
		if(flag) {
			System.out.println("it is enabled");
			
		}
		else {
			System.out.println("it is not enabled");
		}
		driver.quit();
	}
}