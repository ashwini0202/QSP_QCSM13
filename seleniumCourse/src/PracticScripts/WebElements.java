package PracticScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
        WebElement womenLink = driver.findElement(By.xpath("//div[@class='desktop-user']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(womenLink).perform();
		
		driver.findElement(By.cssSelector("a.desktop-linkButton"));
		driver.findElement(By.id("tel")).sendKeys("8867456104");
		
		
	}

}
