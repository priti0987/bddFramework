package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver ;
	public login(WebDriver driver) {
		this.driver = driver;
	}

	By txt_userName = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login= By.id("login-button");
	
	
	public void enterUsername(String username) {
		System.out.println(username);
		driver.findElement(txt_userName).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

}
