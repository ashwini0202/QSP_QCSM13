

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 


		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Rectangle usrenameTextField=driver.findElement(By.id("username")).getRect();
		int height=usrenameTextField.getWidth();
		int width=usrenameTextField.getHeight();
		int startX=usrenameTextField.getX();
		int startY=usrenameTextField.getY();
		System.out.println(width);
		System.out.println(height);
		System.out.println(startX);
		System.out.println(startY);
		
		driver.quit();
	}

}
