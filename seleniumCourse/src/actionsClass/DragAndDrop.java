package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
				WebElement source=driver.findElement(By.id("box3"));
				WebElement destination=driver.findElement (By.id("box103"));
				
				Actions action=new Actions(driver);
				Thread.sleep(3000);
				action.dragAndDrop(source, destination).perform();
				
				driver.quit();
				
				
		

	}

}
