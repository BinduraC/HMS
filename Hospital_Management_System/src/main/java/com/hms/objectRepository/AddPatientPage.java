package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatientPage 
{
	//declaration
@FindBy(name="patname") private WebElement patientNameEdt;

@FindBy(name="patcontact") private WebElement patientContactNum;

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

public WebElement getPatientNameEdt() {
	return patientNameEdt;
}

public WebElement getPatientContactNum() {
	return patientContactNum;
}

public WebElement getPatientEmailedt() {
	return patientEmailedt;
}

public WebElement getGenderFemaleRadioBtn() {
	return genderFemaleRadioBtn;
}

public WebElement getGenderMaleRadioBtn() {
	return genderMaleRadioBtn;
}

public WebElement getPatientAdressEdt() {
	return patientAdressEdt;
}

public WebElement getPatientAgeEdt() {
	return patientAgeEdt;
}

public WebElement getMedicalHistory() {
	return medicalHistory;
}

public WebElement getAddBtn() {
	return addBtn;
}

}
