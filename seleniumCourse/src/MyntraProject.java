import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		

	
		
		driver.get("https://www.myntra.com/login?userQuery=true");
		
		driver.findElement(By.id("tel")).sendKeys("8867456104");
	}

}	 
