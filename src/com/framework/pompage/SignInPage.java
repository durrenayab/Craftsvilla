package com.framework.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.BasePage;

public class SignInPage extends BasePage
{
	
	@FindBy(id="facebookSignInBtn")
	private WebElement facebookButton;
	
	@FindBy(id="googleSignInBtn")
	private WebElement googleButton;
	
	@FindBy(id="emailId")
	private WebElement emailId;
	
	@FindBy(id="continueBtn")
	private WebElement continueButton;
	
	@FindBy(id="js-password")
	private WebElement enterPassword;
	
	@FindBy(id="loginCheck")
	private WebElement loginButton;
	
	@FindBy(id="set-password")
	private WebElement setpassword;
	
	@FindBy(id="userRegister")
	private WebElement registerButton;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnFaceBookButton()
	{
		try
		{
			verifyElementPresent(facebookButton);
			facebookButton.click();
			log.info("Clicked on "+facebookButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+facebookButton+e);
		}
		
	}
	
	public void clickOnGoogleButton()
	{
		try
		{
			verifyElementPresent(googleButton);
			googleButton.click();
			log.info("Clicked on "+googleButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+googleButton+e);
		}
	}
	
	public void setEmail(String email)
	{
		try
		{
			verifyElementPresent(emailId);
			emailId.sendKeys(email);
			log.info(email+" has been set to "+emailId);
		}
		catch (Exception e)
		{
			log.error("unable to set"+email +" to "+emailId+e);
		}
	}
	
	public void clickOnContinue()
	{
		try
		{
			verifyElementPresent(continueButton);
			continueButton.click();
			log.info("Clicked successfully on "+continueButton);
		}
		catch(Exception e)
		{
			log.error("unable to click on "+continueButton+e);
		}
	}

	public void enterPassword(String password)
	{
		try
			{
				verifyElementPresent(enterPassword);
				enterPassword.sendKeys(password);
				log.info(password+" has been set to "+enterPassword);
			}
			catch (Exception e)
			{
				log.error("unable to set"+password +" to "+enterPassword+e);
			}
	}
	
	
	public void clickOnLoginButton()
	{
		try
		{
			verifyElementPresent(loginButton);
			loginButton.click();
			log.info("clicked succesdfully on "+loginButton);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+loginButton+e);
		}
	}
	
	
}