package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author dinuh
 *
 */
public class AddPatientPage 
{
	//declaration
	@FindBy(name="patname") private WebElement patientNameEdt;

	@FindBy(name="patcontact") private WebElement patientContactNumEdt;

	@FindBy(xpath="//input[@id='patemail']") private WebElement patientEmailedt;

	@FindBy(xpath="//label[contains(text(),'Female')]") private WebElement genderFemaleRadioBtn;

	@FindBy(xpath="//label[contains(text(),'Male')]") private WebElement genderMaleRadioBtn;

	@FindBy(name="pataddress") private WebElement patientAdressEdt;

	@FindBy(name="patage") private WebElement patientAgeEdt;

	@FindBy(name="medhis") private WebElement medicalHistory;

	@FindBy(id="submit") private WebElement addBtn;

	//initialization
	public AddPatientPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	//utilization

	public void enterPatientName(String patientName)
	{
		patientNameEdt.sendKeys(patientName);
	}

	public void enterPatientContactNum(String contactNumber) 
	{
		patientContactNumEdt.sendKeys(contactNumber);
	}

	public void enterPatientEmail(String patientMail) 
	{
		patientEmailedt.sendKeys(patientMail);;
	}

	public void genderFemaleRadioBtn()
	{
		genderFemaleRadioBtn.click();
	}

	public void genderMaleRadioBtn() 
	{
		genderMaleRadioBtn.click();
	}

	public void enterPatientAdressEdt(String patientaddress) 
	{
		patientAdressEdt.sendKeys(patientaddress);
	}

	public void enterPatientAgeEdt(String patientAge) 
	{
		patientAgeEdt.sendKeys(patientAge);
	}

	public void medicalHistoryEdt(String medHistory) 
	{
		medicalHistory.sendKeys(medHistory);
	}

	public void addBtn()
	{
		addBtn.click();
	}

}
