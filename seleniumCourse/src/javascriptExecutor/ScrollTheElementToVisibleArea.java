package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTheElementToVisibleArea {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("")).click();
        WebElement ceojobsLink=driver.findElement(By.xpath(""));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView9(false)", ceojobsLink);
        
        driver.quit();
		

		
	}

}
