package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(invocationCount=3,threadPoolSize=2,description="ash")
	public void demo2() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		//wait.until(ExpectedConditions.titleIs(" actiTime - Enter Time-Track"));
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();

		
		
		
	}

}
