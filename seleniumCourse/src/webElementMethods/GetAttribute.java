package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		String expectedToolTiptitle="Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
                                                                                                                                                                                                                                                                                               
		
		String actualToolTiptitle=driver.findElement((By) By.name("remember")).getAttribute("title");
		System.out.println(actualToolTiptitle);
		Object expectedToolTiptitle1 = null;
		if(expectedToolTiptitle1.equals(actualToolTiptitle)) {
			System.out.println("PASS tool tip is verified");
			
		}
		else {
			System.out.println("FAIL tool tip is verified");
		}
		

	}

}
