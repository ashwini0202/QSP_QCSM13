package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 


		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement usernameTextField=driver.findElement(By.id("username"));
		int startX=usernameTextField.getLocation().getX();
		int startY=usernameTextField.getLocation().getY();
		System.out.println(startX);
		System.out.println(startY);
		
		driver.quit();
		

	}

}
