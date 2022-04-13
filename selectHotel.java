package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel {
	WebDriver driver;
	
	@FindBy (name = "radiobutton_0") private WebElement radioBtn;
	@FindBy(name="continue") private WebElement continueBtn;
	@FindBy (id="cancel") private WebElement cancelBtn;
	
	
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	

	public selectHotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	

}
