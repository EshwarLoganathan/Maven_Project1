package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Confirmation {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement First_Name;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement Last_Name;

	@FindBy(id = "address")
	private WebElement Address;

	@FindBy(xpath = "(//input[@class='reg_input'])[3]")
	private WebElement Credit;

	@FindBy(id = "cc_type")
	private WebElement Card_type;

	@FindBy(id = "cc_exp_month")
	private WebElement Exp_Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement Exp_Year;
	
	
	@FindBy(xpath="(//input[contains(@onkeypress,'return')])[2]")
	private WebElement Cvv;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement Book_Now;

	public Payment_Confirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCredit() {
		return Credit;
	}

	public WebElement getCard_type() {
		return Card_type;
	}

	public WebElement getExp_Month() {
		return Exp_Month;
	}

	public WebElement getExp_Year() {
		return Exp_Year;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBook_Now() {
		return Book_Now;
	}	
	
	
	
}





































