package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTheValueToDisabledField {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement disabledField = driver.findElement(By.xpath("//input [@class='form-control']"));
		Thread.sleep(5000);
        
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//pass the value to the disabled textfield
		js.executeScript("arguments[0].value'ashwini'", disabledField);
		
		driver.quit();

	}

}
