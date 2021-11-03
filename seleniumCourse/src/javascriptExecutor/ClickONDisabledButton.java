package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickONDisabledButton {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		
		driver.findElement(By.xpath("//a[text()='jre-8u202-linux-i586.rpm']")).click();
		Thread.sleep(2000);
		
		 WebElement disabledLink = driver.findElement(By.xpath("//a[text()='jre-8u202-linux-i586.rpm']"));
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()",disabledLink);

	}

}

