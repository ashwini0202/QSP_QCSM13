package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotByMaven {

	private static File tempFile;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginButton")).getScreenshotAs(OutputType.FILE);
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		File destfile = new File("./screenshots/"+timeStamp+"robot.png");
		FileUtils.copyFile(destfile, destfile);
		tempFile.renameTo(destfile);
		driver.quit();
		
		
	
	}

}
