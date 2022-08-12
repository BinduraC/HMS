package com.crm.Patients;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.BookAppointmentPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserDashboardPage;

public class BookMyAppointment_TC02Test extends BaseClass
{
	@Test
	public void bookMyAppointment_TC02_Test()
	{
		//navigate to application
		HMSHomePage hmsHomePage=new HMSHomePage(driver);
		hmsHomePage.getPatientslogin();

		//fetch data from file utility
		String USERNAME=fLib.getPropertKeyValue("patientusername");
		String PASSWORD=fLib.getPropertKeyValue("patientpassword");
		String doctorSpecialization=eLib.readDataFromExcel("Doctor", 7, 5);
		String doctorName=eLib.readDataFromExcel("Doctor", 3, 4);
		String consultancyFees=eLib.readDataFromExcel("Doctor", 2, 7);
				
		//login as patient
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApplication(USERNAME, PASSWORD);

		//click on book appointment
		UserDashboardPage userDashboardPage=new UserDashboardPage(driver);
		userDashboardPage.clickBookAppointment();
		
		//select doctor specialization dropdown from excel
		BookAppointmentPage bookAppointmentPage=new BookAppointmentPage(driver);
		bookAppointmentPage.selectSpecialization(doctorSpecialization);
		
		//select doctor from excel
		bookAppointmentPage.selectDoctor(doctorName);
		
		//check consultancy fees and verify
		String actConsFees = bookAppointmentPage.getConsultancyFees().getText();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(actConsFees.contains(consultancyFees));
		Reporter.log("consultancy fees is matching and verifed",true);
		softAssert.assertAll();
		
		//enter today date in calender
		bookAppointmentPage.getDate().click();
		bookAppointmentPage.getTodayDate().click();
		//enter current time
		bookAppointmentPage.getTime().click();
		
		//click on submit button
		bookAppointmentPage.submit();
		
		//handle alert popup accept it
		wLib.switchToAlertPopUpAndAccept(driver, "Your appointment successfully booked");
		
		//logout as patient
		userDashboardPage.clicklogOut();
			
		
	}
}
