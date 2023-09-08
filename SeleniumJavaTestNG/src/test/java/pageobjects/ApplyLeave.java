package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class ApplyLeave {
	
	
	 WebDriver driver;
	 
	 
	 public ApplyLeave()
	 {
		 
		 driver=BaseTest.driver;
	 }
	
	// //button[@title='Apply Leave']
	
	By button_applyLeave=By.xpath("//button[@title='Apply Leave']");

	
	
	
	
	public void clickOnApplyLeave()
	{
	    driver.findElement(button_applyLeave).click();
	}
	

}
