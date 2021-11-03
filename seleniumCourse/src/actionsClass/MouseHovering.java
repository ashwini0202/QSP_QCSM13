package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement womenLink = driver.findElement(By.linkText("WOMEN"));
		
		Actions action=new Actions(driver);
		action.moveToElement(womenLink).perform();
		
		driver.quit();
		
	}

}
