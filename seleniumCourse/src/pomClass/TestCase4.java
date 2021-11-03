package pomClass;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TestCase4{

		public static void main(String[] args) throws Throwable {
			String filePath = "./resources/prop.properties";
			FileInputStream file = new FileInputStream(filePath);
			
			Properties property = new Properties();
			property.load(file);
			
			String url = property.getProperty("url");
			String username = property.getProperty("username");
			String password = property.getProperty("password");
			
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.getTitle();
			
			LoginPage login = new LoginPage(driver);
			login.login(username, password);
			login.getDetails1();
			
			driver.quit();
		}

	}

}
