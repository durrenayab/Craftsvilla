package com.framework.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.framework.generic.BaseTest;
import com.framework.pompage.CartPage;
import com.framework.pompage.CheckOutPage;
import com.framework.pompage.HomePage;
import com.framework.pompage.LinenSareesPage;
import com.framework.pompage.ProductDescriptionPage;
import com.framework.pompage.SareesPage;

public class LinenSareesScripts extends BaseTest
{
	HomePage homepage = null;
	SareesPage sp = null;
	LinenSareesPage lp = null;
	ProductDescriptionPage pd = null;
	CheckOutPage cp = null;

	
	@Test
	public void TC_01_linenSareeScript()
	{
		homepage = new HomePage(driver);
		sp = new SareesPage(driver);
		lp = new LinenSareesPage(driver);
		pd = new ProductDescriptionPage(driver);
		cp = new CheckOutPage(driver);
				
		try
		{
		homepage.goToSareesLink();
		sp.clickOnLinenSarees();
		lp.goToProduct1537544423();
		Assert.fail();
		pd.clickOnBuyNow();
		cp.setMobile("9986509551");
		cp.captureOTPMessage();
		cp.setOTP("8695");
		cp.clickOnLogin();
		
		Reporter.log("logged in successfully");
		}
		catch(Exception e)
				{
			Reporter.log("Unable to capture the screenshot"+e);
		        }
	}
	@Test
	public void TC_02_linenSareeScript()
	{
		
	}
		
	}

