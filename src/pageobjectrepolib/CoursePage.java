package pageobjectrepolib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import genericlib.Log;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.Log;
import genericlib.WebdriverCommonlib;

public class CoursePage extends WebdriverCommonlib
{
	WebDriverWait wait;
	LoginPage signin;
	
	@FindBy(id="userName")
	private WebElement userNameEdt;
	
	@FindBy(id="password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement signinBtn;
	
	@FindBy(xpath="//a[@class='icon-cancel-circle right']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//a[@id='addCourse']")
	private WebElement addCourseBtn;
	
	@FindBy(xpath="//a[contains(text(),'Grader courses')]")
	private WebElement gradercourse;
	
	@FindBy(xpath="//div[@disclipline-id='999390']/span[@class='icon-expand-collapse icon-minus discipline-switch-js']")
	private WebElement expand;
	
	@FindBy(xpath="//div[@class='textbook-category-container large-5 columns']/span[@title='Show All Items']")
	private WebElement downarrowicon;
	
	@FindBy(xpath="//div[@id='step1']/div[@class='row collapse selectoption-container']/div[@class='textbook-category-container large-5 columns']/input")
	private WebElement courseselbox;
	
	@FindBy(xpath="//div[@class='jcarousel-next jcarousel-next-horizontal']")
	private WebElement slidingicon;
	
	@FindBy(xpath="//span[contains(text(),'0073273163')]")
	private WebElement isbn;
	
	@FindBy(xpath="//div[@class='module-list-container']/ul[@class='left module-list']/li[2]/span[@class='module-checkbox-container']")
	private WebElement bundleselectionradioBtn;
	
	@FindBy(id="next-button")
	private WebElement nxtBtn;
	
	@FindBy(id="courseNameValue")
	private WebElement courseName;
	
	@FindBy(xpath="//span[@id='selectedTimezone']/span[@class='arrow-blue-dn']")
	private WebElement timezonedropdown;
	
	@FindBy(xpath="//ul[@id='timezoneList']/li[contains(text(),'IST')]")
	private WebElement ISTtimezone;
	
	@FindBy(id="sectionName")
	private WebElement sectionName;
	
	@FindBy(id="create-button")
	private WebElement createbutton;
	
	@FindBy(xpath="//a[@class='buttons btbl sectionhome-button']")
	private WebElement continuesectionhomebutton;
	
	@FindBy(xpath="//div[@id='continue_section']")
	private WebElement continue_section;
	
	@FindBy(xpath="//span[@class='courseName' and contains(text(),'Economics 02-August-2016')]")
	private WebElement coursenamechk;
	
	public void commonmtd()
	{
		Driver.driver.get(Constants.url);
		Driver.driver.manage().window().maximize();
		waitForpageToLoad();
	}
	
	
	public void courseCreation() throws InterruptedException
	{
		
		cancelBtn.click();
		Log.info("Cancel Button Clicked");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		addCourseBtn.click();
		Log.info("Add Course button clicked");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		courseselbox.sendKeys("Economics",Keys.DOWN,Keys.ENTER);
		Log.info("sent search keyword for course");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		courseselbox.sendKeys("Economics",Keys.DOWN,Keys.ENTER);
		Log.info("Selecting searched course");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		slidingicon.click();
		Thread.sleep(500);
		Log.info("Sliding for available course ISBN's");
		
		isbn.click();
		Log.info("Clicking particular ISBN");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		bundleselectionradioBtn.click();
		Log.info("Selecting bundle");
		
		nxtBtn.click();
		Log.info("Clicking on Next button");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		courseName.sendKeys(Constants.courseName);
		Log.info("Entering Course Name");
		
		timezonedropdown.click();
		Log.info("Clicking on Time Zone dropdown");
		Thread.sleep(500);
		Log.info("waiting For page To Load");
		
		ISTtimezone.click();
		Log.info("Selecting Time Zone");
		
		sectionName.sendKeys(Constants.sectionName);
		Log.info("Entering Section Name");
		
		createbutton.click();
		Log.info("Clicking on Create Course button");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		continuesectionhomebutton.click();
		Log.info("Clicking on Continue to Section Home button");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		continue_section.click();
		Log.info("navigating to Section Home");
		
		String coursenameobtained = coursenamechk.getText();
		Log.info("Fetching the created Course name");
		System.out.println(coursenameobtained);
//		if(coursenameobtained.equalsIgnoreCase(Constants.courseName))
//		{
//			System.out.println("Course Created With Provided Course Name");
//		}
//		else
//		{
//			System.out.println("Course Created with other Course Name");
//		}

	}
	
}
