package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel {
	
	WebDriver driver;
	
	@FindBy(name = "location") private WebElement location;
	
	@FindBy (id="hotels") private WebElement hotels;
	@FindBy(id = "room_type") private WebElement roomType;
	@FindBy (name = "room_nos") private WebElement roomNo;
	@FindBy(name="datepick_in") private WebElement checkIn;
	@FindBy(id="datepick_out") private WebElement checkOut;
	@FindBy(id="adult_room") private WebElement adultPerRoom;
	@FindBy(id="child_room") private WebElement childPerRoom;
	@FindBy(id="Submit") private WebElement searchBtn;
	@FindBy(id="Reset") private WebElement resetBtn;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getResetBtn() {
		return resetBtn;
	}
	
	public  searchHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
