package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) {
		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 


		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		String userNameTextField=driver.findElement(By.id("username")).getTagName();
		System.out.println(userNameTextField);
		driver.quit();
		
	}

}
