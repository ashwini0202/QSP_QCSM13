package popUp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowpOPuP {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        Thread.sleep(3000);
        
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyRelease(KeyEvent.VK_P);
       Thread.sleep(5000);
       
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       
       driver.quit();
        

	}

}
