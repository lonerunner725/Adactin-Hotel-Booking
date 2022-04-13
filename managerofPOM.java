package pomManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pomClasses.bookHotel;
import pomClasses.bookingConfirmation;
import pomClasses.login;
import pomClasses.searchHotel;
import pomClasses.selectHotel;

public class managerofPOM {
	WebDriver driver;

	private login log;
	private searchHotel search;
	private selectHotel select;
	private bookHotel book;
	private bookingConfirmation confirm;


	

	public selectHotel getinstanceSelect() {
		select = new selectHotel(driver);
		return select;
	}

	public bookHotel getinstanceBook() {
		book = new bookHotel(driver);
		return book;
	}

	public bookingConfirmation getinstanceConfirm() {
		confirm = new bookingConfirmation(driver);
		return confirm;
	}

	
	public searchHotel getinstanceSearch() {
		search= new searchHotel(driver);
		return search;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public login getinstanceLogin() {
		log = new login(driver);
		return log;
	}

	public managerofPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
