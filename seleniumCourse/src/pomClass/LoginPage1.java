package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	public LoginPage1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			}
	
	
	@FindBy(id="username")
	private WebElement userNameTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[@class='button buttonBlue']")
	private WebElement siginButton;
	
	public void login(String username,String password) {
		userNameTextField.clear();
		userNameTextField.sendKeys(username);
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		
		
		
	}
}
