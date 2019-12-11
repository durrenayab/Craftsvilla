package com.framework.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.BasePage;

public class HomePage extends BasePage
{
	
	//Declarations
	@FindBy(id="cartCount")
	private WebElement LNK_cart;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement LNK_signIn;
	
	@FindBy(name="q")
	private WebElement TXT_searchbox;
	
	@FindBy(xpath = "//a[@href=\"/womens-clothing/sarees/?MID=megamenu_sarees_seeall\"]")
	private WebElement LNK_sarees;
	
	@FindBy(id="cv-logo")
	private WebElement LNK_logo;
	
	@FindBy(xpath="//a[@href=\"/jewellery/necklaces/?MID=megamenu_jewellery_seeall\"]")
	private WebElement LNK_jewellery;
	
	
	@FindBy(xpath="//span[text()='My Account']")// (xpath ="//i[@class='icon first_arrow hidden-xs']")
	private WebElement account;
	
	@FindBy(xpath = "//img[@class='logout-icon mr-2']")
	private WebElement logoutBtn;
	
	
	
	//Initialize
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickOnCartButton()
	{
		try
		{
			verifyElementPresent(LNK_cart);
			LNK_cart.click();
			log.info("clicked successfully on "+LNK_cart);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+LNK_cart+e);
		}
	}
	
	public void clickOnSignInLink()
	{
		try
		{
			verifyElementPresent(LNK_signIn);
			LNK_signIn.click();
			log.info("");
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void setSearchString(String searchVal)
	{
		try
		{
			verifyElementPresent(TXT_searchbox);
			TXT_searchbox.sendKeys(searchVal);
			log.info("");
		}
		catch(Exception e)
		{
			log.error("");
		}
	}

	
	public void goToSareesLink()
	{
		try
		{
			verifyElementPresent(LNK_sarees);
			mouseOver(LNK_sarees);
			log.info("");
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void gotoAccount()
	{
		try
		{
		verifyElementPresent(account);
		mouseOver(account);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public boolean clickOnLogout()
	{
		try
		{
		verifyElementPresent(logoutBtn);
		logoutBtn.click();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}