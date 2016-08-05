package connect.studentPaam;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.ExcelUtility;

import java.awt.AWTException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.AssignmentsPaam;
import pageobjectrepolib.PaamLoginPage;

public class StudentC15Login 
{
	public WebDriver driver;
	PaamLoginPage paamsignin;
	ExcelUtility elib;
	AssignmentsPaam AssignmentsPaamref;

	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		//launch browser
		driver = Driver.getBrowser();
		paamsignin = PageFactory.initElements(driver, PaamLoginPage.class);
		elib = PageFactory.initElements(driver, ExcelUtility.class);
		AssignmentsPaamref = PageFactory.initElements(driver, AssignmentsPaam.class);

	}

	@Test()
	public void loginTest() throws AWTException, InterruptedException
	{
		paamsignin.logintoc15(Constants.c15userid, Constants.c15password);
		AssignmentsPaamref.logout();
	}

	@AfterMethod

	public void configAftermtd()
	{
		driver.quit();
	}

}
