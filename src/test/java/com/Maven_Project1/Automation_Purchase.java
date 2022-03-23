package com.Maven_Project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import page_object_manager_automation.Page_Object_Manger_Automation;

public class Automation_Purchase extends Maven_BaseClass1 {

	public static WebDriver driver = browserlaunch("chrome");

	public static Page_Object_Manger_Automation POMA = new Page_Object_Manger_Automation(driver);

	public static Logger Log = Logger.getLogger(Automation_Purchase.class);

	public static void main(String[] args) throws IOException, InterruptedException {

		implicitly_wait(10, TimeUnit.SECONDS);

		PropertyConfigurator.configure("log4j.properties");

		getUrl("http://automationpractice.com/index.php");

		Log.info("Url launch");

		clickonElement(POMA.getAHP().getHome_Page());

		String Email = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Automation_Practice_TestCase.xlsx", 4, 5);

		inputvalueElement(POMA.getASP().getEmail(), Email);

		String Passwd = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Automation_Practice_TestCase.xlsx", 5, 5);

		inputvalueElement(POMA.getASP().getPassword(), Passwd);

		clickonElement(POMA.getASP().getSubmitlogin());
		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\LoginPage.png");
		
		Log.info("Loging Credentials");

		clickonElement(POMA.getASP().getTShirts());
		
		Log.info("Tshirt_Page");

		action_class(POMA.getTSP().getImage());

		clickonElement(POMA.getTSP().getAdd_to_Cart());

		clickonElement(POMA.getTSP().getProceed());
		
		Log.info("Addtocart");

		clickonElement(POMA.getIa().getInvoice_address());
		
		Log.info("Invoice_address");

		clickonElement(POMA.getBa().getBilling_address());
		
		Log.info("Billing_address");

		moveto(POMA.getSa().getCheck_box());
		clickonElement(POMA.getSa().getCheck_box());

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\PaymentConfirm.png");
		clickonElement(POMA.getSa().getShipping_final());
		
		Log.info("Final_Checkout");

		moveto(POMA.getBw().getBank_wire_Payment());
		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\PaymentConfirm.png");
		clickonElement(POMA.getBw().getBank_wire_Payment());
		
		Log.info("Wire_payment");

		clickonElement(POMA.getWpc().getWire_Payment());
		
		Log.info("Payment_confirmation");

		moveto(POMA.getBto().getBackto_order());

		screenshot("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\PaymentConfirm.png");

	}

}
