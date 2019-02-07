package com.learnautomation.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	//Here we can keep all the project independent methods like screenshot, alert, frames, window, javascript executor
	
	public static String captureScreenShot(WebDriver driver) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String screenShotPath=System.getProperty("user.dir")+"/Screenshots/DemoHRM_"+getCurrentDateTime()+".png";
		String screenShotPath="./Screenshots/DemoHRM_"+getCurrentDateTime()+".png";
		
		try {
			FileHandler.copy(src, new File(screenShotPath));
			
			System.out.println("Screenshot captured");
			
		} catch (Exception e) {
			System.out.println("Unable to capture screenshot "+e.getMessage());
		}
		return screenShotPath;
	}
	
	public static String getCurrentDateTime() {
		
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate=new Date();
		
		return customFormat.format(currentDate);
	}
	
}
