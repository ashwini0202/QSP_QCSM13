package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) {
		String filePath ="./resources/prop.properties";
		PropertyUtils proputil=new PropertyUtils();
		String URL=proputil.getPropertyData(filePath, "url");
		String username proputil.getPropertyData(filePath, "username");
		String password proputil.getPropertyData(filePath, "password");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get(URL);
		 
		 


	}

}
