package pageobjectrepolib;

import java.awt.AWTException;
import java.awt.Robot;
import genericlib.Log;
import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PaamLoginPage extends WebdriverCommonlib 
{
	
	
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signinBtn;
	
	@FindBy(xpath="//a[contains(text(),'Terms')]")
	private WebElement TermsofUselnk;
	
	@FindBy(xpath="//a[contains(text(),'Privacy')]")
	private WebElement PrivacyLnk;
	
	@FindBy(xpath="//button[contains(text(),'SIGN IN')]")
	private WebElement SignInBtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot')]")
	private WebElement forgtpswdLnk;
	
	@FindBy(xpath="//a[@class='footer-Link']")
	private WebElement needhelpLnk;
	
	public void commonMtd1()
	{
		Driver.driver.get(Constants.c15url);
		Log.info("Loaded URL into browser");
		
		Driver.driver.manage().window().maximize();
		Log.info("Maximising browser window");
		
		waitForpageToLoad();
		Log.info("Waiting for page to laod");
		
		
		Driver.driver.switchTo().frame(0);
	}
	public void commonmtd() throws AWTException, InterruptedException
	{
		Driver.driver.get(Constants.c15url);
		System.out.println("Loaded URL into browser");
		Driver.driver.manage().window().maximize();
		System.out.println("Maximising browser window");
		System.out.println("Waiting for page to laod");
		
		waitForpageToLoad();
		Log.info("Waiting for page to laod");
		
		Driver.driver.switchTo().frame(0);
		System.out.println("switched to frame 0");
		userNameEdt.click();
		System.out.println("clicking on username edit field");
		Thread.sleep(2000);
		
		userNameEdt.sendKeys(Keys.TAB);
		System.out.println("Tabbing from userNameEdt filed");
		Thread.sleep(2000);
		
		passwordEdt.sendKeys(Keys.TAB);
		System.out.println("Tabbing from passwordEdt filed");
		Thread.sleep(2000);
		
		TermsofUselnk.sendKeys(Keys.TAB);
		System.out.println("Tabbing from TermsofUselnk link");
		Thread.sleep(2000);
		
		PrivacyLnk.sendKeys(Keys.TAB);
		System.out.println("Tabbing from PrivacyLnk link");
		Thread.sleep(2000);
		
		SignInBtn.sendKeys(Keys.TAB);
		System.out.println("Tabbing from SignInBtn  button");
		Thread.sleep(2000);
		
		forgtpswdLnk.sendKeys(Keys.TAB);
		System.out.println("Tabbing from forgtpswdLnk link");
		Thread.sleep(2000);
		
		needhelpLnk.sendKeys(Keys.TAB);
		System.out.println("Tabbing from needhelpLnk link");
		Thread.sleep(2000);
		
		//String press = Keys.chord(Keys.SHIFT,Keys.ENTER);
		needhelpLnk.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		Thread.sleep(2000);
		
		forgtpswdLnk.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		Thread.sleep(2000);
		
		SignInBtn.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		Thread.sleep(2000);
		
		PrivacyLnk.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		Thread.sleep(2000);
		
		TermsofUselnk.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		Thread.sleep(2000);
		
		passwordEdt.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
		Thread.sleep(2000);
		
	}
	public void logintoc15(String userName,String password) throws AWTException, InterruptedException
	{
		commonMtd1();
		
		userNameEdt.sendKeys(userName);
		Log.info("Entering UserName");
		
		passwordEdt.sendKeys(password);
		Log.info("Entering Password");
		
		signinBtn.click();
		Log.info("Clicking on Signin Button");
		
		Thread.sleep(3000);
		waitForpageToLoad();
		Log.info("Waiting for page to laod");
	}
}
