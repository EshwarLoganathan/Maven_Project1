package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Selection_Page {

	
	public WebDriver driver;

	@FindBy(xpath = "//img[@width='250']")
	private WebElement Image;

	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement Add_to_Cart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement Proceed;
	
public Tshirt_Selection_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
		
	}

public WebElement getImage() {
	return Image;
}

public WebElement getAdd_to_Cart() {
	return Add_to_Cart;
}

public WebElement getProceed() {
	return Proceed;
}


	
	

}
