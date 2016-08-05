package pageobjectrepolib;

import genericlib.Log;
import genericlib.WebdriverCommonlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignmentsPaam extends WebdriverCommonlib
{
	// Left Hand Panel Main Menu Items & Sub Menu Items
	
	// Hamburger Icon
	
	@FindBy(xpath="//span[@class='icon-menu_hamburger']")
	private WebElement HamburgerIcon;
	
	// Student Name
	
	@FindBy(xpath="//div[@class='menuLabel font-soft-semibold' and @data-ember-action='1206']")
	private WebElement LHPStudentNameLnk;
	
	// Student Name - Messages SubMenu Page 
	
	@FindBy(id="messagesSubMenu")
	private WebElement messagesSubMenu;
	
	@FindBy(xpath="//a[@class='icon-filter-icon filter-icon']")
	private WebElement MessagesFilterOption;
	
	@FindBy(xpath="//div[@class='filter-text']")
	private WebElement MessagesClassFilterExpand;
	
	@FindBy(xpath="//a[@class='icon-close pull-right small-text close-filter-panel']")
	private WebElement MessagesClassFilterCollapse;
	
	// Student Name - Notifications SubMenu Page 
	
	@FindBy(id="notificationsSubMenu")
	private WebElement notificationsSubMenu;
	
	// Student Name - MyAccount SubMenu Page 
	
	@FindBy(id="settingsSubMenu")
	private WebElement MyAccountSubMenu;
	
	@FindBy(xpath="//a[contains(text(),'Account Settings')]")
	private WebElement AccountSettings;
	
	@FindBy(xpath="//a[contains(text(),'Order History')]")
	private WebElement OrderHistory;
	
	@FindBy(xpath="//a[contains(text(),'Digital Purchases')]")
	private WebElement DigitalPurchases;
	
	// Student Name - Help SubMenu Page 
	
	@FindBy(id="helpSubMenu")
	private WebElement helpSubMenu;
	
	// Student Name - Signout SubMenu Page
	
	@FindBy(id="signoutSubMenu")
	private WebElement signoutSubMenu;
	
	// Assignments
	
	@FindBy(xpath="//div[@class='menuLabel font-soft-semibold' and @data-ember-action='1218']")
	private WebElement LHPAssignmentsLnk;
	
	//Assignments - To Do SubMenu Page
	
	@FindBy(id="donowSubMenu")
	private WebElement ToDoSubMenu;
	
	@FindBy(xpath="//a[@class='icon-filter-icon filter-icon']")
	private WebElement ToDoFilterOption;
	
	@FindBy(xpath="//div[@class='filter-text']")
	private WebElement ToDoClassFilterExpand;
	
	@FindBy(xpath="//a[@class='icon-close pull-right small-text close-filter-panel']")
	private WebElement ToDoClassFilterCollapse;
	
	//Assignments - Calendar SubMenu Page
	
	@FindBy(id="calendarSubMenu")
	private WebElement calendarSubMenu;
	
	@FindBy(xpath="//a[@class='icon-filter-icon filter-icon']")
	private WebElement CalendarFilterOption;
	
	@FindBy(xpath="//div[@class='filter-text']")
	private WebElement CalendarClassFilterExpand;
	
	@FindBy(xpath="//a[@class='icon-close pull-right small-text close-filter-panel']")
	private WebElement CalendarClassFilterCollapse;
	
	@FindBy(xpath="//a[@class='ember-view' and @href='#/student/assignments/day']")
	private WebElement CalendarDayView;
	
	@FindBy(xpath="//a[@class='ember-view' and @href='#/student/assignments/week']")
	private WebElement CalendarWeekView;
	
	@FindBy(xpath="//a[@class='ember-view' and @href='#/student/assignments/month']")
	private WebElement CalendarMonthView;
	
	@FindBy(xpath="//a[@class='icon-navigate-forward navigater-button']")
	private WebElement Calendarnavigateforward;
	
	@FindBy(xpath="//a[@class='icon-navigate-back navigater-button']")
	private WebElement Calendarnavigateback;
	
	// Classes
	
	@FindBy(xpath="//div[@class='menuLabel font-soft-semibold' and @data-ember-action='1224']")
	private WebElement LHPClassesLnk;
	
	@FindBy(id="classes_515782847SubMenu")
	private WebElement Class1SubMenu;
	
	// Results
	
	@FindBy(xpath="//div[@class='menuLabel font-soft-semibold' and @data-ember-action='1228']")
	private WebElement LHPResultsLnk;
	
	@FindBy(id="results_515782847SubMenu")
	private WebElement Results1SubMenu;
	
	// Insight
	
	@FindBy(xpath="//div[@class='menuLabel font-soft-semibold' and @data-ember-action='1232']")
	private WebElement LHPInsightLnk;

	// Paam Logout Method
	
	public void logout() throws InterruptedException
	{
		LHPStudentNameLnk.click();
		Log.info("Clicking on LHP StudentName Link");
		
		Thread.sleep(2000);
		
		signoutSubMenu.click();
		Log.info("Clicking on Sign Out Link");
		
		Thread.sleep(2000);
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		Log.info("Signed Out Successfully");
	}
}
