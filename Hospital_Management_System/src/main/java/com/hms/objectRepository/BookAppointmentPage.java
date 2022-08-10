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

public class BookAppointmentPage extends WebDriverUtility {

	//initialization
	public BookAppointmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//declaration
	@FindBy(name = "Doctorspecialization") private WebElement specializationsDrpDwn;
	
	@FindBy(name = "doctor") private WebElement doctorsDrpDwn;
	
	@FindBy(xpath="//select[@id='fees']") private WebElement consultancyFees;
	
	@FindBy(name = "appdate") private WebElement date;
	
	@FindBy(xpath="//td[@class='day' and text()='10']") private WebElement todayDate;
	
	@FindBy(name = "apptime") private WebElement time;
	
	@FindBy(name = "submit") private WebElement submitBtn;
	
	//@FindBy(xpath = "//td[@class='active day']/../td[5]")
	private WebElement previousDate;
	
	//utilization
	public void selectSpecialization(String spName)
	{
		selectDropDownByVtext(specializationsDrpDwn, spName);
	}
	
	public void selectDoctor(String docName)
	{
		selectDropDownByVtext(doctorsDrpDwn, docName);
	}
	

	public WebElement getConsultancyFees() {
		return consultancyFees;
	}

	public WebElement getDate() 
	{
		return date;
	}
	
	
	public WebElement getTodayDate() {
		return todayDate;
	}

	public WebElement getTime()
	{
		return time;
	}
	
	public void submit()
	{
		submitBtn.click();
	}

	public WebElement getPreviousDate() {
		return previousDate;
	}
	
}
