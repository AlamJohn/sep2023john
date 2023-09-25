package com.facebooktTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegularCSS {
	
WebDriver driver;
	
	@BeforeMethod
	public void openFacebook() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");	
		
	}
	
	
	@Test
	public void loginTest() {
		//driver.findElement(By.cssSelector("#email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.cssSelector("[id='email' ]")).sendKeys("xyz@gmail.com");
		
		
		//driver.close();
	}
	
	
	
	
	

}
