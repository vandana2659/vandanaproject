package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;


public class withdrawl {
	
WebDriver driver;
	
	@FindBy(xpath ="//button[contains(text(),'Withdrawl')")
	public static WebElement withdrwal;
	
	@FindBy(xpath ="//button[contains(text(),'amount')")
	public static WebElement Amount;
	
	@FindBy(xpath ="//button[contains(text(),'Withdraw')")
	public static WebElement withdrawbtn;
	
	@FindBy(xpath ="//button[contains(text(),'Logout')")
	public static WebElement logoutbtn;
	
	
	
	public void Withdrawl() {
		withdrwal.click();
		Amount.click();
		Amount.sendKeys("10");
		withdrawbtn.click();
		Assert.assertEquals("Transaction successful", "Transaction successful");
		
	}
	
	public void logout() {
		
		logoutbtn.click();
		driver.quit();
	}
	
	
	
	

}
