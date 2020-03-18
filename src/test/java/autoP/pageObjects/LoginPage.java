package autoP.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;

	// Constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickloginlandingbtn() {
		// TODO Auto-generated method stub
		
	}

	public void clickloginbtn1() {
		// TODO Auto-generated method stub
		
	}

	

}
