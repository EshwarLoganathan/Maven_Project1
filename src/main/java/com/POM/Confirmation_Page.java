package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type = 'radio']")
	private WebElement CheckBox;
	
	@FindBy(id = "continue")
	private WebElement Continue;
	
	public Confirmation_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
		
	}


