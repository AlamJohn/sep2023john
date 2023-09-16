package com.facebooktTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	WebDriver driver;
		
	@Test
	
	public void testone() {
		
		
	System.out.println("Hello TestNG");	
	}
	
	@Test
	public void openChromeBrowser () {
	// launch a browser	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void openEdgeBrowser() {
		
		
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 
		 driver.get("https://www.facebook.com/");
			
		}
	
	
	
}
