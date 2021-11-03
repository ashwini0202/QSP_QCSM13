package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {

		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 


		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		Dimension dimensions=driver.findElement(By.id("username")).getSize();
		int heightOfUsernameTextField=dimensions.getHeight();
		int widthtOfUsernameTextField=dimensions.getWidth();

		System.out.println(heightOfUsernameTextField);
		System.out.println( widthtOfUsernameTextField);

		driver.quit();


	}

}
