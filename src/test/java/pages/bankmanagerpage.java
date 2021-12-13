package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bankmanagerpage {
	
	WebDriver driver;
	
	@FindBy(xpath ="//button[contains(text(),'Customers')]")
	public static WebElement customers;
	
	@FindBy(xpath ="//button[contains(text(),'Search Customer')]")
	public static WebElement searchcustomers;
	
	@FindBy(xpath ="//button[contains(text(),'Add Customer')]")
	public static WebElement AddCustomer;
	
	@FindBy(xpath ="//button[contains(text(),'First Name')]")
	public static WebElement firstnamefield;
	
	@FindBy(xpath ="//button[contains(text(),'Last Name')]")
	public static WebElement lastnamefield;
	
	@FindBy(xpath ="//button[contains(text(),'Post Code')]")
	public static WebElement postcodefield;
	
	@FindBy(xpath ="//button[contains(text(),'Add Customer')]")
	public static WebElement Addcustomerbtn;
	
	
	
	
	
	
	
	public bankmanagerpage(WebDriver driver){
	       this.driver=driver;
	       
	       PageFactory.initElements(driver, this);
	   }
	
	
	public void searchcustomers(String name) {
		customers.click();
		searchcustomers.click();
		searchcustomers.sendKeys(name);
		
	}
	
	public void addcustomer(String firstname,String lastname,String postcode) {
		AddCustomer.click();
		firstnamefield.click();
		firstnamefield.sendKeys(firstname);
		lastnamefield.sendKeys(lastname);
		postcodefield.sendKeys(postcode);
		Addcustomerbtn.click();
		
		
	}

	
	public void alertpopup() {
		
		driver.switchTo().alert().accept();
	}

}
