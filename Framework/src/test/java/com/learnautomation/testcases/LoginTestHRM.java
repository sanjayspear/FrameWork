package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginTestHRMPage;

public class LoginTestHRM extends BaseClass {

	@Test(priority=1)
	public void loginApp() {
		logger=report.createTest("Login to DemoHRM");
		
		LoginTestHRMPage loginPage = PageFactory.initElements(driver, LoginTestHRMPage.class);
		
		logger.info("Starting Application");

		loginPage.loginToHRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
			
	}
	
	@Test(priority=2)
	public void logutApp() {
		logger=report.createTest("Trying to logout DemoHRM");
		
		logger.fail("Logout Failed");
			
	}

}
