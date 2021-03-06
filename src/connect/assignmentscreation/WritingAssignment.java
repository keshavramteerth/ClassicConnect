package connect.assignmentscreation;

import java.io.IOException;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.ExcelUtility;
import genericlib.WebdriverCommonlib;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.Assignments;
import pageobjectrepolib.LoginPage;

public class WritingAssignment 
{
	public WebDriver driver;
	LoginPage signin;
	WebdriverCommonlib wc;
	Assignments asgmnt;
	ExcelUtility elib;

	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		//launch browser
		driver = Driver.getBrowser();
		signin = PageFactory.initElements(driver, LoginPage.class);
		asgmnt = PageFactory.initElements(driver, Assignments.class);
		wc = PageFactory.initElements(driver, WebdriverCommonlib.class);
		elib = PageFactory.initElements(driver, ExcelUtility.class);

	}
	@Test
	public void CreateWritingAssignmentTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		// Get Test Data
		
		String WritingAssignmentName = elib.getExcelData("Assignments", 7, 1);
		String WritingAssignmentDescription = elib.getExcelData("Assignments", 7, 2);
				
		signin.logintoapp(Constants.userid, Constants.password, Constants.url);
		asgmnt.selectSection();
		asgmnt.CreateWritingAssignment(WritingAssignmentName,WritingAssignmentDescription);
	}
	@AfterMethod
	public void configAftermtd()
	{
		driver.quit();
	}

}
