package com.hms.myProfile;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hms.genericUtilities.BaseClass;
import com.hms.objectRepository.HMSHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class UpdatePatientProfileTest extends BaseClass{

	@Test
	public void updatePatient() {

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//click on patients link
		HMSHomePage homepage = new HMSHomePage(driver);
		homepage.getPatientslogin();


	}
}
