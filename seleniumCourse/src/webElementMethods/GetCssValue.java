package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		String colorOfLoginButton= driver.findElement(By.id("loginButton"))
		                            .getCssValue("border-top-color");
		System.out.println(colorOfLoginButton);
		
		String borderbottomstyle = driver.findElement(By.name("username"))
				                    .getCssValue("border-bottom-style");
		System.out.println(borderbottomstyle);
		
		driver.findElement(By.id("username"));
		
		
		
	}

}
