package com.crm.Patients;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.BookAppointmentPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserDashboardPage;

/**
 * 
 * @author INDRAJIT
 *
 */
public class BookMyAppointmentTC_04Test extends BaseClass {
	public void bookMyAppointmentTC_04Test()
	{
		//login to patients page
		HMSHomePage hmsHomePage=new HMSHomePage(driver);
		hmsHomePage.getPatientslogin();
		
		//fetch the data from properties file
		String USERNAME = fLib.getPropertKeyValue("patientusername");
		String PASSWORD = fLib.getPropertKeyValue("patientpassword");
		
		//login to Patient module
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(USERNAME);
		loginPage.enterPassword(PASSWORD);
		loginPage.clickLoginBtn();
		
		//click on book appointment link
		UserDashboardPage userDashboardPage=new UserDashboardPage(driver);
		userDashboardPage.clickBookAppointment();
		
		//fetch data from excel sheet
		String spName = eLib.readDataFromExcel("Doctor", 5, 5);
		
		//fill all the details to book an appointment
		BookAppointmentPage bookAppointmentPage=new BookAppointmentPage(driver);
		bookAppointmentPage.selectSpecialization(spName);
		bookAppointmentPage.submit();
		
		//sign out as patient
		userDashboardPage.clickSignOut();
	}
}
