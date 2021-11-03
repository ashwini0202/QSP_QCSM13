package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/contactus.php?current=contactus");

		driver.findElement(By.name("Send")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("popup got handled");
		driver.quit();

	}

}
