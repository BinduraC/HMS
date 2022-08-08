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
public class DoctorChangePasswordPage 
{
	//declaration 
	@FindBy(xpath="//input[@name='cpass']") private WebElement currentPasswordEdt;

	@FindBy(xpath="//input[@name='npass']") private WebElement newPasswordEdt;

	@FindBy(xpath="//input[@name='cfpass']") private WebElement confirmPasswordEdt;

	@FindBy(xpath="//button[@name='submit']")private WebElement submitBtn;

	//initialization
	public DoctorChangePasswordPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void currentPassword(String currentPassword) 
	{
		currentPasswordEdt.sendKeys(currentPassword);
	}

	public void newPassword(String newPassword) 
	{
		newPasswordEdt.sendKeys(newPassword);
	}

	public void confirmPassword(String confirmPassword)
	{
		confirmPasswordEdt.sendKeys(confirmPassword);
	}

	public void submitBtn() 
	{
		submitBtn.click();
	}

}
