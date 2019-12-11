package com.framework.pompage;
//This class contains all webelements on the cart page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.framework.generic.BasePage;

public class CheckOutPage extends BasePage
{
	@FindBy(id="login-mobile")
	private WebElement mobile;
	
	@FindBy(id="js-lg-otp")
	private WebElement otp;
	
	@FindBy(xpath="//button[text()='Login With OTP']")
	private WebElement loginButton;
	
	@FindBy(id="js-otp-message")
	private WebElement optMessage;
	
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setMobile(String mobileNumber)
	{
		verifyElementPresent(mobile);
		mobile.sendKeys(mobileNumber);
	}

	
	public void setOTP(String pin)
	{
		verifyElementPresent(otp);
		otp.sendKeys(pin);
	}
	
	
	public void clickOnLogin()
	{
		verifyElementPresent(loginButton);
		loginButton.click();
	}
	
	public void captureOTPMessage()
	{
		verifyElementPresent(optMessage);
		optMessage.getText();
		Assert.assertEquals("", "");
	}

}