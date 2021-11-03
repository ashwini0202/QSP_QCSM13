package PracticScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLoginAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//span[@class='desktop-userTitle']")).click();
		driver.findElement(By.xpath("//div[@class='desktop-getUserInLinks desktop-getInLinks']")).click();
	  driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("8867456104");
       driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
	}

}
