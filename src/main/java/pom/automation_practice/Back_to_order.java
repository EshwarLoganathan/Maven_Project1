package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_to_order {

	
	public WebDriver driver;
	
	@FindBy(id="step_end")
	private WebElement Backto_order;
	
	public Back_to_order(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getBackto_order() {
		return Backto_order;
	}
	
	

}
