package com.framework.pompage;
//This class contains all webelements on the cart page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.framework.generic.BasePage;

public class CartPage extends BasePage
{

	@FindBy(id="address-first-name")
	private WebElement firstName;
	
	@FindBy(id="address-mobileno")
	private WebElement mobileNo;
	

	
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void setFirstName(String fName)
	{
		verifyElementPresent(firstName);
		firstName.sendKeys(fName);
	}
	
	public void setMobile(String mob)
	{
		verifyElementPresent(mobileNo);
		mobileNo.sendKeys(mob);
	}
	


}