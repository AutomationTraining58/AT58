package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class TimeSheet {
	
	WebDriver driver;
	
	By button_timeSheet=By.xpath("//button[@title='My Timesheet']");
	
	
	 public TimeSheet()
	{
		driver  =BaseTest.driver;
		
	}
	
	
	
	
	public void clickOnButton()
	{
		  driver.findElement(button_timeSheet).click();
	
	}

}
