package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingConfirmation {
	WebDriver driver;
	@FindBy  (name="search_hotel") private WebElement searchHotelBtn;
	@FindBy (name="my_itinerary") private WebElement itineraryBtn;
	@FindBy (id="logout") private WebElement logoutBtn;
	
	public WebElement getSearchHotelBtn() {
		return searchHotelBtn;
	}
	public WebElement getItineraryBtn() {
		return itineraryBtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	public bookingConfirmation(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
