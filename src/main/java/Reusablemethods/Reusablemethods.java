package Reusablemethods;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Reusablemethods{
	
	
	WebDriver driver;

	
	public void Openbrowser() {

		

		System.setProperty("webdriver.chrome.driver","C:/Users/RSREDDY/eclipse-workspace/Cucumberjava/src/test/resources/drivers/chromedriver.exe");


		driver =new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		String url = null;
		String url1= System.getProperty(url);
		driver.get(url1);
		


	}

}

