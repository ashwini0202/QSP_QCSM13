package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
         driver.get("https://demoapp.skillrary.com/product.php?product=cucumber");
        WebElement plusIcon = driver.findElement(By.id("quantity"));
        Actions action=new Actions(driver);
        action.doubleClick(plusIcon).perform();
        
         
	}

}
