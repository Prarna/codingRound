package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MyPackage.Login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases{
	
	public WebDriver driver = null;
	
	@BeforeClass
	public void setUpBase()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
	}
	

	@Test(priority = 1)
	public void loginWithEmptyFields() {
		Login login = new Login(driver);
		login.yourtrips().click();
		login.signIn().click();
		//login.clickSignInForm().click();
		login.signInButton().click();
		
		
	}
	
	@AfterClass
	public void closeDriver()
	{
		driver.quit();
	}
}
