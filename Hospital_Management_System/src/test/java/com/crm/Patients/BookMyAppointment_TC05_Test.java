package com.crm.Patients;

import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.BookAppointmentPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserDashboardPage;
/**
 * 
 * @author Bindura
 *
 */
public class BookMyAppointment_TC05_Test extends BaseClass
{
	@Test
	public void bookMyAppointment_TC05_Test() {

		//click on patients link
		HMSHomePage homepage = new HMSHomePage(driver);
		homepage.getPatientslogin();

		String USERNAME = fLib.getPropertKeyValue("patientusername");
		String PASSWORD = fLib.getPropertKeyValue("patientpassword");

		//open patient login page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginToApplication(USERNAME,PASSWORD);

		//navigate to Book my appointment(click on Book Appointment Link
		UserDashboardPage userdashboardpage = new UserDashboardPage(driver);
		userdashboardpage.clickBookAppointment();

		//fetch doctorSpecialization from Excel file
		String doctorSpecialization = eLib.readDataFromExcel("Doctor", 7, 5);

		//fetch doctor from Excel file
		String doctor = eLib.readDataFromExcel("Doctor", 3, 4);


		//select doctor specialization
		BookAppointmentPage bookAppointmentPage = new BookAppointmentPage(driver);
		bookAppointmentPage.selectSpecialization(doctorSpecialization);

		//fetch doctor from excel
		bookAppointmentPage.selectDoctor(doctor);

		bookAppointmentPage.getDate().click();
		
		
		//fetch appointment date from Excel file
		//String previousDate = eLib.readDataFromExcel("Doctor", 2, 10);
		//System.out.println("previousDate is "+previousDate);


		bookAppointmentPage.getDate().click();
		bookAppointmentPage.getDate().sendKeys("2022-08-10");

		//fetch doctorSpecialization from Excel file
		String time = eLib.readDataFromExcel("Doctor", 2, 11);
		bookAppointmentPage.getTime().sendKeys(time);;

		//click on submit button
		bookAppointmentPage.submit();

		//click OK alert popup
		wLib.switchToAlertPopUpAndAccept(driver,"Your appointment successfully booked");

		//logout as patient(click user dropdown then click on logout)
		UserDashboardPage userDashboardPage=new UserDashboardPage(driver);
		userDashboardPage.clicklogOut();
	}
}
