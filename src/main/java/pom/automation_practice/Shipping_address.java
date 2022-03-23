package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_address {
	
	
	public WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement Check_box;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Shipping_final;
	
	public Shipping_address(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheck_box() {
		return Check_box;
	}

	public WebElement getShipping_final() {
		return Shipping_final;
	}


}
