package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase15 {
	
	@DataProvider(name="credentials",parallel=true)
	public String[][] getData(){
		String [][] arr= {{"admin","manager"},{"traniee","trainee"}};
		return arr;
		
	}
	@Test(dataProvider="credentials")
	public void loginDemo(String username,String password) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitidome.com/login.");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("loginLink")).click();
	
        driver.quit();
		

}
}
