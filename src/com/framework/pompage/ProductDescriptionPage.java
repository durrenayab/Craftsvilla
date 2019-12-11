package com.framework.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.framework.generic.BasePage;



public class ProductDescriptionPage extends BasePage
{
	@FindBy(id="addtocart")
	private WebElement addTocartButton;
	
	@FindBy(id="buynow")
	private WebElement buyNowButton;
	
	@FindBy(xpath="//h1[@itemprop='name']")
	private WebElement productName;
	
	public ProductDescriptionPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnBuyNow()
	{
		verifyElementPresent(buyNowButton);
		buyNowButton.click();
	}
	
	public void checkProductName(String product_Name)
	{
		verifyElementPresent(productName);
		String productText = productName.getText();
		Assert.assertEquals(productText,product_Name);
	}

}