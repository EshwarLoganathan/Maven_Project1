package page_object_manager;

import org.openqa.selenium.WebDriver;
import com.POM.Confirmation_Page;
import com.POM.Home_Page;
import com.POM.Hotel_Selectionpage;
import com.POM.Log_Out_Page;
import com.POM.Payment_Confirmation;

public class Page_Object_Manager_Adactin {

	public WebDriver driver;

	private Home_Page hp;

	private Hotel_Selectionpage sp;

	private Confirmation_Page cp;

	private Payment_Confirmation pc;

	private Log_Out_Page Lp;

	public Page_Object_Manager_Adactin(WebDriver driver2) {
		this.driver = driver2;

	}

	public Home_Page get_Instance_Hp() {

		if (hp == null) {

			hp = new Home_Page(driver);

		}
		return hp;
	}

	public Hotel_Selectionpage get_Instance_Sp() {

		if (sp == null) {
			sp = new Hotel_Selectionpage(driver);

		}
		return sp;
	}

	public Confirmation_Page get_Instance_Cp() {

		if (cp == null) {

			cp = new Confirmation_Page(driver);

		}
		return cp;
	}

	public Payment_Confirmation get_Instance_Pc() {

		if (pc == null) {

			pc = new Payment_Confirmation(driver);

		}
		return pc;
	}

	public Log_Out_Page get_Instance_Lp() {

		if (Lp == null) {

			Lp = new Log_Out_Page(driver);

		}
		return Lp;
	}

}
