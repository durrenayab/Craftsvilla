package com.framework.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage
{
	public WebDriver driver = null;
	public Logger log = Logger.getLogger(BasePage.class);
	
	public BasePage(WebDriver driver )
	{
		this.driver = driver;
	}
	
	public void verifyTitle(String expTitle)
	{
		String act_title = null;
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.titleIs(expTitle));
			act_title= driver.getTitle();
			Assert.assertEquals(act_title, expTitle);
			log.info(act_title +" and "+expTitle +"matched");
			
		}
		catch(Exception e)
		{
			log.error(act_title+"and "+expTitle+"didnot match : "+e);
		}
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		try
		{
			WebDriverWait w= new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.visibilityOf(ele));
			log.info(ele+"was found");
		}
			catch (Exception e) 
			{
				
				log.error(ele+"was not found : "+e);
			}
		}
	
	
	public void mouseOver(WebElement ele)
	{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			log.info("MouseOvered on "+ele);
		}
		catch(Exception e)
		{
			log.error("Unable to mouse over on "+ele +" : "+e);
		}
	}
	

}