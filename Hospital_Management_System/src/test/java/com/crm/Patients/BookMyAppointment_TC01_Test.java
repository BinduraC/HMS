package com.crm.Patients;

import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserDashboardPage;
/**
 * 
 * @author dinuh
 *
 */
public class BookMyAppointment_TC01_Test extends BaseClass
{
	@Test
	public void bookMyAppointment_TC01_Test()
	{
		//navigate to application
		HMSHomePage hmsHomePage=new HMSHomePage(driver);
		hmsHomePage.getPatientslogin();
		
		//fetch data from file utility
		String USERNAME=fLib.getPropertKeyValue("patientusername");
		String PASSWORD=fLib.getPropertKeyValue("patientpassword");

		//login as patient
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToApplication(USERNAME, PASSWORD);
		
		//click on book appointment
		UserDashboardPage userDashboardPage=new UserDashboardPage(driver);
		userDashboardPage.clickBookAppointment();
		
		//logout as patient(click user dropdown then click on logout)
		userDashboardPage.clicklogOut();
	}
}
