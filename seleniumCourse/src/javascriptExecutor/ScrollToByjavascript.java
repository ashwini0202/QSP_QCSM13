package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToByjavascript {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		Thread.sleep(5000);
		js.executeScript("history.go(0)");
		
		driver.quit();

	}

}
