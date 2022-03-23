package com.Maven_Project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import page_object_manager.Page_Object_Manager_Adactin;

public class Adactin_MiniProject extends Maven_BaseClass1 {

	public static WebDriver driver = browserlaunch("chrome");

	public static Page_Object_Manager_Adactin pom = new Page_Object_Manager_Adactin(driver);
	
	public static Logger Log = Logger.getLogger(Adactin_MiniProject.class);

	public static void main(String[] args) throws InterruptedException, IOException {

		implicitly_wait(10, TimeUnit.SECONDS);
		
		PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\log4j.properties");

		getUrl("http://adactinhotelapp.com/");
		
		Log.info("Adactin Url Launch");

		String Username = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 4, 5);
		String Password = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 5, 5);
		String Location = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 7, 5);
		String Hotel = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 8, 5);
		String Firstname = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 18, 5);
		String Lastname = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 19, 5);
		String Address = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 20, 5);
		String Cardnumber = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 21, 5);
		String Cardtype = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 22, 5);
		String Cvv = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 24, 5);

		inputvalueElement(pom.get_Instance_Hp().getUsername(), Username);

		inputvalueElement(pom.get_Instance_Hp().getPasswd(), Password);
		
		clickonElement(pom.get_Instance_Hp().getLogin());
		
		Log.info("User Credentials");

		dropdown("byvalue", pom.get_Instance_Sp().getLocation(), Location);

		dropdown("bytext", pom.get_Instance_Sp().getHotels(), Hotel);

		dropdown("byIndex", pom.get_Instance_Sp().getRoomType(), "4");

		clear(pom.get_Instance_Sp().getDatepick_in());

		inputvalueElement(pom.get_Instance_Sp().getDatepick_in(), "01/04/2022");

		clear(pom.get_Instance_Sp().getDatepick_out());

		inputvalueElement(pom.get_Instance_Sp().getDatepick_out(), "03/04/20222");

		dropdown("byIndex", pom.get_Instance_Sp().getAdultroom(), "2");

		dropdown("byIndex", pom.get_Instance_Sp().getChildroom(), "1");

		clickonElement(pom.get_Instance_Sp().getSubmit());
		
		Log.info("Hotel Selection Page");

		Thread.sleep(2000);

		clickonElement(pom.get_Instance_Cp().getCheckBox());

		clickonElement(pom.get_Instance_Cp().getContinue());
		
		Log.info("Terms and condition");

		Thread.sleep(2000);

		inputvalueElement(pom.get_Instance_Pc().getFirst_Name(), Firstname);

		inputvalueElement(pom.get_Instance_Pc().getLast_Name(), Lastname);

		inputvalueElement(pom.get_Instance_Pc().getAddress(), Address);

		inputvalueElement(pom.get_Instance_Pc().getCredit(), Cardnumber);

		dropdown("byValue", pom.get_Instance_Pc().getCard_type(), Cardtype);

		dropdown("byValue", pom.get_Instance_Pc().getExp_Month(), "4");

		dropdown("byText", pom.get_Instance_Pc().getExp_Year(), "2022");

		inputvalueElement(pom.get_Instance_Pc().getCvv(), Cvv);

		clickonElement(pom.get_Instance_Pc().getBook_Now());
		
		Log.info("Billing address");

		Thread.sleep(2000);

		moveto(pom.get_Instance_Lp().getLogout());

		clickonElement(pom.get_Instance_Lp().getLogout());
		
		Log.info("Logout");

	}

}
