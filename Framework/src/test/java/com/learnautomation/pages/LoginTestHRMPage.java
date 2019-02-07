package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginTestHRMPage {
	
	WebDriver driver;
  
	//This is new commit from sanjay
	public LoginTestHRMPage(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//input[@name='txtUsername']") WebElement uname;
	
	@FindBy(xpath="//input[@name='txtPassword']") WebElement pwd;
	
	@FindBy(xpath="//input[@name='Submit']") WebElement loginButton;
	
	public void loginToHRM(String username, String pass) {
		uname.sendKeys(username);
		pwd.sendKeys(pass);
		loginButton.click();
	}
}
