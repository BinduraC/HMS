package com.hms.objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtilities.WebDriverUtility;

/**
 * 
 * @author INDRAJIT
 *
 */


public class UserAppointmentHistory extends WebDriverUtility{

	//initialization
	public UserAppointmentHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//div[@class='col-md-12']//table//tbody//tr//td[5]") private WebElement appDateAndTime;

	@FindBy(xpath = "//a[@title='Cancel Appointment']") private WebElement cancelBtn;
	
	//utilization
	public void getAppDateAndTime(String appointmentDate) {
		String appDate = appDateAndTime.toString();
			if(appDate.contains(appointmentDate))
			{
				cancelBtn.click();
				
			}
		
	}
	
	
}
	
	
