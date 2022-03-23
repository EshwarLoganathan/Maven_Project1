package page_object_manager_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.automation_practice.Auto_Home_Page;
import pom.automation_practice.Auto_SignIn_Page;
import pom.automation_practice.Back_to_order;
import pom.automation_practice.Bank_wire;
import pom.automation_practice.Billing_address;
import pom.automation_practice.Invoice_address;
import pom.automation_practice.Shipping_address;
import pom.automation_practice.Tshirt_Selection_Page;
import pom.automation_practice.Wire_Payment_Confirmation;

public class Page_Object_Manger_Automation {
	
	public WebDriver driver;
	
	private Auto_Home_Page AHP;
	
	private Auto_SignIn_Page ASP;
	
	private Tshirt_Selection_Page TSP;
	
	private Invoice_address Ia;
	
	private Billing_address Ba;
	
	private Shipping_address Sa;
	
	private Bank_wire Bw;
	
	private Wire_Payment_Confirmation Wpc;
	
	private Back_to_order Bto;
	
	

	public Page_Object_Manger_Automation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Auto_Home_Page getAHP() {
		
		if (AHP==null) {
			
			AHP =new Auto_Home_Page(driver);
			
		}
		return AHP;
	}

	public Auto_SignIn_Page getASP() {
		
		if (ASP==null) {
			
			ASP = new Auto_SignIn_Page(driver);
			
		}
		return ASP;
	}

	public Tshirt_Selection_Page getTSP() {
		
		if (TSP==null) {
			
			TSP =new Tshirt_Selection_Page(driver);
			
		}
		return TSP;
	}

	public Invoice_address getIa() {
		
		if (Ia==null) {
			Ia= new Invoice_address(driver);
			
		}
		return Ia;
	}

	public Billing_address getBa() {
		
		if (Ba==null) {
			
			Ba = new Billing_address(driver);
			
		}
		return Ba;
	}

	public Shipping_address getSa() {
		
		if (Sa==null) {
			Sa = new Shipping_address(driver);
			
		}
		return Sa;
	}

	public Bank_wire getBw() {
		
		if (Bw==null) {
			Bw = new Bank_wire(driver);
			
		}
		return Bw;
	}

	public Wire_Payment_Confirmation getWpc() {
		
		if (Wpc==null) {
			
			Wpc = new Wire_Payment_Confirmation(driver);
			
		}
		return Wpc;
	}

	public Back_to_order getBto() {
		
		if (Bto==null) {
			Bto = new Back_to_order(driver);
			
		}
		return Bto;
	}
	
	
	

}
