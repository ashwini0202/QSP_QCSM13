package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedAndIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 


		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.name("remember"));
		checkBox.click();
		Thread.sleep(2000);
		boolean flag = checkBox.isDisplayed();
		boolean flag2 = checkBox.isSelected();
		
		if (flag && flag2) {
			System.out.println("element is displayed and element is selected");
		} else {
			System.out.println("element is not displayed");
		}
		driver.quit();
		

	}

}
