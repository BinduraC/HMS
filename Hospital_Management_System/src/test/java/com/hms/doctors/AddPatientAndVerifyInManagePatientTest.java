package com.hms.doctors;

import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.AddPatientPage;
import com.hms.objectRepository.DoctorsDashboardPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.ManagePatientsPage;

public class AddPatientAndVerifyInManagePatientTest extends BaseClass
{
@Test
public void registerPatientAndVerifyAppointmentInDoctorModuleTest()
{
//click on doctor login button
	HMSHomePage hmsHomePage=new HMSHomePage(driver);
	hmsHomePage.getDoctorslogin();
	
	//fetch details from excel
	String USERNAME=fLib.getPropertKeyValue("doctorusername");
	String PASSWORD=fLib.getPropertKeyValue("doctorpassword");
	
	String patientDrpDwnOptions=eLib.readDataFromExcel("Doctor", 2, 12);
	String patientName=eLib.readDataFromExcel("Patient", 4, 4);
	String patientCntNum=eLib.readDataFromExcel("Patient", 4, 7);
	String patientEmail=eLib.readDataFromExcel("Patient", 4, 5);
	String patientAddress=eLib.readDataFromExcel("Patient", 4, 9);
	String patientAge=eLib.readDataFromExcel("Patient", 4, 8);
	String medHistory=eLib.readDataFromExcel("Patient", 4, 10);
	
	//login as doctor
	LoginPage loginPage=new LoginPage(driver);
	loginPage.loginToApplication(USERNAME, PASSWORD);
	
	//select and click addpatient in patients dropdown
	DoctorsDashboardPage doctorsDashboardPage=new DoctorsDashboardPage(driver);
	doctorsDashboardPage.addPatient();
	
	//fill mandatory fields in add patients page
	AddPatientPage addPatientPage=new AddPatientPage(driver);
	addPatientPage.enterPatientName(patientName);
	addPatientPage.enterPatientContactNum(patientCntNum);
	addPatientPage.enterPatientEmail(patientEmail);
	addPatientPage.genderMaleRadioBtn();
	addPatientPage.enterPatientAdressEdt(patientAddress);
	addPatientPage.enterPatientAgeEdt(patientAge);
	addPatientPage.medicalHistoryEdt(medHistory);
	addPatientPage.addBtn();
	
	//click on managepatient and verify patient is added or not
	doctorsDashboardPage.managePatient();
	ManagePatientsPage managePatientsPage=new ManagePatientsPage(driver);
	managePatientsPage.verifypatientAddedOrNot(driver, patientName);
	
	//logout as doctor
	doctorsDashboardPage.logoutDoctor();
}
}
