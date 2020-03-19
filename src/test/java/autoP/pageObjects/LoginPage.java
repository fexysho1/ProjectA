package autoP.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	public WebDriver driver;
	
	//Constructor
	
		public LoginPage(WebDriver rdriver)
		{
			this.driver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		//ELEMENTS ON LOGIN PAGE
	
	// Contact us
	@FindBy(xpath="//div[@id='contact-link']//a[contains(text(),'Contact us')]")
	@CacheLookup					//used to improve performance
	WebElement contactUs;
	
	// Sign In Button
	@FindBy(xpath = "//a[@class='login']")
	@CacheLookup
	WebElement signIn;
	
	//Input Search Box
	@FindBy(xpath = "//input[@id='search_query_top']")
	@CacheLookup
	WebElement searchInput;
	
	// Search Button
	@FindBy(xpath = "//button[@name='submit_search']")
	@CacheLookup
	WebElement searchButton;
	
	//Email input to Create Account
	@FindBy(xpath = "//input[@id='email_create']")
	@CacheLookup
	WebElement inputEmailAccount;
	
	// Create an Account Button
	@FindBy(xpath = "//form[@id='create-account_form']//span[1]")
	@CacheLookup
	WebElement createAccountButton;
	
	// Already Registered Email
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement inputEmail;
	
	// Already Registered password
	@FindBy(xpath = "//input[@id='passwd']")
	@CacheLookup
	WebElement inputPassword;
	
	// Forgot Password Link
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement forgotPassword;
	
	// Submit Button
	@FindBy(xpath = "//p[@class='submit']//span[1]")
	@CacheLookup
	WebElement submitButton;
	
	public void clickSignIn() {
		signIn.click();
	}

	public void setEmail(String uEmail) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(inputEmail));
		Actions action = new Actions(driver);
		// Clearing text field 
			action.click(inputEmail)
				.keyDown(Keys.CONTROL)
				.sendKeys("a")
				.keyUp(Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE)
				.click()
				.sendKeys(uEmail)
				.build()
				.perform();
	}
			
	public void setPassword(String upassword) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(inputPassword));
		Actions action = new Actions(driver);
		// clearing text field
		action.click(inputPassword)
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.sendKeys(Keys.BACK_SPACE)
		.click()
		.sendKeys(upassword)
		.build().perform();	
	}
	
	public void submitButton() {
		submitButton.click();
	}

}
