package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtilities.WebDriverUtility;
/**
 * 
 * @author dinuh
 *
 */
public class DoctorsDashboardPage extends WebDriverUtility
{
	//declaration 
	@FindBy(xpath="//a[contains(text(),'Update Profile')]") private WebElement updateProfileLnk;

	@FindBy(xpath="//a[contains(text(),'View Appointment History')]") private WebElement viewAppointmentHistoryLnk;

	@FindBy(xpath="//span[text()=' Appointment History ']") private WebElement appointmentHistoryLnk;

	@FindBy(xpath="//i[@class='icon-arrow']") private WebElement patientsDrpDwn;

	@FindBy(xpath="//span[text()=' Add Patient']") private WebElement addPatientLnk;

	@FindBy(xpath="//span[text()=' Manage Patient ']") private WebElement managePatientLnk;

	@FindBy(xpath="//span[text()=' Search ']") private WebElement searchLnk;

	@FindBy(xpath="//i[@class='ti-angle-down']") private WebElement doctorsProfileDrpDwn;

	@FindBy(xpath="//a[contains(text(),'My Profile')]") private WebElement myProfileLnk;

	@FindBy(xpath="//a[contains(text(),'Change Password')]") private WebElement changePassword;

	@FindBy(xpath="//a[contains(text(),'Log Out')]") private WebElement logoutLnk;

	//initialization
	public DoctorsDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void updateProfile() {
		updateProfileLnk.click();
	}

	public void viewAppointmentHistory() 
	{
		viewAppointmentHistoryLnk.click();
	}

	public void appointmentHistory() 
	{
		appointmentHistoryLnk.click();
	}

	public void searchLnk() 
	{
		searchLnk.click();
	}

	public void doctorsProfileDrpDwn() {
		doctorsProfileDrpDwn.click();
	}

	public WebElement getMyProfileLnk() {
		return myProfileLnk;
	}

	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getLogoutLnk() {
		return logoutLnk;
	}

	public void selectPatientsDrpDwn(String patDrpDwnOption)
	{
		selectDropDownByVtext(patientsDrpDwn, patDrpDwnOption);
	}


	public void logoutDoctor()
	{
		doctorsProfileDrpDwn.click();
		logoutLnk.click();
	}
}
