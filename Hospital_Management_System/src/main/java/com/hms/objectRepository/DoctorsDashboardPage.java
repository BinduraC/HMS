package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorsDashboardPage
{
	//declaration
@FindBy(xpath="//a[contains(text(),'Update Profile')]") private WebElement updateProfile;

@FindBy(xpath="//a[contains(text(),'View Appointment History')]") private WebElement viewAppointmentHistory;

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
public WebElement getUpdateProfile() {
	return updateProfile;
}

public WebElement getViewAppointmentHistory() {
	return viewAppointmentHistory;
}

public WebElement getAppointmentHistoryLnk() {
	return appointmentHistoryLnk;
}

public WebElement getAddPatientLnk() {
	return addPatientLnk;
}

public WebElement getManagePatientLnk() {
	return managePatientLnk;
}

public WebElement getSearchLnk() {
	return searchLnk;
}

public WebElement getDoctorsProfileDrpDwn() {
	return doctorsProfileDrpDwn;
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
	
public void addPatient()
{
	patientsDrpDwn.click();
	addPatientLnk.click();
}

public void managePatient()
{
	patientsDrpDwn.click();
	managePatientLnk.click();
}

public void logoutDoctor()
{
	doctorsProfileDrpDwn.click();
	logoutLnk.click();
}
}
