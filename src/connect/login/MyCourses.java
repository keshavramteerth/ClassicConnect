package connect.login;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectrepolib.CoursePage;
import pageobjectrepolib.LoginPage;

public class MyCourses 
{
	public WebDriver driver;
	LoginPage signin;
	CoursePage course;
	WebdriverCommonlib wc;

	@BeforeMethod
	public void configBeformtd() throws InterruptedException
	{
		//launch browser
		driver = Driver.getBrowser();
		signin = PageFactory.initElements(driver, LoginPage.class);
		course = PageFactory.initElements(driver, CoursePage.class);
		wc = PageFactory.initElements(driver, WebdriverCommonlib.class);

	}

/*	@Test
	public void CourseCancelBtnTest() throws InterruptedException
	{
		signin.logintoapp(Constants.userid, Constants.password, Constants.url);
		wc.waitForpageToLoad();
		course.clickCancelIcon();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL,"f")).perform();
		act.sendKeys(Constants.courseName).perform();
		act.sendKeys(Keys.ENTER).perform();
	}*/
	
	@Test
	public void CreateCourse() throws InterruptedException
	{
		signin.logintoapp(Constants.userid, Constants.password, Constants.url);
		wc.waitForpageToLoad();
		course.courseCreation();
		
	}

	@AfterMethod
	public void configAftermtd() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
