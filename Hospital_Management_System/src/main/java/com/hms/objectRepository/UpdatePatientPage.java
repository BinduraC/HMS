package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Bindura
 * 
 */
public class UpdatePatientPage {
	//initialization
	public UpdatePatientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration
	
	@FindBy(name = "fname") private WebElement usernameEdt;
	
	@FindBy(xpath = "//textarea[@name='address']") private WebElement addressChange;
	
	@FindBy(name = "city") private WebElement cityChange;
	
	@FindBy(name = "gender") private WebElement genderDrpDwn;
	
	@FindBy(xpath = "//button[@class='btn btn-o btn-primary']")private WebElement clickUpdateBtn;

	//utilization
	public void enterUsername(String patientName)
	{
		usernameEdt.sendKeys(patientName);
	}
	
	public void enterPatientAddress(String address) {
		addressChange.sendKeys(address);
	}
	
	public void enterCity(String cityName)
	{
		cityChange.sendKeys(cityName);
	}
	
	public WebElement selectGenderDrpDwn()
	{
		return genderDrpDwn;
	}
	public void clickUpdate()
	{
		clickUpdateBtn.click();
	}
}
