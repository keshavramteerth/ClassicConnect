package connect.paam;

import java.awt.AWTException;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.PaamLoginPage;

public class paamlogin extends WebdriverCommonlib
{
	public WebDriver driver;
	PaamLoginPage paamsignin;

	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		//launch browser
		driver = Driver.getBrowser();
		paamsignin = PageFactory.initElements(driver, PaamLoginPage.class);

	}

//	@AfterMethod
//	public void configAftermtd()
//	{
//		driver.quit();
//	}
	
	@Test
	public void loginTest() throws AWTException, InterruptedException
	{
		paamsignin.commonmtd();
		
		//paamsignin.logintoc15(Constants.c15userid, Constants.c15password);
	}

}
