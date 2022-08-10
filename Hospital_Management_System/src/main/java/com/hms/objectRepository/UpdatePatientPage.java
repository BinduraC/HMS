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
	@FindBy(xpath = "//textarea[@name='address']")private WebElement addressChange;
	@FindBy(xpath = "//button[@class='btn btn-o btn-primary']")private WebElement clickUpdateBtn;

	//utilization
	public void enterPatientAddress(String address) {
		addressChange.sendKeys("address");
	}
	
	public void clickUpdate() {
		clickUpdateBtn.click();
	}
}
