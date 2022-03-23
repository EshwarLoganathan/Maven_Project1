package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wire_Payment_Confirmation {
	
	
	public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Wire_Payment;
	
	public Wire_Payment_Confirmation(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getWire_Payment() {
		return Wire_Payment;
	}

	
	
	
	
}
