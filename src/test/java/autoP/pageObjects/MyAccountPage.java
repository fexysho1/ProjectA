package autoP.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	public WebDriver driver;
	
			// Constructor
	public MyAccountPage(WebDriver rdriver) {
			this.driver = rdriver;
			PageFactory.initElements(rdriver, this);
	}
	
				//ELEMENTS ON MY ACCOUNT PAGE
	
	//Customers name
	@FindBy(xpath = "//span[contains(text(),'Paul Mafe')]")
	@CacheLookup
	WebElement customersName;

}
