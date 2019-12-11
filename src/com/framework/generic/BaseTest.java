package com.framework.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public abstract  class BaseTest implements AutoConstant
{
public static WebDriver driver = null;
public static WebDriverWait wait=null;	
	@Parameters("browser")
	@BeforeMethod
	public void openApp(String browserType)
	{
		if(browserType.equalsIgnoreCase("CHROME"))
		{
			System.setProperty(CHROME_KEY, CHROMEVALUE);
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		}
		else 
		{
			Reporter.log("Invalid browser Selection", true);
			
		}
		
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(APP_URL);
	}

	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}