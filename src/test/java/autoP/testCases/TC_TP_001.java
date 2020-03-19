package autoP.testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import autoP.base.BaseClass;
import autoP.pageObjects.LoginPage;

public class TC_TP_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException, InterruptedException
	{	
		// Login page 
		LoginPage LoginPage = new LoginPage(driver);		
		
		
		  LoginPage.clickSignIn();
		  logger.info("Clicking on Signin button to enter user name and password");
		  
		  LoginPage.setEmail(username); 
		  logger.info("providing user name");
		  
		  LoginPage.setPassword(password);
		  logger.info("providing password"); 
		  
		  LoginPage.submitButton();
		  logger.info("Clicking on submit button to sign in");
		 
		
		// Validating User now in Account Page after logging
		  //Using Explicit wait
		  
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.titleIs(driver.getTitle()));
		  
		
		if(driver.getTitle().equals("My account - My Store"))
		{
			Assert.assertTrue(true);
			logger.info("login success");
		}
		else
		{
			captureScreen(driver,"loginTest");
			// to capture screen on failure and here after driver we use the name of the current test method i.e. loginTest
			logger.error("login is failed : Screen shot taken");
			Assert.assertTrue(false);
		}
		System.out.println(" " + "Page Title  : " + driver.getTitle());
		logger.info("Vaidating title page - Home page, after login");
	} 
}
