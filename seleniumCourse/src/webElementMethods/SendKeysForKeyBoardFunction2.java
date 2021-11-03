package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForKeyBoardFunction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		
		WebElement passwordTextField=driver.findElement(By.id("pwd"));
		passwordTextField.sendKeys("manager");
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.ENTER);
		
	}

}
