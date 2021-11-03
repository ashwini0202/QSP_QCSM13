package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUserNameTextField().sendKeys("admin");
		loginpage.getPassworTextField().sendKeys("manager");
		loginpage.getLoginButton().click();
		driver.quit();
		
		
		

	}

}
