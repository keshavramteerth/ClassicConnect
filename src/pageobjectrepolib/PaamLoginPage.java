package pageobjectrepolib;

import java.awt.AWTException;
import java.awt.Robot;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;

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
	
	public void commonmtd() throws AWTException, InterruptedException
	{
		Driver.driver.get(Constants.c15url);
		Driver.driver.manage().window().maximize();
		
		waitForpageToLoad();
		Driver.driver.switchTo().frame(0);
		userNameEdt.click();
		Thread.sleep(2000);
		
		userNameEdt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		passwordEdt.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		TermsofUselnk.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		PrivacyLnk.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		SignInBtn.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		forgtpswdLnk.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		needhelpLnk.sendKeys(Keys.TAB);
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
		commonmtd();
		
		userNameEdt.sendKeys(userName);
		
		passwordEdt.sendKeys(password);
		signinBtn.click();
	}
}
