package pageobjectrepolib;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.Log;
import genericlib.WebdriverCommonlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends WebdriverCommonlib
{
	
	@FindBy(id="userName")
	private WebElement userNameEdt;
	
	@FindBy(id="password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement signinBtn;
	
	@FindBy(xpath="//a[@href='http://www.mheducation.com/terms-use.html']")
	private WebElement TOULink;
	
	@FindBy(xpath="//p[@id='clientFormError']")
	private WebElement enteremailalert;
	
	@FindBy(xpath="//p[@id='clientFormError']")
	private WebElement enterpswdalert;
	
	@FindBy(xpath="//a[@class='forgot-pw medium-text']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//h2[@class='blockTitle']")
	private WebElement forgorpasswordpage;
	
//	@FindBy(xpath = "//div[@class='signin-form-inner']/a[@class='right link-help medium-text']")
//    private WebElement help;
	
	@FindBy(css="a[class='right link-help medium-text']")
	private WebElement help;
	
	public void commonmtd()
	{
		Driver.driver.get(Constants.url);
		Log.info("Fetching URL from Constants file");
		Driver.driver.manage().window().maximize();
		Log.info("Maximising the browser window");
		waitForpageToLoad();
		Log.info("waiting For page To Load");
	}
	
	public void logintoapp(String userName , String password , String url) throws InterruptedException
	{
		commonmtd();
		
		userNameEdt.sendKeys(userName);
		Log.info("UserName entered");
		
		passwordEdt.sendKeys(password);
		Log.info("password entered");
		
		signinBtn.click();
		Log.info("Signin button clicked");
		
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		Log.info("Logged in successfully");
	}
	
	public void CheckTOUlink(String url)
	{
		commonmtd();
		TOULink.click();
		Log.info("TOU Link clicked");
		waitForpageToLoad();
		Log.info("waiting For page To Load");
		
		
	}
	
	public void checkenteremailalert(String url)
	{
		commonmtd();
		signinBtn.click();
		Log.info("Signin button clicked");
		String expAlertmsg = enteremailalert.getText();
		Log.info("captured alert text message");
		Assert.assertEquals(expAlertmsg, Constants.actemteremailAlertmsg, "User msg is not verfied==FAIL");
		Log.info("verfied actual and exp alert message");
	}
	
	public void checkForgotPwdLink()
	{
		commonmtd();
		forgotPasswordLink.click();
		Log.info("forgot Password Link Clicked");
		waitForpageToLoad();
		if(forgorpasswordpage.isDisplayed())
		{
			Log.info("Redirected to Forgot Password Page");
			System.out.println("Redirected to Forgot Password Page");
		}
		else
		{
			Log.error("Not Redirected to Forgot Password Page");
			System.out.println("Not Redirected to Forgot Password Page");
		}
	}
	
	public void checkenterpasswordalert(String userName)
	{
		commonmtd();
		userNameEdt.sendKeys(userName);
		Log.info("userName entered");
		signinBtn.click();
		Log.info("Signin button clicked");
		String expenterpswdAlertmsg = enterpswdalert.getText();
		Log.info("Fetching enter password alert text message");
		Assert.assertEquals(expenterpswdAlertmsg, Constants.actenterpaswdalert, "User msg is not verfied==FAIL");
	}
	
	public void clickHelpLink() 
	{
		commonmtd();
        help.click();
        Log.info("help Link clicked");
	}
}
