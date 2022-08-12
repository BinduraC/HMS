package com.crm.Patients;

import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.BookAppointmentPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserAppointmentHistoryPage;
import com.hms.objectRepository.UserDashboardPage;

public class AdminAppointmentTC_02Test extends BaseClass{
	@Test
	public void adminAppointmentTC_02Test()
	{
		wLib.waitForPageToLoad(driver);
		//login to patients page
		HMSHomePage hmsHomePage=new HMSHomePage(driver);
		hmsHomePage.getPatientslogin();

		//fetch the data from properties file
		String USERNAME = fLib.getPropertKeyValue("patientusername");
		String PASSWORD = fLib.getPropertKeyValue("patientpassword");

		//login to Patient module
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApplication(USERNAME, PASSWORD);

		//click on book appointment link
		UserDashboardPage userDashboardPage=new UserDashboardPage(driver);
		userDashboardPage.clickBookAppointment();

		//fetch data from excel sheet
		String specializationName = eLib.readDataFromExcel("Doctor", 5, 5);
		String doctorName = eLib.readDataFromExcel("Doctor", 5, 4);

		//fill all the details to book an appointment
		BookAppointmentPage bookAppointmentPage=new BookAppointmentPage(driver);
		bookAppointmentPage.selectSpecialization(specializationName);
		bookAppointmentPage.selectDoctor(doctorName);
		bookAppointmentPage.getDate().sendKeys("2022-08-23");
		bookAppointmentPage.getTime().sendKeys("6:08 PM");
		bookAppointmentPage.submit();

		//click ok on alert popup page
		wLib.switchToAlertPopUpAndAccept(driver,"Your appointment successfully booked");

		//move to dashboard and click on 
		userDashboardPage.clickAppointmentHistory();

		//fetch appointment date n time from excel
		String appointmentDate = eLib.readDataFromExcel("Patient", 3, 11);

		//verify 
		UserAppointmentHistoryPage userAppointmentHistory=new UserAppointmentHistoryPage(driver);
		userAppointmentHistory.getAppDateAndTime(appointmentDate);

		//click on ok on alert popup
		//wLib.switchToAlertPopUpAndAccept(driver, "Are you sure you want to cancel this appointment ?");

		//sign out as patient
		userDashboardPage.clicklogOut();
	}
}
