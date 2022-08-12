package com.hms.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {

	//initialization
	public  AdminDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declration
	@FindBy(xpath="(//a[@href='appointment-history.php'])[2]") private WebElement adminAppointmentLink;
	@FindBy(xpath="(//a[@href='manage-users.php'])[2]") private WebElement manageUserslink;
	@FindBy(xpath="//a[@href='manage-doctors.php']") private WebElement manageDrslink;
	@FindBy(xpath = "(//a[@href='manage-patient.php'])[2]") private WebElement managepatientslink;
	@FindBy(xpath = "(//a[@href=\"unread-queries.php\"])[2]") private WebElement newQuerieslink;
	
	@FindBy(xpath = "//span[@class='username']")  private WebElement admindropdwn;
	
	
@FindBy(xpath="//a[@href='logout.php']") private WebElement adminlogout;

	
	
	//utlisation
	
	public WebElement getAdminAppointmentLink() {
		return adminAppointmentLink;
	}
	
	
	
public WebElement getAdminlogout() {
		return adminlogout;
	}

//Business logic

public void adminAppointmentLinkM() {
	adminAppointmentLink.click();
}
 public void adminlogout() {
	 admindropdwn.click();
	 adminlogout.click(); 
	 }
 public void manageUserslinkM() {
	 manageUserslink.click();
 }
 
 public void manageDrslinM() {
	 manageDrslink.click();
}
 public void managepatientslinkM() {
	 managepatientslink.click();
	}
 
 public void newQuerieslinkM() {
	 newQuerieslink.click();
 }

}

