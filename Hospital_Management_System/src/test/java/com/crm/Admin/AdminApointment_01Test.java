package com.crm.Admin;

import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.AdminDashboardPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;

public class AdminApointment_01Test extends BaseClass{
	@Test
	public void adminApointment_01Test() {

		//login as admin
		HMSHomePage hMSHomePage = new HMSHomePage(driver);
		hMSHomePage.getAdminlogin();
		
		//enter user name and password from property file
		String ADMINUSERNAME=fLib.getPropertKeyValue("adminusername");
		String ADMINPASSWORD=fLib.getPropertKeyValue("adminpassword");


		//login to admin
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginToApplication(ADMINUSERNAME, ADMINPASSWORD);

		//navigate to appointmnets
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.adminAppointmentLinkM();

		//logout as admin
		adminDashboardPage.adminlogout();


	}
}
