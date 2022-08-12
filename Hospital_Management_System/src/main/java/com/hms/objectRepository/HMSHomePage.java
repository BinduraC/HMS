package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Indrajit
 *
 */
public class HMSHomePage {

	//initialization
	public HMSHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	
	@FindBy(xpath = "//a[@href='hms/user-login.php']") private WebElement patientslogin;
	
	@FindBy(xpath = "//a[@href='hms/doctor/']") private WebElement doctorslogin;
	
	@FindBy(xpath = "//a[@href='hms/admin']") private WebElement adminlogin;
	
	@FindBy(xpath = "(//a[@href='contact.php'])[1]") private WebElement contactLink;
	
	//utilization
	
	public void getPatientslogin()
	{
		patientslogin.click();
	}
	
	public void getDoctorslogin()
	{
		doctorslogin.click();
	}
	
	public void getAdminlogin()
	{
		adminlogin.click();
	}
	
	public void getContactLink()
	{
		contactLink.click();
	}
}
