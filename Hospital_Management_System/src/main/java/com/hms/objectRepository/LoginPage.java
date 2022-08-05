package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Indrajit
 *
 */
public class LoginPage {
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(name = "username") private WebElement username;
	
	@FindBy(name = "password") private WebElement password;
	
	@FindBy(xpath = "//a[@href='forgot-password.php']") private WebElement forgotpassword;
	
	@FindBy(name = "submit") private WebElement loginBtn;
	
	@FindBy(xpath = "//a[@href='registration.php']") private WebElement createAccount;
	
	//utilization
	public void enterUsername(String userName)
	{
		username.sendKeys(userName);
	}
	
	public void enterPassword(String passWord)
	{
		password.sendKeys(passWord);
	}
	
	public void getForgotPassword()
	{
		forgotpassword.click();
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	public void createAccountLink()
	{
		createAccount.click();
	}
} 
