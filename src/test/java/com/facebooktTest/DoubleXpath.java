package com.facebooktTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpath {
	
WebDriver driver;
	
	@BeforeTest
	public void openFacebook() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");	
		
	}
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.xpath("//input[@id=\"email\"][@name=\"email\"]")).sendKeys("abcd");
		
	}
	
	

}
