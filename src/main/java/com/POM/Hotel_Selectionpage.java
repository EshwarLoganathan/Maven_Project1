package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Selectionpage {

	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement Location;

	@FindBy(id = "hotels")
	private WebElement Hotels;

	@FindBy(id = "room_type")
	private WebElement RoomType;

	@FindBy(id = "room_nos")
	private WebElement RoomNos;

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;

	@FindBy(id = "datepick_out")
	private WebElement datepick_out;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement Childroom;

	@FindBy(id = "Submit")
	private WebElement Submit;
	
	public  Hotel_Selectionpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	

}
