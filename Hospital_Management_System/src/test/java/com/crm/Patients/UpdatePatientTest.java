package com.crm.Patients;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.genericUtilities.ExcelUtility;
import com.hms.objectRepository.BookAppointmentPage;
import com.hms.objectRepository.HMSHomePage;
import com.hms.objectRepository.LoginPage;
import com.hms.objectRepository.UserDashboardPage;

public class UpdatePatientTest extends BaseClass{

	
	@Test
	public void updatePatient() {
		
		ExcelUtility excelUtility = new ExcelUtility();
		
		//click on patients link
		HMSHomePage homepage = new HMSHomePage(driver);
		homepage.getPatientslogin();
		
		//open patient login page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginToApplication();
		
		//navigate to Book my appointment(click on Book Appointment Link
		UserDashboardPage userdashboardpage = new UserDashboardPage(driver);
		userdashboardpage.clickBookAppointment();
		
		//fetch doctorSpecialization from Excel file
		String doctorSpecialization = excelUtility.readDataFromExcel("Doctor", 1, 5);
		
		//fetch doctor from Excel file
		String doctor = excelUtility.readDataFromExcel("Doctor", 2, 4);
				
					
		//select doctor specialization
		BookAppointmentPage bookAppointmentPage = new BookAppointmentPage(driver);
		bookAppointmentPage.selectSpecialization(doctorSpecialization);
		
		//fetch doctor from excel
		bookAppointmentPage.selectDoctor(doctor);
		
		//fetch doctorSpecialization from Excel file
		String previousDate = excelUtility.readDataFromExcel("Doctor", 2, 10);
		
		
		bookAppointmentPage.getDate().click();
		bookAppointmentPage.getDate().sendKeys("2022-08-10");
		
		//fetch doctorSpecialization from Excel file
		String time = excelUtility.readDataFromExcel("Doctor", 2, 11);
		bookAppointmentPage.getTime().sendKeys(time);;
		
		//click on submit button
		bookAppointmentPage.submit();
	}
	
	
}
