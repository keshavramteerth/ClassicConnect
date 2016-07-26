package connect.login;

import genericlib.CaptureScreenshot;
import genericlib.Constants;
import genericlib.Driver;
import genericlib.Log;
import genericlib.Retry;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.LoginPage;
public class login 
{
	public WebDriver driver;
	LoginPage signin;
	
	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		//launch browser
		driver = Driver.getBrowser();
		signin = PageFactory.initElements(driver, LoginPage.class);
		
	}
	@Test(retryAnalyzer=Retry.class)
	public void LoginHelpLinkTest()
	{
		signin.clickHelpLink();
	}
	
	@Test
	public void LoginEnterEmailAlertTest()
	{
		try
		{
			signin.checkenteremailalert(Constants.url);
		}
		catch(Exception e)
		{
			CaptureScreenshot.captureScreenshot("LoginEnterEmailAlertTest");
			Log.info("Screen shot taken");
		}
		
	}
	
	@Test
	public void LoginEnterPwdAlertTest()
	{
		signin.checkenterpasswordalert(Constants.userid);
	}
	
	@Test
	public void LoginTOUlinkTest() throws InterruptedException
	{
		
		signin.CheckTOUlink(Constants.url);
			
	}
	
	@Test
	public void LoginForgotPwdTest()
	{
		signin.checkForgotPwdLink();
	}
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		signin.logintoapp(Constants.userid, Constants.password, Constants.url);
			
	}
	
	@AfterMethod
	public void configAftermtd()
	{
		driver.quit();
	}
	

}
