package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author INDRAJIT
 *
 */

public class UserAppointmentHistory {

	//initialization
	public UserAppointmentHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//td[2]") private WebElement doctorsName;
	
	//utilization
	public WebElement getDoctorsName() {
		return doctorsName;
	}
	
	
}