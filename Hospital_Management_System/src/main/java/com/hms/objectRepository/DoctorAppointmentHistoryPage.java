package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorAppointmentHistoryPage 
{
	//declaration
@FindBy(xpath="//h1[@class='mainTitle']") private WebElement appointmentHistoryPgTitle;

//initialization
public DoctorAppointmentHistoryPage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}

//utilization
public WebElement getAppointmentHistoryPgTitle() {
	return appointmentHistoryPgTitle;
}

}
