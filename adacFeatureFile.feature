Feature: Adactin Hotel Booking Application
Scenario: Login Functionality
Given user Launch The Adactin Application
When user Enters The Username In The Inputbox
And user Enters the Password In The Inputbox
Then user Clicks On The LoginButton And It Navigates To The Search Hotel Page

Scenario: Search Hotel Functionality
When user Selects The Location Dropdownbox
And user Selects The Hotel Dropdownbox
And user Selects The RoomType Dropdownbox
And user Selects The Number Of Rooms Dropdownbox
And user Clears The Checkin Date Inputbox
And user Enters The Checkin Date In Inputbox
And user Clears The Checkout Date Inputbox
And user Enters The Checkout Date In Inputbox
And user Selects The AdultsPerRoom Dropdownbox
And user Selects The ChildrensPerRoom Dropdownbox
Then user Clicks The Search Button And It Navigates To The Select Hotel Page

Scenario: Select Hotel Functionality
When user Clicks The Radio Button
Then user Clicks The Continue Button And It Navigates To The Book Hotel Page

Scenario: Book Hotel Functionality
When user Enters The First Name In The Inputbox
And user Enters The Last Name In The Inputbox
And user Enters The Address In The Inputbox
And user Enters The Credit Card Number In The InputBox
And user Selects The Credit Card Type In The Dropdownbox
And user Selects The Expiry Month In The Dropdownbox
And user Selects The Expiry Year In The Dropdownbox
And User Enters The CVV Number In The Inputbox
Then user Clicks The Book Now Button And It Navigates To Booking Confirmation Page

Scenario: Booking Confirmation Functionality
Then user Clicks Logout Button And It Navigates To Login Again Page

Scenario: Login Again Functionality
Then user Clicks The Login Again Link And It Navigates To Login Page
