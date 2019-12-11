package com.framework.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.BasePage;

public class HomePage2 extends BasePage
{

	@FindBy(id="cv-logo")
	private WebElement link_logo;
	@FindBy(id="cartCount")
	private WebElement Cart;
	@FindBy(xpath="//a[@href=\"/womens-clothing/sarees/?MID=megamenu_sarees_seeall\"]")
	private WebElement lnk_sarees;
	@FindBy(xpath="//a[@href=\"/womens-clothing/salwar-suits/?MID=megamenu_salwarsuit_seeall\"]")
    private WebElement link_SalwarSuit;
	
	
	
public HomePage2(WebDriver driver)
{
		super(driver);
		PageFactory.initElements(driver,this);
	}

{

}
}