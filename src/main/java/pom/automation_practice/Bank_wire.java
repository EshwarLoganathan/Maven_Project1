package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_wire {
	
	
	public WebDriver driver ;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement Bank_wire_Payment;
	
	public Bank_wire(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBank_wire_Payment() {
		return Bank_wire_Payment;
	}


}
