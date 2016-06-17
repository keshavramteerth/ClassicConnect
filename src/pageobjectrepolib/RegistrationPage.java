package pageobjectrepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import genericlib.Constants;
import genericlib.Driver;
import genericlib.WebdriverCommonlib;

public class RegistrationPage extends WebdriverCommonlib
{
	@FindBy(xpath="//a[@title='Register Now']")
	private WebElement registerNowBtn;
	
	@FindBy(id="emailAddID")
	private WebElement EmailAddressField;
	
	@FindBy(xpath="//div[@class='actionsForward']/button[@class='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//input[@title='Courtesy Access']")
	private WebElement registrationoption;
	
	@FindBy(xpath="//input[@class='cssButton']")
	private WebElement continueBtn;
	
	@FindBy(id="confirmEmailAddress")
	private WebElement cnfrmemailaddress;
	
	@FindBy(id="passwd")
	private WebElement passwd;
	
	@FindBy(id="confirmPasswd")
	private WebElement confirmPasswd;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="question")
	private WebElement question;
	
	@FindBy(id="answer")
	private WebElement answer;
	
	@FindBy(id="terms")
	private WebElement terms;
	
	@FindBy(id="accountRegister")
	private WebElement accountRegister;
	
	@FindBy(xpath="//a[@class='btntwo right']/span/b[contains(text(),'go to my course')]")
	private WebElement gotomycourse;

	public void commonmtd()
	{
		Driver.driver.get(Constants.registrationURL);
		Driver.driver.manage().window().maximize();
		waitForpageToLoad();
	}
	
   public void registerstudent(String id,String pwd,String firstname, String lastname) throws InterruptedException
   {
	   commonmtd();
	   registerNowBtn.click();
	   EmailAddressField.sendKeys(id);
	   waitForpageToLoad();
	   submitBtn.click();
	   waitForpageToLoad();
	   registrationoption.click();
	   waitForpageToLoad();
	   continueBtn.click();
	   cnfrmemailaddress.sendKeys(id);
	   passwd.sendKeys(pwd);
	   confirmPasswd.sendKeys(pwd);
	   firstName.sendKeys(firstname);
	   lastName.sendKeys(lastname);
	   
	   Select sel = new Select(question);
	   sel.selectByVisibleText("What is your mother's maiden name?");
	   Thread.sleep(500);
	   answer.sendKeys("bgl");
	   terms.click();
	   accountRegister.click();
	   waitForpageToLoad();
	   gotomycourse.click();
	   waitForpageToLoad();
   }
}
