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
public class EditDoctorDetailsPage extends WebDriverUtility
{
	//declaration 
	@FindBy(xpath="//select[@name='Doctorspecialization']") private WebElement doctorSpecializationDrpDwn;

	@FindBy(xpath="//input[@name='docname']") private WebElement doctorsNameEdt;

	@FindBy(name="clinicaddress") private WebElement doctorClinicAdressEdt;

	@FindBy(name="docfees") private WebElement doctorConsultancyFeesEdt;

	@FindBy(name="doccontact") private WebElement doctorContactNumEdt;

	@FindBy(name="docemail") private WebElement doctorEmailEdt;

	@FindBy(xpath="//button[@name='submit']") private WebElement updateBtn;

	//initialization
	public EditDoctorDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getDoctorSpecializationDrpDwn()
	{
		return doctorSpecializationDrpDwn;
	}

	public void doctorsName(String doctorName) 
	{
		doctorsNameEdt.sendKeys(doctorName);
	}

	public void doctorClinicAdress(String clinicAdress)
	{
		doctorClinicAdressEdt.sendKeys(clinicAdress);
	}

	public void doctorConsultancyFees(String fees) 
	{
		doctorConsultancyFeesEdt.sendKeys(fees);
	}

	public void doctorContactNum(String ContactNumber) 
	{
		doctorContactNumEdt.sendKeys(ContactNumber);
	}

	public void doctorEmail(String doctorMail) 
	{
		doctorEmailEdt.sendKeys(doctorMail);
	}

	public void update() 
	{
		updateBtn.click();
	}

	public void selectDoctorSpecialization(String doctorSpecialization)
	{
		selectDropDown(doctorSpecializationDrpDwn, doctorSpecialization);	
	}

}
