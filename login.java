package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	
	@FindBy(id="username") private WebElement username;
	   @FindBy(name="password")
	   private WebElement password;
	   @FindBy(id="login")
	   private WebElement loginbtn;
	
   public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginbtn;
	}
	
	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
