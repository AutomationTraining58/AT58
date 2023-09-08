package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageobjects.TimeSheet;


public class TimeSheetModule {
	
	
	public WebDriver driver;
    TimeSheet ts;
	
	TimeSheetModule() throws IOException
	{
		
		BaseTest bt = new BaseTest();
	   driver=	bt.loginToApplication();
	   ts = new TimeSheet();
	
		
	}
	
	
	@Test
	public void navigateToTimeSheetModule()
	{
		ts.clickOnButton();
	  
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
