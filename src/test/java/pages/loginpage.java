package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class loginpage {
	
	protected WebDriver driver;
	
	@FindBy(xpath ="//button[contains(text(),'Customer Login')]")
	public static WebElement customer;
	
	@FindBy(id ="userSelect")
	public static WebElement select;
	
	@FindBy(xpath ="//button[contains(text(),'Login')]")
	public static WebElement loginbtn;
	
	
	
	public loginpage(WebDriver driver){
	       this.driver=driver;
	       
	       PageFactory.initElements(driver, this);
	   }

	
	public void clickcustomer(String name) {
		
    	customer.click();
		WebElement solutions_dropdown = select;
		Select solutions = new Select(solutions_dropdown);
		solutions.selectByVisibleText(name);
	}
    
    public void clicklogin() {
    	loginbtn.click();
	}
    
}

	
	