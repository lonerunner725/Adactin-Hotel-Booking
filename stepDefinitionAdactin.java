package adacStepDefine;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Reader.FileManagerReader;

import AdacRunnerClass.runnerAdactin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataDriven.adacDataDriven;
import main_classes.base;
import pomManager.managerofPOM;

public class stepDefinitionAdactin extends base {
	public static WebDriver driver = runnerAdactin.driver;
	
	public static managerofPOM pom = new managerofPOM(driver);
	
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
	   // getUrl("https://adactinhotelapp.com/index.php");
	    getUrl(FileManagerReader.getInstanceFR().getInstanceCr().geturl());
		
	    //driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enters The Username In The Inputbox$")
	public void user_Enters_The_Username_In_The_Inputbox() throws Throwable {
sendValues(pom.getinstanceLogin().getUsername(), adacDataDriven.getExcelValue(0, 1, 0));
	}

	@When("^user Enters the Password In The Inputbox$")
	public void user_Enters_the_Password_In_The_Inputbox() throws Throwable {
sendValues(pom.getinstanceLogin().getPassword(), adacDataDriven.getExcelValue(0, 1, 1));
	}

	@Then("^user Clicks On The LoginButton And It Navigates To The Search Hotel Page$")
	public void user_Clicks_On_The_LoginButton_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	    pom.getinstanceLogin().getLoginButton().click();
	}

	@When("^user Selects The Location Dropdownbox$")
	public void user_Selects_The_Location_Dropdownbox() throws Throwable {
	   singleDropdown(pom.getinstanceSearch().getLocation(), "index", "3");
	}

	@When("^user Selects The Hotel Dropdownbox$")
	public void user_Selects_The_Hotel_Dropdownbox() throws Throwable {
       singleDropdown(pom.getinstanceSearch().getHotels(), "index", "2");	    
	}

	@When("^user Selects The RoomType Dropdownbox$")
	public void user_Selects_The_RoomType_Dropdownbox() throws Throwable {
	  singleDropdown(pom.getinstanceSearch().getRoomType(), "index", "3");
	}

	@When("^user Selects The Number Of Rooms Dropdownbox$")
	public void user_Selects_The_Number_Of_Rooms_Dropdownbox() throws Throwable {
        singleDropdown(pom.getinstanceSearch().getRoomNo(), "index", "2");	    
	}

	@When("^user Clears The Checkin Date Inputbox$")
	public void user_Clears_The_Checkin_Date_Inputbox() throws Throwable {
	    pom.getinstanceSearch().getCheckIn().clear();
	}

	@When("^user Enters The Checkin Date In Inputbox$")
	public void user_Enters_The_Checkin_Date_In_Inputbox() throws Throwable {
	   sendValues(pom.getinstanceSearch().getCheckIn(), "10/04/2022");
	}

	@When("^user Clears The Checkout Date Inputbox$")
	public void user_Clears_The_Checkout_Date_Inputbox() throws Throwable {
	    pom.getinstanceSearch().getCheckOut().clear();
	}

	@When("^user Enters The Checkout Date In Inputbox$")
	public void user_Enters_The_Checkout_Date_In_Inputbox() throws Throwable {
		sendValues(pom.getinstanceSearch().getCheckOut(), "12/04/2022");
	}

	@When("^user Selects The AdultsPerRoom Dropdownbox$")
	public void user_Selects_The_AdultsPerRoom_Dropdownbox() throws Throwable {
		singleDropdown(pom.getinstanceSearch().getAdultPerRoom(), "index", "2");
	}

	@When("^user Selects The ChildrensPerRoom Dropdownbox$")
	public void user_Selects_The_ChildrensPerRoom_Dropdownbox() throws Throwable {
		singleDropdown(pom.getinstanceSearch().getChildPerRoom(), "index", "3");
	}

	@Then("^user Clicks The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Clicks_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	    pom.getinstanceSearch().getSearchBtn().click();
	}

	@When("^user Clicks The Radio Button$")
	public void user_Clicks_The_Radio_Button() throws Throwable {
	    pom.getinstanceSelect().getRadioBtn().click();
	}

	@Then("^user Clicks The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Clicks_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
	    pom.getinstanceSelect().getContinueBtn().click();
	}

	@When("^user Enters The First Name In The Inputbox$")
	public void user_Enters_The_First_Name_In_The_Inputbox() throws Throwable {
	   sendValues(pom.getinstanceBook().getFirstName(), "Win");
	}

	@When("^user Enters The Last Name In The Inputbox$")
	public void user_Enters_The_Last_Name_In_The_Inputbox() throws Throwable {
	    sendValues(pom.getinstanceBook().getLastName(), "diesel");
	}

	@When("^user Enters The Address In The Inputbox$")
	public void user_Enters_The_Address_In_The_Inputbox() throws Throwable {
	    sendValues(pom.getinstanceBook().getAddress(), "chennai");
	}

	@When("^user Enters The Credit Card Number In The InputBox$")
	public void user_Enters_The_Credit_Card_Number_In_The_InputBox() throws Throwable {
	    sendValues(pom.getinstanceBook().getCcNum(), FileManagerReader.getInstanceFR().getInstanceCr().getccno());
	    
	}

	@When("^user Selects The Credit Card Type In The Dropdownbox$")
	public void user_Selects_The_Credit_Card_Type_In_The_Dropdownbox() throws Throwable {
	    singleDropdown(pom.getinstanceBook().getCcType(), "index", "2");
	}

	@When("^user Selects The Expiry Month In The Dropdownbox$")
	public void user_Selects_The_Expiry_Month_In_The_Dropdownbox() throws Throwable {
	    singleDropdown(pom.getinstanceBook().getExpMonth(), "index", "2");
	}

	@When("^user Selects The Expiry Year In The Dropdownbox$")
	public void user_Selects_The_Expiry_Year_In_The_Dropdownbox() throws Throwable {
	    singleDropdown(pom.getinstanceBook().getExpYear(), "index", "2");
	}

	@When("^User Enters The CVV Number In The Inputbox$")
	public void user_Enters_The_CVV_Number_In_The_Inputbox() throws Throwable {
	    sendValues(pom.getinstanceBook().getCvv(), FileManagerReader.getInstanceFR().getInstanceCr().getcvv());
	}

	@Then("^user Clicks The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Clicks_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	    pom.getinstanceBook().getBooknowBtn().click();
	}

	@Then("^user Clicks Logout Button And It Navigates To Login Again Page$")
	public void user_Clicks_Logout_Button_And_It_Navigates_To_Login_Again_Page() throws Throwable {
	    explicitwaitOption(pom.getinstanceConfirm().getLogoutBtn());
		
		pom.getinstanceConfirm().getLogoutBtn().click();
	}
	
	@Then("^user Clicks The Login Again Link And It Navigates To Login Page$")
	public void user_Clicks_The_Login_Again_Link_And_It_Navigates_To_Login_Page() throws Throwable {
	   WebElement loginagain = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
	   loginagain	
	
	}
	

}
