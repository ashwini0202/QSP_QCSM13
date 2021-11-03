package screenShot;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotForWebElement {

	private static File tempFile;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='bot_column']")).getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destfile = new File("./screenshots/"+timeStamp+"robot.png");
		tempFile.renameTo(destfile);
		
		driver.quit();
		
	}

}
