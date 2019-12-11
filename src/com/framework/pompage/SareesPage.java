package com.framework.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.BasePage;

public class SareesPage extends BasePage
{
	
	@FindBy(linkText = "Cotton Sarees")
	private WebElement cottonSarees;
	
	@FindBy(linkText="Linen Sarees")
	private WebElement linenSarees;
	
	@FindBy(linkText="Chiffon Sarees")
	private WebElement chiffonSarees;
	
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}


	public void clickOnEmbroidedSarees()
	{
		verifyElementPresent(cottonSarees);
		cottonSarees.click();
	}
	
	public void  clickOnLinenSarees()
	{
		verifyElementPresent(linenSarees);
		linenSarees.click();
	}
	
	public void clickOnChiffonSarees()
	{
		verifyElementPresent(chiffonSarees);
		chiffonSarees.click();
	}
}
