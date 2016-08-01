package pageobjectrepolib;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.ExcelUtility;
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
	
	// Group Assignment Repo
	
	@FindBy(xpath="//h2/a[contains(text(),'group')]")
	private WebElement GroupAssignLnk;

	@FindBy(id="assignmentName")
	private WebElement GroupAssignmentName;
	
	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement GroupNextSetPoliciesBtn;
	
	@FindBy(id="points")
	private WebElement GroupAssignmentPoints;
	
	@FindBy(xpath="//input[@id='scheduleDateStart']")
	private WebElement GroupstartDate;
	
	@FindBy(xpath="//input[@class='input clearhrs txtHour' and @pid='startHourMin']")
	private WebElement GroupstarthourField;

	@FindBy(xpath="//input[@class='input clearhrs txtMinute' and @pid='startHourMin']")
	private WebElement GroupstartminField;

	@FindBy(xpath="//select[@name='startampm']")
	private WebElement Groupstartampmdropdown;
	
	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement DefineGroupsBtn;
	
	@FindBy(id="studentsPerGroup")
	private WebElement StudentsPerGroupDropdown;
	
	@FindBy(xpath="//li[text()='add topics']")
	private WebElement addtopicsBtn;
	
	@FindBy(id="0")
	private WebElement topicTextField;
	
	@FindBy(id="saveTopics")
	private WebElement saveTopicsBtn;
	
	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement reviewandassignBtn;
	
	@FindBy(xpath="//a[@class='buttons btbl']")
	private WebElement GroupAssignBtn;
	
	// Speech Assignment Repo
	
	@FindBy(xpath="//h2/a[contains(text(),'speech')]")
	private WebElement SpeechAssignLnk;

	@FindBy(id="assignmentTitle")
	private WebElement SpeechAssignmentName;
	
	@FindBy(xpath="//input[@name='assignmentAvailability' and @value='NOW']")
	private WebElement SpeechmakeassignmentavailableRadio;
	
	@FindBy(id="assess_student_speeches_online")
	private WebElement assessStudentSpeechesOnline;
	
	@FindBy(id="onlineDueDate")
	private WebElement SpeechVideoDueDate;
	
	@FindBy(id="onlineDuetime")
	private WebElement SpeechVideoDueTimeDropdown;
	
	@FindBy(xpath="//div[@class='heading_block clearfix vertical_line']/span/a[@class='ico on_review']")
	private WebElement SpeechStudentSelfReviewBar;
	
	@FindBy(id="note")
	private WebElement SpeechAssignmentDesc;
	
	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement SpeechNextReviewAndAssignBtn;
	
	@FindBy(xpath="//div[@class='clearfix']/span/a")
	private WebElement SpeechAssignBtn;
	 
	// Writing Assignment Repo

	@FindBy(xpath="//a[contains(text(),'writing')]")
	private WebElement WritingAssignLnk;

	@FindBy(id="assignmentTitle")
	private WebElement WritingAssignmentName;

	@FindBy(id="tinymce")
	private WebElement WritingAssignmentDesc;

	@FindBy(id="availablity_now")
	private WebElement Writingmakeassignmentavailable;
		
	//@FindBy(xpath="//select[@class='draftsSelect']")
	//private WebElement WritingdraftsSelectDropDown;
		
	@FindBy(id="dueDate")
	private WebElement WritingdueDate;

	@FindBy(id="duetime")
	private WebElement Writingduetimedropdown;
		
	@FindBy(xpath="//span[contains(text(),'next')]")
	private WebElement WritingNextAssignBtn;

	@FindBy(xpath="//a[@class='buttons btbl assign']")
	private WebElement WritingAssignBtn;
		
	// EZT Assignment Repo

	@FindBy(xpath="//a[contains(text(),'Question')]")
	private WebElement EZTAssignLnk;
		
	@FindBy(xpath="//ul[@id='sourcessection']/li[2]/span[2]/a")
	private WebElement EZTSelectQuestionSourceWindow;
	
	@FindBy(id="title")
	private WebElement EZTAssignmentName;
	
	@FindBy(xpath="//tbody[@id='pool_info']/tr[2]/td[@class='cboxbg']")
	private WebElement EZTSelectInduialQuestion;
	
	@FindBy(xpath="//a[@id='topaddQuestion']")
	private WebElement EZTaddcheckedQuestiondropdown;
	
	@FindBy(xpath="//div[@class='right']/div[@class='qpDropdown']/ul/li/a[contains(text(),'add as individual questions')]")
	private WebElement EZTaddasindividualquestions;
	
	@FindBy(id="create_Cont")
	private WebElement EZTContiuneBtn;
	
	@FindBy(id="scheduleDateEnd")
	private WebElement EZTdueDate;
	
	@FindBy(id="dueHourMin")
	private WebElement EZTdueHourMin;
	
	@FindBy(id="reviewAndAssignBtn")
	private WebElement EZTreviewAndAssignBtn;
	
	@FindBy(id="reviewAssign_Assign")
	private WebElement EZTreviewAssign_AssignBtn;
		
		
	// Common Methods
	
	public String settingStartdate() throws InterruptedException
	{
		Boolean popup = Driver.driver.findElement(By.xpath("//div[@id='dp-popup']")).isDisplayed();
		DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
		Date date2 = new Date();
		String today = dateFormat2.format(date2); 
		//System.out.println(today);
		Thread.sleep(2000);
		
        return today;
	}
	
	public void settingDuedate() throws InterruptedException
	{
Boolean calpopup = Driver.driver.findElement(By.xpath("//div[@id='dp-popup']")).isDisplayed();
		
		DateFormat discdateFormat = new SimpleDateFormat("dd"); 
		Date discussiondate = new Date();
		String disctoday = discdateFormat.format(discussiondate); 
		//System.out.println(disctoday);
		int tempdisc = Integer.parseInt(disctoday);
		int tempdisc2 = tempdisc+2;
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
		Thread.sleep(2000);

		return Hour;
	}
	
	public String currentMinute()
	{
		Date date = new Date();
		SimpleDateFormat simpDate1= new SimpleDateFormat("mm");
		String minute = simpDate1.format(date);
		
		int i = Integer.parseInt(minute);
		int i1 = i + 2;
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

	public void CreateFileAttchmentAssignment(String FileAssgnmentName , String FileAssgnmentDesc) throws InterruptedException
	{
	
		FileAtchLnk.click();
		Log.info("Clicking on File Attachment Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		FileAssignmentName.sendKeys(FileAssgnmentName);
		Log.info("Entering File Attachment Assignment Name");

		FileAssignmentDesc.sendKeys(FileAssgnmentDesc);
		Log.info("Entering File Attachment Assignment Description");

		nextAssignBtn.click();
		Log.info("Moving on to Next Page");
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");


		// Selecting Current Date
		startDate.click();
		String TodaysDate = settingStartdate();
		Log.info("Entering Current System date in the field");
		startDate.sendKeys(TodaysDate);
		
		// Entering Current Hour & minutes of the Day

		String currentHour = currentHour();
		
		String currentMinute = currentMinute();

		hourField.click();
		Thread.sleep(1000);

		//hourField.clear();
		//Thread.sleep(1000);

		hourField.sendKeys(currentHour);
		Thread.sleep(1000);
		Log.info("Entering Current System Hour in the field");

		minuteField.click();
		Thread.sleep(1000);

		//minuteField.clear();
		//Thread.sleep(1000);

		minuteField.sendKeys(currentMinute);
		Thread.sleep(3000);
		Log.info("Entering Current System Minutre in the field");

		// Selecting AM OR PM

		Select sel = new Select(ampmdropdown);
		sel.selectByVisibleText("pm");
		Log.info("Selecting am or pm ");

		// Clicking Assign Button
		Thread.sleep(3000);
		AssignBtn.click();
		Log.info("Clicking on Assign button");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		Log.info("File Attachment Assignment Created Successfully");
	}

	// Discussion Board Assignment Methods

	public void CreateDiscussionBoardAssignment(String DiscAssinName , String DiscAssgnDesc) throws InterruptedException
	{
		discussionAssignmentLnk.click();
		Log.info("Selcted Discussion Board Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		discussionAssignmentName.sendKeys(DiscAssinName);
		Log.info("Entering Discussion Board Assignment Name");

		Driver.driver.switchTo().frame("note_ifr");
		discussionAssignmentDesc.sendKeys(DiscAssgnDesc);
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
		Log.info("Naviagating to Assign Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		DiscussionAssignBtn.click();
		Log.info("Clicking on Assign Button");
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		Log.info("Discussion Board Assignment  Created Successfully");
	}

	// Blog Assignment Methods

	public void CreateBlogAssignment(String BlogAssinName , String BlogAssgnDesc) throws InterruptedException
	{
		BlogAssignLnk.click();
		Log.info("Selected Blog Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		BlogAssignmentName.sendKeys(BlogAssinName);
		Log.info("Entering Blog Assignment Name");

		Driver.driver.switchTo().frame("note_ifr");
		BlogAssignmentDesc.sendKeys(BlogAssgnDesc);
		Log.info("Entering Blog Assignment Description");

		Driver.driver.switchTo().defaultContent();

		Blogmakeassignmentavailable.click();
		Log.info("Selecting now radio button");

		// Selecting Due Date for Assignment
		BlogdueDate.click();

		settingDuedate();
		Log.info("Selecting Due Date");

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
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		Log.info("Blog Assignment Created Successfully");
	}

	// Web Activity Assignment Methods

	public void CreateWebActivityAssignment(String WebActivityAssinName , String WebActivityAssgnDesc,String WebActAssnLinkName, String WebActAssnLinkURL) throws InterruptedException
	{
		WebActAssignLnk.click();
		Log.info("Clicking on Web Activity Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		WebActAssignmentName.sendKeys(WebActivityAssinName);
		Log.info("Enering Web Activity Assignment Name");

		WebActAssignmentDesc.sendKeys(WebActivityAssgnDesc);
		Log.info("Enering Web Activity Assignment Description");

		webLinkName.clear();
		Log.info("Clearing web Link Name Field for Fresh Entry");

		webLinkName.sendKeys(WebActAssnLinkName);
		Log.info("Enering Web Activity Link Name");

		webLinkURL.clear();
		Log.info("Clearing web Link URL Field for Fresh Entry");

		webLinkURL.sendKeys(WebActAssnLinkURL);
		Log.info("Enering Web Activity Link URL");

		WebActNextAssignBtn.click();
		Log.info("Moving on to Next Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		WebActstartDate.click();
		Log.info("Clicking on startDate Field");


		// Selecting Current Date
		WebActstartDate.click();
		String TodaysDate = settingStartdate();
		Log.info("Entering Current System Date in the field");
		WebActstartDate.sendKeys(TodaysDate);
		
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
	
	// Group Assignment Methods
	
	public void CreateGroupAssignment(String GroupAssinName ,String GroupAssnPoints, String GroupAssnTopicName) throws InterruptedException
	{
		GroupAssignLnk.click();
		Log.info("Clicking on Group Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		GroupAssignmentName.sendKeys(GroupAssinName);
		Log.info("Enering Group Assignment Name");

		GroupNextSetPoliciesBtn.click();
		Log.info("Moving on to Next Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		GroupAssignmentPoints.clear();
		Log.info("Clearing the Group Assignment Points Field");
		
		GroupAssignmentPoints.sendKeys(GroupAssnPoints);
		Log.info("Entering the Group Assignment Points");

		// Selecting Current Date
		GroupstartDate.click();
		Log.info("Clicking on startDate Field");
		
		String TodaysDate = settingStartdate();
		Log.info("Entering Current System Date in the field");
		GroupstartDate.sendKeys(TodaysDate);
		
		// Entering Current Hour & minutes of the Day

		String GroupHour = currentHour();
		
		String GroupMinute = currentMinute();

		GroupstarthourField.click();
		Thread.sleep(1000);

		//GroupstarthourField.clear();
		//Thread.sleep(1000);

		GroupstarthourField.sendKeys(GroupHour);
		Thread.sleep(1000);
		Log.info("Entering Current System Hour in the field");

		GroupstartminField.click();
		Thread.sleep(1000);

		//GroupstartminField.clear();
		//Thread.sleep(1000);

		GroupstartminField.sendKeys(GroupMinute);
		Thread.sleep(2000);
		Log.info("Entering Current System Minutre in the field");

		// Selecting AM OR PM

		Select Groupsel = new Select(Groupstartampmdropdown);
		Groupsel.selectByVisibleText("pm");
		Log.info("Selecting am or pm ");

		Thread.sleep(2000);

		DefineGroupsBtn.click();
		Log.info("Clicking on Define Groups button");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		Select Groupsel1 = new Select(StudentsPerGroupDropdown);
		Groupsel1.selectByVisibleText("2");
		Log.info("Selecting number of students per group ");
		
		addtopicsBtn.click();
		Log.info("Clicking on add topics Button");
		
		topicTextField.sendKeys(GroupAssnTopicName);
		Log.info("Entering Group Assignment Topic Name");
		
		saveTopicsBtn.click();
		Log.info("Clicking on Add Topics Buttons to Save the Topic Name");
		
		reviewandassignBtn.click();
		Log.info("Clicking on review and assign Button");
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		GroupAssignBtn.click();
		Log.info("Clicking on assign Button");
		Log.info("Group Assignment Created Successfully");
	}
	
	// Speech Assignment Methods
	
	public void CreateSpeechAssignment(String SpeechAssinName , String SpeechAssgnDesc) throws InterruptedException
	{
		SpeechAssignLnk.click();
		Log.info("Clicking on Speech Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		SpeechAssignmentName.sendKeys(SpeechAssinName);
		Log.info("Enering Speech Assignment Name");

		SpeechmakeassignmentavailableRadio.click();
		Log.info("Clcking on 'make assignment available' now radio button");
		
		assessStudentSpeechesOnline.click();
		Log.info("Clcking on 'assess students speeches' Online radio button");


		// Selecting Current Date
		SpeechVideoDueDate.click();
		Log.info("Clicking on Video Due Date Field");
		
		settingDuedate();
		Log.info("Selecting Vide Due Date");
		
		// Selecting Assignment Due Time

		Select Speechduetimesel = new Select(SpeechVideoDueTimeDropdown);
		Speechduetimesel.selectByVisibleText("06:00 pm");
		Log.info("Selecting Video Due Time");
		
		SpeechStudentSelfReviewBar.click();
		Log.info("Clicking  on student self review bar");
		
		SpeechAssignmentDesc.sendKeys(SpeechAssgnDesc);
		Log.info("Entering Speech Assignment Description");

		SpeechNextReviewAndAssignBtn.click();
		Log.info("Naviagating to Assign Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		SpeechAssignBtn.click();
		Log.info("Clicking on Assign Button");
				
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		Log.info("Speech Assignment Created Successfully");
	}
	
	// Writing Assignment Methods
	
	public void CreateWritingAssignment(String WritingAssinName , String WritingAssgnDesc) throws InterruptedException
	{
		WritingAssignLnk.click();
		Log.info("Selcted Writing Assignment Link");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		WritingAssignmentName.sendKeys(WritingAssinName);
		Log.info("Entering Writing Assignment Name");

		Driver.driver.switchTo().frame("note_ifr");
		WritingAssignmentDesc.sendKeys(WritingAssgnDesc);
		Log.info("Entering Writing Assignment Description");

		Driver.driver.switchTo().defaultContent();

		Writingmakeassignmentavailable.click();
		Log.info("Selecting now radio button");

		// Selecting Due Date for Assignment
		WritingdueDate.click();

		settingDuedate();
		Log.info("Selecting Writing Assignment Due Date");

		// Selecting Assignment Due Time

		Select Writingduetimesel = new Select(Writingduetimedropdown);
		Writingduetimesel.selectByVisibleText("6:00 pm");
		Log.info("Selecting Assignment Due Time");

		WritingNextAssignBtn.click();
		Log.info("Naviagating to Assign Page");

		waitForpageToLoad();
		Log.info("Waiting For Page To Load");

		WritingAssignBtn.click();
		Log.info("Clicking on Assign Button");
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		Log.info("Writing Assignment Created Successfully");
	}
	
	// EZT Assignment Methods
	public void CreateEZTAssignment(String EZTAssnName) throws InterruptedException
	{
		EZTAssignLnk.click();
		Log.info("Selcted EZT Assignment Link");
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		EZTSelectQuestionSourceWindow.click();
		Log.info("Selecting Question Source");
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		EZTSelectInduialQuestion.click();
		Log.info("Selecting Induial Question from the available list");
		
		Thread.sleep(2000);
		
		EZTaddcheckedQuestiondropdown.click();
		Log.info("Clickng on add as induial question option");
		
		Thread.sleep(2000);
		
		EZTaddasindividualquestions.click();
		Log.info("adding question to the assignment");
		
		Thread.sleep(2000);
		
		waitForpageToLoad();
		Log.info("Waiting For Page To Load");
		
		EZTAssignmentName.sendKeys(EZTAssnName);
		Log.info("Entering EZT Assignment Name");
		
		EZTContiuneBtn.click();
		Log.info("Navigating to Next Page");
		
		// Selecting Due Date for Assignment
		EZTdueDate.click();

		settingDuedate();
		Log.info("Selecting Due Date");
		
		Thread.sleep(2000);
		EZTdueHourMin.clear();
		EZTdueHourMin.sendKeys("06:30p");
		Log.info("Entering Due Time");
		
		EZTreviewAndAssignBtn.click();
		Log.info("Entering on Review & Assign Button");
		
		EZTreviewAssign_AssignBtn.click();
		Log.info("Entering on Assign Button");
		Log.info("EZT Assignment Created Successfully");
		
	}
	
}
