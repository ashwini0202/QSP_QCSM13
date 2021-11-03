package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUPByRobotClass {

	public static void main(String[] args) throws Throwable {
		String expectedOnLineLoanTitle = "Life Insurance Corporation of India - Policy Loan Options";
		String expetedPageAfterClick = "Life Insurance Corporation of India";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		//robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyRelease(KeyEvent.VK_TAB);

		driver.quit();
		
		
		
		
		

	}

}
