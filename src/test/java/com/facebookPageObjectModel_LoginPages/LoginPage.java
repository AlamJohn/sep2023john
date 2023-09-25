package com.facebookPageObjectModel_LoginPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
/**
 * intance variables
 */
WebDriver driver;
	
	/**
	 * @param driver
	 * user define constructor for POM
	 */
	public LoginPage(WebDriver driver) {
	super();
	this.driver = driver;
}

	@BeforeMethod
	public void openFacebook() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");	
		
	}
	

}
