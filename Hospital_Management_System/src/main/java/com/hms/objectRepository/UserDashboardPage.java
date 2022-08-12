package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Bindura
 *
 */
public class UserDashboardPage {
	
	//initialization
	public UserDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath="//a[contains(text(),'Update Profile')]")
	private WebElement updateProfileLink;
	
	@FindBy(xpath="//h2[text()='My Appointments']/..//a[@href='appointment-history.php']")
	private WebElement viewAppointmentHistoryLink;
	
	@FindBy(xpath = "//span[.=' Appointment History ']") private WebElement appointmentHistoryBar;
	
	@FindBy(xpath="//a[contains(text(),'Book Appointment')]")
	private WebElement bookAppointmentLink;
	
	@FindBy(xpath="//i[@class='ti-angle-down']")
	private WebElement userDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logoutBtn;
    
	@FindBy(xpath="//span[text()=' Appointment History ']")
	private WebElement clickAppointmentHistoryLink;
	
	//utilization
	public void clickUpdateProfile() {
		updateProfileLink.click();
	}
	public void clickViewAppointmentHistory() {
		viewAppointmentHistoryLink.click();
	}
	public void clickAppointmentHistory() {
		clickAppointmentHistoryLink.click();
	}
	
	public void clickBookAppointment() {
		bookAppointmentLink.click();
	}
	

	public void clickAppointmentHistoryBar()
	{
		appointmentHistoryBar.click();
	}
	
	public void clickSignOut() 
	{
		userDropDown.click();
		logoutBtn.click();
	}
	public void clicklogOut() 
	{
		userDropDown.click();
		logoutBtn.click();
	}
}
