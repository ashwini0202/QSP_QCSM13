package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingScollByMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,100)");
		 
		 js.executeScript("window.scrollBy(0,-100)");
		 
		 js.executeScript("window.scrollBy(100,0)");
		 
		 js.executeScript("window.scrollBy(-100,0)");
		 
		 driver.quit();
		


	}

}
