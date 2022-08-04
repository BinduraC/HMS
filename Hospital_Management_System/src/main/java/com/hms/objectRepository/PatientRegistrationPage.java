package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author INDRAJIT
 *
 */
public class PatientRegistrationPage {
	//initialization
	public PatientRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//declaration
	@FindBy(name = "full_name") private WebElement fullnameEdt;
	
	@FindBy(name = "address") private WebElement addressEDt;
	
	@FindBy(name = "city") private WebElement cityEdt;
	
	@FindBy(xpath = "//label[@for='rg-female']") private WebElement femaleRdBtn;
	
	@FindBy(xpath = "//label[@for='rg-male']") private WebElement maleRdBtn;
	
	@FindBy(id = "email") private WebElement emailEdt;
	
	@FindBy(id = "password") private WebElement passwordEdt;
	
	@FindBy(id = "password_again") private WebElement passwordAgain;
	
	@FindBy(id = "submit") private WebElement submitBtn;
	
	//utilization
	public void enterFullname(String fullName)
	{
		fullnameEdt.sendKeys(fullName);
	}
	
	public void enterAddress(String address)
	{
		addressEDt.sendKeys(address);
	}
	
	public void enterCity(String city)
	{
		cityEdt.sendKeys(city);
	}
	
	public void femaleRdBtn()
	{
		femaleRdBtn.click();
	}
	
	public void maleRdBtn()
	{
		maleRdBtn.click();
	}
	
	public void enterEmail(String email)
	{
		emailEdt.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		passwordEdt.sendKeys(password);
	}
	
	public void confirmPassword(String password)
	{
		passwordAgain.sendKeys(password);
	}
	
	public void submitBtn()
	{
		submitBtn.click();
	}
}
