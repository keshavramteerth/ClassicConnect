package connect.login;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.CoursePage;
import pageobjectrepolib.LoginPage;
import pageobjectrepolib.RegistrationPage;

public class StudentClassicRegistration 
{
	public WebDriver driver;
	LoginPage signin;
	CoursePage course;
	WebdriverCommonlib wc;
	RegistrationPage rp;

	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		//launch browser
		driver = Driver.getBrowser();
		signin = PageFactory.initElements(driver, LoginPage.class);
		course = PageFactory.initElements(driver, CoursePage.class);
		wc = PageFactory.initElements(driver, WebdriverCommonlib.class);
		rp = PageFactory.initElements(driver, RegistrationPage.class);

	}
	
	@Test
	public void RegisterStudentC15() throws InterruptedException
	{
		rp.registerstudent(Constants.studentid,Constants.studentpwd,Constants.studentFirstName,Constants.studentLastName);
	}
	
	@AfterMethod
	public void configAftermtd() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
