package com.testautomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.testautomation.screens.HomePageScreen;

import desiredCapability.DesiredCapability;

public class HomePageTest {
	
	// Intiliazing Driver
	DesiredCapability d= new DesiredCapability();
	public WebDriver driver = d.getdriver();
	
	HomePageScreen objHomePage= PageFactory.initElements(driver, HomePageScreen.class);
	
	@Test(priority = 1)
	public void Test1() {
		objHomePage.login("uscsucg", "jaxkjb");
		
		
		// TODO Auto-generated method 

	}

}
