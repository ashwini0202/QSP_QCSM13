package pomClass;



		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Properties;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class TestCase3 {
		
		
		public static void main(String[] args) throws Throwable {
			String filePath = "./resources/prop.properties";
			FileInputStream file = new FileInputStream(filePath);
			
			Properties property = new Properties();
			property.load(file);
			
			String url = property.getProperty("url");
			String username = property.getProperty("username");
			String password = property.getProperty("password");
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			
			LoginPage login = new LoginPage(driver);
			//HomePage home = new HomePage(driver);
			login.login(username, password);
			//home.clickOnTask();
		}

	
	}


