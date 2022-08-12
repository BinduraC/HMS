package com.crm.Patients;




import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.BookAppointmentPage;
import com.hms.objectRepository.DoctorsDashboardPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserDashboardPage;

/**
 * 
 * @author Dipeeka
 *
 */
public class BookMyAppointment_TC09_Test extends BaseClass {

	@Test	
	public void bookMyAppointmentTest () {
		//navigate to application
		//fLib.getPropertKeyValue("url");




		//login to patients module
		HMSHomePage homepage=new HMSHomePage(driver);
		homepage.getPatientslogin();

		//Enter username and password

		String USERNAME=fLib.getPropertKeyValue("patientusername");
		String PASSWORD=fLib.getPropertKeyValue("patientpassword");

		//click on login button
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginToApplication(USERNAME, PASSWORD);;

		//click on book my appointmet
		UserDashboardPage userDashboardPage=new UserDashboardPage(driver);
		userDashboardPage.clickBookAppointment();


		//enter all detatilsdoctorName is 
		String doctorSpecialization=eLib.readDataFromExcel("Doctor", 6, 5);
		String doctorName=eLib.readDataFromExcel("Doctor", 5, 4);
		System.out.println(""+doctorName);
		//click on book my appointment
		BookAppointmentPage bookAppointmentPage = new BookAppointmentPage(driver);
		bookAppointmentPage.selectSpecialization(doctorSpecialization);
		bookAppointmentPage.selectDoctor(doctorName);
		bookAppointmentPage.getDate().sendKeys("09/08/2022");
		bookAppointmentPage.getTime().sendKeys("8:30 PM");

		bookAppointmentPage.submit();

		//logout as patient

		userDashboardPage.clicklogOut();

		//login as doctor
		homepage.getDoctorslogin();

		//enter username and password of doctor login from property file

		String USERNAMEDR=fLib.getPropertKeyValue("doctorusername");
		String PASSWORDDR=fLib.getPropertKeyValue("doctorpassword");

		//enter username and password of dr login 
		loginpage.loginToApplication(USERNAMEDR, PASSWORDDR);

		//click on my appointmnet
		DoctorsDashboardPage doctorsDashboardPage=new DoctorsDashboardPage(driver);
		doctorsDashboardPage.viewAppointmentHistory();
		doctorsDashboardPage.logoutDoctor();

	}
}

