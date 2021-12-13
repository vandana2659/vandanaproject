package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Reusablemethods.Reusablemethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.bankmanagerpage;
import pages.loginpage;

public class bankmanager extends loginpage {
	
	Reusablemethods m=new Reusablemethods();
	
	bankmanagerpage b= new bankmanagerpage(driver);

	public bankmanager(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Given("^user is on Login page$")
	public void user_is_on_login_page() throws InterruptedException {

		m.Openbrowser();
	}
	
	@When("^user clicks on on the bankmanger and selects the search \"(.*)\"$")
	
	public void clickbankmanger(String name) {
		
		b.searchcustomers(name);
		
		
	}
	
	@And("^banknamager add the customer \"(.*)\" and\"(.*)\" and \"(.*)\"$")
	
	public void addcustomer( String firstname, String lastname,String postcode) {
		
		b.addcustomer(firstname, lastname, postcode);
		b.alertpopup();
		
		
		
	}
	
	
}
