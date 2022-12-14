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
public class LoginPage{
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameEdt;
	
	@FindBy(xpath = "//input[@name='password']") 
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//a[@href='forgot-password.php']") private WebElement forgotpassword;
	
	@FindBy(name = "submit") private WebElement loginBtn;
	
	@FindBy(xpath = "//a[@href='registration.php']") private WebElement createAccount;
	
	//utilization
	public void enterUsername(String userName)
	{
		usernameEdt.sendKeys(userName);
	}
	
	public void enterPassword(String passWord)
	{
		passwordEdt.sendKeys(passWord);
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
	public void loginToApplication(String username, String password)
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		clickLoginBtn();
	}
} 
