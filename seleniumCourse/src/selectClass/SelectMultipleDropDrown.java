package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleDropDrown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		
		Select select = new Select(dropDown);
		
		select.selectByIndex(2);
		select.selectByValue("opel");
		select.selectByVisibleText("Saab");
		
		WebElement firstElement = select.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		
		List<WebElement> allElements = select.getAllSelectedOptions();
		for(WebElement ele:allElements) {
			System.out.println(ele.getText());
		}
		select.deselectAll();
		select.deselectByIndex(2);
		select.deselectByValue("opel");
		
		driver.quit();
		
	

	}

}
