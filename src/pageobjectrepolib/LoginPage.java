package pageobjectrepolib;

import genericlib.Constants;
import genericlib.Driver;
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
		Driver.driver.manage().window().maximize();
		waitForpageToLoad();
	}
	
	public void logintoapp(String userName , String password , String url) throws InterruptedException
	{
		commonmtd();
		userNameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		signinBtn.click();
		
	}
	
	public void CheckTOUlink(String url)
	{
		commonmtd();
		TOULink.click();
		waitForpageToLoad();
		
	}
	
	public void checkenteremailalert(String url)
	{
		commonmtd();
		signinBtn.click();
		String expAlertmsg = enteremailalert.getText();
		Assert.assertEquals(expAlertmsg, Constants.actemteremailAlertmsg, "User msg is not verfied==FAIL");
	}
	
	public void checkForgotPwdLink()
	{
		commonmtd();
		forgotPasswordLink.click();
		waitForpageToLoad();
		if(forgorpasswordpage.isDisplayed())
		{
			System.out.println("Redirected to Forgot Password Page");
		}
		else
		{
			System.out.println("Not Redirected to Forgot Password Page");
		}
	}
	
	public void checkenterpasswordalert(String userName)
	{
		commonmtd();
		userNameEdt.sendKeys(userName);
		signinBtn.click();
		String expenterpswdAlertmsg = enterpswdalert.getText();
		Assert.assertEquals(expenterpswdAlertmsg, Constants.actenterpaswdalert, "User msg is not verfied==FAIL");
	}
	
	public void clickHelpLink() 
	{
		commonmtd();
        help.click();
	}
}
