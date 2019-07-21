package com.testautomation.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.PageFactory;

public class HomePageScreen {
	
	//Initializing driver
	public WebDriver driver;
	
	String URL= "https://www.facebook.com/";
	
	public HomePageScreen(WebDriver driver) {
		// Auto-generated constructor stub
		this.driver=driver;
		driver.get(URL);
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID,using="email")
	public WebElement elmEmail;
	@FindBy(how = How.ID,using="pass")
	public WebElement elmPassword;
	@FindBy(how = How.ID,using="loginbutton")
	public WebElement btnLogin;
	
	public void login(String uname, String pwd) {
		
		elmEmail.clear();
		elmEmail.sendKeys(uname);
		elmPassword.clear();
		elmPassword.sendKeys(pwd);
		btnLogin.click();
	}
	

}
