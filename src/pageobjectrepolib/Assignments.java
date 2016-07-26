package pageobjectrepolib;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.Log;
import genericlib.WebdriverCommonlib;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Assignments extends WebdriverCommonlib
{
	// File Attachment Assignment Repo

	@FindBy(xpath="//li[@id='tabassign_2']/a")
	private WebElement AddAssigmntBtn;

	@FindBy(xpath="//a[contains(text(),'file')]")
	private WebElement FileAtchLnk;

	@FindBy(xpath="//input[@id='assignmentTitle']")
	private WebElement FileAssignmentName;

	@FindBy(xpath="//textarea[@id='note']")
	private WebElement FileAssignmentDesc;

	@FindBy(xpath="//a[@id='setpolicies_btn']")
	private WebElement nextAssignBtn;

	@FindBy(xpath="//input[@id='scheduleDateStart']")
	private WebElement startDate;

	@FindBy(xpath="//div[@class='hrslabel']/input")
	private WebElement hourField;

	@FindBy(xpath="//div[@class='minlabel']/input")
	private WebElement minuteField;

	@FindBy(xpath="//select[@name='startampm']")
	private WebElement ampmdropdown;

	@FindBy(xpath="//a[@class='buttons btbl']")
	private WebElement AssignBtn;


	// Discussion Board Repo

	@FindBy(xpath="//a[contains(text(),'discussion')]")
	private WebElement discussionAssignmentLnk;

	@FindBy(id="assignmentTitle")
	private WebElement discussionAssignmentName;

	@FindBy(id="tinymce")
	private WebElement discussionAssignmentDesc;

	@FindBy(id="availablity_now")
	private WebElement makeassignmentavailable;

	@FindBy(id="dueDate")
	private WebElement dueDate;

	@FindBy(id="duetime")
	private WebElement duetimedropdown;

	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement DiscussionNextAssignBtn;

	@FindBy(xpath="//a[@class='buttons btbl assign']")
	private WebElement DiscussionAssignBtn;

	// Blog Assignment Repo

	@FindBy(xpath="//a[contains(text(),'blog')]")
	private WebElement BlogAssignLnk;

	@FindBy(id="assignmentTitle")
	private WebElement BlogAssignmentName;

	@FindBy(id="tinymce")
	private WebElement BlogAssignmentDesc;

	@FindBy(id="availablity_now")
	private WebElement Blogmakeassignmentavailable;

	@FindBy(id="dueDate")
	private WebElement BlogdueDate;

	@FindBy(id="duetime")
	private WebElement Blogduetimedropdown;

	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement BlogNextAssignBtn;

	@FindBy(xpath="//a[@class='buttons btbl assign']")
	private WebElement BlogAssignBtn;

	// Web Activity Assignment Repo

	@FindBy(xpath="//a[contains(text(),'activity')]")
	private WebElement WebActAssignLnk;

	@FindBy(id="assignmentTitle")
	private WebElement WebActAssignmentName;

	@FindBy(id="note")
	private WebElement WebActAssignmentDesc;

	@FindBy(id="webLinkName")
	private WebElement webLinkName;

	@FindBy(id="webLinkURL")
	private WebElement webLinkURL;

	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement WebActNextAssignBtn;

	@FindBy(xpath="//input[@id='scheduleDateStart']")
	private WebElement WebActstartDate;

	@FindBy(xpath="//input[@class='input clearhrs txtHour' and @pid='startHourMin']")
	private WebElement WebActstarthourField;

	@FindBy(xpath="//input[@class='input clearhrs txtMinute' and @pid='startHourMin']")
	private WebElement WebActstartminField;

	@FindBy(xpath="//select[@name='startampm']")
	private WebElement webActstartampmdropdown;

	@FindBy(xpath="//input[@id='scheduleDateEnd']")
	private WebElement WebActdueDate;

	@FindBy(xpath="//input[@class='input clearhrs txtHour' and @pid='dueHourMin']")
	private WebElement WebActduehourField;

	@FindBy(xpath="//input[@class='input clearhrs txtMinute' and @pid='dueHourMin']")
	private WebElement WebActdueminField;

	@FindBy(xpath="//select[@name='dueampm']")
	private WebElement webActdueampmdropdown;

	@FindBy(xpath="//div[@id='normalButtons']/ul[@class='assign-blue-btn right btnpadleft mgntop20']/li[text()='assign']")
	private WebElement WebActAssignBtn;

	// Common Methods
	
	public void settingStartdate() throws InterruptedException
	{
		Boolean popup = Driver.driver.findElement(By.xpath("//div[@id='dp-popup']")).isDisplayed();
		DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
		Date date2 = new Date();
		String today = dateFormat2.format(date2); 
		// System.out.println(today);
		Thread.sleep(2000);
		if(popup)
		{
			WebElement TodaysDate = Driver.driver.findElement(By.xpath("//a[text()='"+today+"']"));
			TodaysDate.click();
			Thread.sleep(2000);
			Log.info("Selecting Current Date from Date Picker");
		}
		else
		{
			System.out.println("pop up does not displayed");
		}
		

	}
	
	public void settingDuedate() throws InterruptedException
	{
Boolean calpopup = Driver.driver.findElement(By.xpath("//div[@id='dp-popup']")).isDisplayed();
		
		DateFormat discdateFormat = new SimpleDateFormat("dd"); 
		Date discussiondate = new Date();
		String disctoday = discdateFormat.format(discussiondate); 
		//System.out.println(disctoday);
		int tempdisc = Integer.parseInt(disctoday);
		int tempdisc2 = tempdisc+5;
		String DueDate= Integer.toString(tempdisc2);

		Thread.sleep(2000);
		if(calpopup)
		{
			WebElement discussionTodaysDate = Driver.driver.findElement(By.xpath("//a[text()='"+DueDate+"']"));
			discussionTodaysDate.click();
			Thread.sleep(1000);
			Log.info("Selecting Due Date from Date Picker");
		}
		else
		{
			System.out.println("pop up does not displayed");
		}
		

	}
	
	public String currentHour() throws InterruptedException
	{
		// Entering Current Hour & minutes of the Day
		Date date = new Date();
		SimpleDateFormat simpDate = new SimpleDateFormat("hh");
		String Hour =  simpDate.format(date);
		

		//System.out.println(Hour);
		//System.out.println(minute);
		Thread.sleep(2000);

		return Hour;
	}
	
	public String currentMinute()
	{
		Date date = new Date();
		SimpleDateFormat simpDate1= new SimpleDateFormat("mm");
		String minute = simpDate1.format(date);
		
		int i = Integer.parseInt(minute);
		int i1 = i + 1;
		String finMinute = Integer.toString(i1);
		
		return finMinute;
	}

	public void selectSection()
	{
		String SectionToSelect = Constants.sectionName;
		WebElement SectionLink = Driver.driver.findElement(By.xpath("//a[text()='"+SectionToSelect+"']"));
		SectionLink.click();
		Log.info("Clicking on Section");
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		AddAssigmntBtn.click();
		Log.info("Clicking on Add Assignment tab");
		Log.info("Selected Section & clicking on Add Assignment done");
	}
	
	// File attachment Assignment Methods

	public void CreateFileAttchmentAssignment() throws InterruptedException
	{
		FileAtchLnk.click();
		Log.info("Clicking on File Attachment Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		FileAssignmentName.sendKeys(Constants.FileAssignmentName);
		Log.info("Entering File Attachment Assignment Name");

		FileAssignmentDesc.sendKeys(Constants.FileAssignmentDesc);
		Log.info("Entering File Attachment Assignment Description");

		nextAssignBtn.click();
		Log.info("Moving on to Next Page");


		// Selecting Current Date
		startDate.click();
		
		settingStartdate();
		
		// Entering Current Hour & minutes of the Day

		String currentHour = currentHour();
		
		String currentMinute = currentMinute();

		hourField.click();
		Thread.sleep(1000);

		//hourField.clear();
		//Thread.sleep(1000);

		hourField.sendKeys(currentHour);
		Thread.sleep(2000);
		Log.info("Entering Current System Hour in the field");

		minuteField.click();
		Thread.sleep(1000);

		//minuteField.clear();
		//Thread.sleep(1000);

		minuteField.sendKeys(currentMinute);
		Thread.sleep(2000);
		Log.info("Entering Current System Minutre in the field");

		// Selecting AM OR PM

		Select sel = new Select(ampmdropdown);
		sel.selectByVisibleText("pm");
		Log.info("Selecting am or pm ");

		// Clicking Assign Button

		AssignBtn.click();
		Log.info("Clicking on Assign button");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		Log.info("File Attachment Assignment Created Successfully");
	}

	// Discussion Board Assignment Methods

	public void CreateDiscussionBoardAssignment() throws InterruptedException
	{
		discussionAssignmentLnk.click();
		Log.info("Selcted Discussion Board Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		discussionAssignmentName.sendKeys(Constants.discussionAssignmentName);
		Log.info("Entering Discussion Board Assignment Name");

		Driver.driver.switchTo().frame("note_ifr");
		discussionAssignmentDesc.sendKeys(Constants.discussionAssignmenttDesc);
		Log.info("Entering Discussion Board Assignment Description");

		Driver.driver.switchTo().defaultContent();

		makeassignmentavailable.click();
		Log.info("Selecting now radio button");

		// Selecting Due Date for Assignment
		dueDate.click();

		settingDuedate();

		// Selecting Assignment Due Time

		Select duetimesel = new Select(duetimedropdown);
		duetimesel.selectByVisibleText("6:00 pm");
		Log.info("Selecting Assignment Due Time");

		DiscussionNextAssignBtn.click();
		Log.info("Naviagting to Assign Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		DiscussionAssignBtn.click();
		Log.info("Clicking on Assign Button");
		Log.info("Discussion Board Assignment  Created Successfully");
	}

	// Blog Assignment Methods

	public void CreateBlogAssignment() throws InterruptedException
	{
		BlogAssignLnk.click();
		Log.info("Selected Blog Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		BlogAssignmentName.sendKeys(Constants.BlogAssignmentName);
		Log.info("Entering Blog Assignment Name");

		Driver.driver.switchTo().frame("note_ifr");
		BlogAssignmentDesc.sendKeys(Constants.BlogAssignmenttDesc);
		Log.info("Entering Blog Assignment Description");

		Driver.driver.switchTo().defaultContent();

		Blogmakeassignmentavailable.click();
		Log.info("Selecting now radio button");

		// Selecting Due Date for Assignment
		BlogdueDate.click();

		settingDuedate();

		// Selecting Assignment Due Time

		Select Blogduetimesel = new Select(Blogduetimedropdown);
		Blogduetimesel.selectByVisibleText("6:00 pm");
		Log.info("Selecting Assignment Due Time");

		BlogNextAssignBtn.click();
		Log.info("Naviagting to Assign Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		BlogAssignBtn.click();
		Log.info("Clicking on Assign Button");
		Log.info("Blog Assignment Created Successfully");
	}

	// DWeb Activity Assignment Methods

	public void CreateWebActivityAssignment() throws InterruptedException
	{
		WebActAssignLnk.click();
		Log.info("Clicking on File Attachment Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		WebActAssignmentName.sendKeys(Constants.WebActAssignmentName);
		Log.info("Enering Web Activity Assignment Name");

		WebActAssignmentDesc.sendKeys(Constants.WebActAssignmenttDesc);
		Log.info("Enering Web Activity Assignment Description");

		webLinkName.clear();
		Log.info("Clearing web Link Name Field for Fresh Entry");

		webLinkName.sendKeys(Constants.WebLinkName);
		Log.info("Enering Web Activity Link Name");

		webLinkURL.clear();
		Log.info("Clearing web Link URL Field for Fresh Entry");

		webLinkURL.sendKeys(Constants.WebLinkURL);
		Log.info("Enering Web Activity Link URL");

		WebActNextAssignBtn.click();
		Log.info("Moving on to Next Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		WebActstartDate.click();
		Log.info("Clicking on startDate Field");

		settingStartdate();
		
		// Entering Current Hour & minutes of the Day

		String WebActHour = currentHour();
		
		String WebActMinute = currentMinute();

		WebActstarthourField.click();
		Thread.sleep(1000);

		//WebActstarthourField.clear();
		//Thread.sleep(1000);

		WebActstarthourField.sendKeys(WebActHour);
		Thread.sleep(2000);
		Log.info("Entering Current System Hour in the field");

		WebActstartminField.click();
		Thread.sleep(1000);

		//WebActstartminField.clear();
		//Thread.sleep(1000);

		WebActstartminField.sendKeys(WebActMinute);
		Thread.sleep(2000);
		Log.info("Entering Current System Minutre in the field");

		// Selecting AM OR PM

		Select WebActsel = new Select(webActstartampmdropdown);
		WebActsel.selectByVisibleText("pm");
		Log.info("Selecting am or pm ");

		Thread.sleep(2000);

		WebActAssignBtn.click();
		Log.info("Clicking on Assign button");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		Log.info("Web Activity Assignment Created Successfully");
	}
}
