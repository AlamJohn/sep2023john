package com.facebooktTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFunction {
WebDriver driver;
	
	@BeforeMethod
	public void openFacebook() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");	
		
	}
	
//	@Test
	public void idLocatorsTest() {
		
		driver.findElement(By.id("email")).sendKeys("xyz");
		
	}
	
	//@Test
	public void nameLocatorsTest() {
		
		driver.findElement(By.name("pass")).sendKeys("12345");
		
	}
	
//	@Test
	public void linkTextLocatorsTest() {
		
		driver.findElement(By.linkText("Forgot password?")).click();  
		
	}
	//@Test
	public void partialLinkTextLocatorsTest() {
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
}


	//@Test
	public void linkContainFunction() {
	
	driver.findElement(By.xpath("//a[contains(text(),\"Forgot password?\")]")).click();
	
}
	
//	@Test
	public void listText() {
	
	driver.findElement(By.xpath("//li[contains(text(),\"English (US)\")]")).click();
	
}
	
	@Test
	public void getText() {
		
		WebElement text =driver.findElement(By.xpath("//h2[contains(text(),\"Connect with friends\")]"));
		
		System.out.println(text.getText());
		
		String actualText="Connect with friends and the world around you on Facebook.";
		Assert.assertEquals(actualText, text.getText(),"Did not match");
		
	
		
	}
	
	
	@AfterTest
	public void facebookClose() {
		
		driver.quit();
		
	}
	
	
	
	
	
}