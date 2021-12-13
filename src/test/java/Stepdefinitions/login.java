package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Reusablemethods.Reusablemethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;
import pages.withdrawl;



public class login extends loginpage  {
	
	private WebDriver driver;
	
	Reusablemethods m=new Reusablemethods();
	
	withdrawl w=new withdrawl();

	public login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	loginpage l=new loginpage(driver);

	@Given("^user is on Login page$")
	public void user_is_on_login_page() throws InterruptedException {

		m.Openbrowser();
	}

	@When("^user clicks on on the Customer Login and selects the \"(.*)\"$")
	public void user_clicks_on_on_the_customer_login(String name) throws InterruptedException {
		
		l.clickcustomer(name);
		
	}

	

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		l.clicklogin();
	}

	@Then("click on the withdrawl button and logout")
	public void verify_user_has_successfully_logged_in_or_not() {
		
		w.Withdrawl();
		w.logout();
		
		
		

}
}
