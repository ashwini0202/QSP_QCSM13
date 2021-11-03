package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	private static String frame;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		
				WebElement source=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(f;
				
				WebElement box=driver.findElement (By.id("draggable"));
				
				Actions action=new Actions(driver);
				action.dragAndDropBy(box,200,50).perform();
				
			
				//pass the driver controller to parentframe
				driver.switchTo().defaultContent();
				String text = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
				System.out.println(text);
				
				

	}

}
