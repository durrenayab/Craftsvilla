package com.framework.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.BasePage;



public class LinenSareesPage extends BasePage
{
	@FindBy(xpath="//img[contains(@src,'1537544423-Craftsvilla_1.jpg')]")
	private WebElement product_1537544423;
	
	@FindBy(xpath="//img[contains(@src,'1546486624-Craftsvilla_1.jpg')]")
	private WebElement product_1546486624;
	
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement priceOrder;
	
	
	public LinenSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void goToProduct1537544423()
	{
		verifyElementPresent(product_1537544423);
		product_1537544423.click();
	}
	
	public void goToProduct1538760092()
	{
		verifyElementPresent(product_1546486624);
		product_1546486624.click();
		log.info("clicked on the product");
	}
	
	public void changePriceOrder()
	{
		verifyElementPresent(priceOrder);
		priceOrder.click();
	}
}
