package com.hms.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author dinuh
 *
 */
public class ManagePatientsPage
{
	//declaration 
	@FindBy(xpath="//h1[@class='mainTitle']") private WebElement managePatientsPgTitle;

	//initialization
	public ManagePatientsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getManagePatientsPgTitle() {
		return managePatientsPgTitle;
	}
	public void verifypatientAddedOrNot(WebDriver driver,String name) 
	{
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody"));
		if(table.contains(name)){
			System.out.println("patient created");
		}
		else
			System.out.println("patient not created");
	}
}
