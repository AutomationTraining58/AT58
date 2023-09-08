package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import base.BaseTest;
import pageobjects.ApplyLeave;


public class ApplyLeaveModule {
	
	
	// //button[@title='Apply Leave']
	
	public WebDriver driver;

   ApplyLeave al;

	
	public ApplyLeaveModule() throws IOException
	{
		BaseTest bt = new BaseTest();
		driver=bt.loginToApplication();
		al = new ApplyLeave();
		
	}
	
	
	@Test
	public void navigateToApplyLeaveModule()
	{
		
		al.clickOnApplyLeave();
		
		
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();	
		}

	@Test
	public void testcasedevlopedByUserC()
	{
		System.out.println("user c developed");
	}
	
	@Test
	public void testcasedevlopedByUserDC()
	{
		System.out.println("user Dc developed");
	}
	
}
