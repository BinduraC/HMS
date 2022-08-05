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
	//declaration.
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
	public WebElement getDoctorSpecializationDrpDwn() {
		return doctorSpecializationDrpDwn;
	}

	public WebElement getDoctorsNameEdt() {
		return doctorsNameEdt;
	}

	public WebElement getDoctorClinicAdressEdt() {
		return doctorClinicAdressEdt;
	}

	public WebElement getDoctorConsultancyFeesEdt() {
		return doctorConsultancyFeesEdt;
	}

	public WebElement getDoctorContactNumEdt() {
		return doctorContactNumEdt;
	}

	public WebElement getDoctorEmailEdt() {
		return doctorEmailEdt;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public void selectDoctorSpecialization(String doctorSpecialization)
	{
		selectDropDown(doctorSpecializationDrpDwn, doctorSpecialization);	
	}

}
