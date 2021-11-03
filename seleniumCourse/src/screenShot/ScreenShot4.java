package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot4 {

	public static void main(String[] args) throws IOException {
		
		String timeStamp=LocalDateTime.now().toString().replace(':','-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
        TakesScreenshot ts=(TakesScreenshot)driver;
        File tempFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshots/actiTime"+timeStamp+".png");
        FileUtils.copyFile(tempFile,destFile);
        driver.quit();
	}

}
