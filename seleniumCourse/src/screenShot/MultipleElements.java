package screenShot;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	private static final WebElement[] countryNames = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13407");
		java.util.List<WebElement> countryName = driver.findElements(By.xpath("table[@class='fc-ranking-list-full_rankingTable_1u4hs']/tbody/tr[*]/td[3]"));
		for(WebElement names: countryNames) {
			System.out.println(names.getText());
			
		}
		driver.quit();
	}

} 
