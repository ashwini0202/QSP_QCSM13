package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByUsingJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",loginButton);
		Thread.sleep(2000);
		
		//javascript for get the current page title 
		
		Object pageTitle = js.executeScript("return doucment.title");
		System.out.println(pageTitle);
		driver.quit();

		

	}

}
