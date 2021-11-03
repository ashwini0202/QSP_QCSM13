package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowser {
	@Parameters("browser")
	@Test
	public void cross( String browserName) {
		WebDriver driver=null;
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver=new ChromeDriver();	
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();	
		}else {
			throw new NoSuchSessionException("browsernot compatible");
		}
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://demo.actitidome.com/login.");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("logoutLink")).click();



}
}
