package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.genericUtilities.FileUtility;

/**
 * 
 * @author Indrajit
 *
 */
public class LoginPage{
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(name = "username") 
	private WebElement usernameEdt;
	
	@FindBy(name = "password") 
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//a[@href='forgot-password.php']") 
	private WebElement forgotpassword;
	
	@FindBy(name = "submit") 
	private WebElement loginBtn;
	
	@FindBy(xpath = "//a[@href='registration.php']") private WebElement createAccount;
	
	//utilization
	
	
	public void getForgotPassword()
	{
		forgotpassword.click();
	}
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	public void createAccountLink()
	{
		createAccount.click();
	}
	public void loginToApplication()
	{
		String USERNAME = null;
		FileUtility fLib = new FileUtility();
		try {
			USERNAME = fLib.getPropertKeyValue("patientusername");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String PASSWORD = null;
		try {
			PASSWORD = fLib.getPropertKeyValue("patientpassword");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		usernameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSWORD);
		clickLoginBtn();
	}
} 
