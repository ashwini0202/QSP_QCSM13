package actionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingMouseHovering {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Actions action=new Actions(driver);
	    action.moveByOffset(234, 345).click().perform();
		driver.quit();
        //Actions action1=new Actions(driver);
        //action1.moveByOffset(200, 300).click().perform();
        
	}

}

