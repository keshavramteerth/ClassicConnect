package connect.assignmentscreation;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.Assignments;
import pageobjectrepolib.LoginPage;

public class BlogAssignment 
{
	public WebDriver driver;
	LoginPage signin;
	WebdriverCommonlib wc;
	Assignments asgmnt;
	
	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		//launch browser
		driver = Driver.getBrowser();
		signin = PageFactory.initElements(driver, LoginPage.class);
		asgmnt = PageFactory.initElements(driver, Assignments.class);
		wc = PageFactory.initElements(driver, WebdriverCommonlib.class);

	}
	
	@Test
	public void CreateBlogAssignmentTest() throws InterruptedException
	{
		signin.logintoapp(Constants.userid, Constants.password, Constants.url);
		asgmnt.selectSection();
		asgmnt.CreateBlogAssignment();
	}
	
	@AfterMethod
	public void configAftermtd()
	{
		driver.quit();
	}

}
