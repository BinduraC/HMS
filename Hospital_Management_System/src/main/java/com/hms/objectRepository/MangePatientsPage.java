package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author dinuh
 *
 */
public class MangePatientsPage
{
	//declaration
	@FindBy(xpath="//h1[@class='mainTitle']") private WebElement managePatientsPgTitle;

	//initialization
	public MangePatientsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getManagePatientsPgTitle() {
		return managePatientsPgTitle;
	}


}
