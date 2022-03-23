package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Billing_address {

	
	public WebDriver driver;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement Billing_address;
	
	public Billing_address(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBilling_address() {
		return Billing_address;
	}

	
	
	}
	
	


