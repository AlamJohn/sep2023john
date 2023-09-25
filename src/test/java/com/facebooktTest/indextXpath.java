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

public class indextXpath {
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
public void xpathIndext() {
	
	driver.findElement(By.xpath("(//div[@id=\"pageFooter\"]/ul/li)[11]")).click();
	
}
	
	
	
}