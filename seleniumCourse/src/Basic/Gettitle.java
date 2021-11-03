package Basic;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.bytecode.Throw;

public class Gettitle {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.actitime.com/faq-basics");
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTime-login";
		
			
		System.out.println(expectedTitle="+expectedTitle");
		System.out.println(actualTitle="+actualTitle");
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    
	    System.out.println("opening new tab");
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://google.com");
	    
	   // driver.close();
	    
	    System.out.print("quitting");
	    
	    
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				System.out.println("");
				//throw new Qspider("shutting down java bcz thread stopped.");
				
				throw new Qspider("shutting down java bcz thread stopped.", "drsc ksjdvhkhjvkefhvjevhfj");

		} catch(NullPointerException ex) {
			System.out.println("gsdhgsdfhe");
		}
	    
	    
	    
	    
	    
	    driver.quit();
		/* driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.facebook.com");
		/*if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS::TITLE IS CORRECT");
		}
			else {
				String x;
				

			System.out.println("FAIL::TITLE IS INCORRECT");
			driver.close();
			}*/
		
	
		}

	}


