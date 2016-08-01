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

public class WebActivityAssignment 
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
	public void CreateWebActivityAssignmentTest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		// Get Test Data
		
		String WebActivityAssignmentName = elib.getExcelData("Sheet1", 4, 1);
		String WebActivityAssignmentDescription = elib.getExcelData("Sheet1", 4, 2);
		String WebActivityAssignmentLinkName = elib.getExcelData("Sheet1", 4, 3);
		String WebActivityAssignmentLinkURL = elib.getExcelData("Sheet1", 4, 4);
				
		signin.logintoapp(Constants.userid, Constants.password, Constants.url);
		asgmnt.selectSection();
		asgmnt.CreateWebActivityAssignment(WebActivityAssignmentName,WebActivityAssignmentDescription,WebActivityAssignmentLinkName,WebActivityAssignmentLinkURL);
	}
	
	@AfterMethod
	public void configAftermtd()
	{
		driver.quit();
	}

}
