package connect.studentregistration;

import java.io.IOException;

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
import pageobjectrepolib.CoursePage;
import pageobjectrepolib.LoginPage;
import pageobjectrepolib.RegistrationPage;

public class StudentC15Registration 
{
	public WebDriver driver;
	LoginPage signin;
	CoursePage course;
	WebdriverCommonlib wc;
	RegistrationPage rp;
	ExcelUtility elib;

	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		//launch browser
		driver = Driver.getBrowser();
		signin = PageFactory.initElements(driver, LoginPage.class);
		course = PageFactory.initElements(driver, CoursePage.class);
		wc = PageFactory.initElements(driver, WebdriverCommonlib.class);
		rp = PageFactory.initElements(driver, RegistrationPage.class);
		elib = PageFactory.initElements(driver, ExcelUtility.class);

	}
	
	@Test
	public void RegisterStudentC15() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		// Get Test Data
		
		String studentid = elib.getExcelData("StudentDetails", 1, 0);
		String studentpwd = elib.getExcelData("StudentDetails", 1, 1);
		String studentFirstName = elib.getExcelData("StudentDetails", 1, 2);
		String studentLastName = elib.getExcelData("StudentDetails", 1, 3);
				
		rp.registerC15student(studentid,studentpwd,studentFirstName,studentLastName);
	}
	
	@AfterMethod
	public void configAftermtd() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
