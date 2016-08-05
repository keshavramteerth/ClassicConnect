package pageobjectrepolib;

import genericlib.Driver;
import genericlib.ExcelUtility;
import genericlib.Log;
import genericlib.WebdriverCommonlib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends WebdriverCommonlib
{
	// Classic Section Registration Page Repo
	
	@FindBy(xpath="//a[@title='Register Now']")
	private WebElement registerNowBtn;
	
	@FindBy(id="emailAddID")
	private WebElement EmailAddressField;
	
	@FindBy(xpath="//div[@class='actionsForward']/button[@class='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//input[@title='Courtesy Access']")
	private WebElement registrationoption;
	
	@FindBy(xpath="//input[@id='selectImg54341' and @class='newSelect']")
	private WebElement offer;
	
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
	
	// C15 Section Registration Page Repo
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement Email;
	
	@FindBy(xpath="//button[contains(text(),'BEGIN')]")
	private WebElement BeginBtn;
	
	@FindBy(id="confirmEmailAddress")
	private WebElement confirmEmailAddressTextField;
	
	@FindBy(id="passwd")
	private WebElement passwdTextField;
	
	@FindBy(id="confirmPasswd")
	private WebElement confirmPasswdTextField;
	
	@FindBy(id="firstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="lastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="securityQuestion")
	private WebElement securityQuestionDropDown;
	
	@FindBy(id="securityAnswer")
	private WebElement securityAnswerTextField;
	
	@FindBy(id="terms")
	private WebElement termsCheckBox;
	
	@FindBy(id="ca-submit-btn")
	private WebElement NextStepBtn;
	
	@FindBy(xpath="//a[contains(text(),'courtesy access')]")
	private WebElement courtesyAccessLnk;
	
	@FindBy(id="place_order_btn")
	private WebElement ConfirmRegistrationBtn;
	
	@FindBy(xpath="//button[@class='button success large-text font-soft-semibold pointer']")
	private WebElement GoToConnectBtn;
	
	//Common Method
	
	public void commonmtd() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		ExcelUtility elib = new ExcelUtility();
		// Get Test Data
		
		String registrationURL = elib.getExcelData("RegistrationURL", 0, 1);
				
				
		Driver.driver.get(registrationURL);
		Log.info("Fetching Registration URL");
		Driver.driver.manage().window().maximize();
		Log.info("Maximising the window");
		waitForpageToLoad();
		Log.info("waiting For page To Load");
	}
	
	// Classic Section Student registration Method
	
   public void registerstudent(String id,String pwd,String firstname, String lastname) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
   {
	   commonmtd();
	   
	   registerNowBtn.click();
	   Log.info("Clicking on Register Now Button");
	   
	   EmailAddressField.sendKeys(id);
	   Log.info("Entering email id");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   submitBtn.click();
	   Log.info("Clicking on submit button");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   registrationoption.click();
	   Log.info("Clicking on registration option");

	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   offer.click();
	   Log.info("Clciking on package from available offer");
	   
	   continueBtn.click();
	   Log.info("Clicking on continue button");
	   
	   cnfrmemailaddress.sendKeys(id);
	   Log.info("Entering confirm email address");
	   
	   passwd.sendKeys(pwd);
	   Log.info("Entering Password");
	   
	   confirmPasswd.sendKeys(pwd);
	   Log.info("Entering Confirm Password");
	   
	   firstName.sendKeys(firstname);
	   Log.info("Entering First Name");
	   
	   lastName.sendKeys(lastname);
	   Log.info("Entering Last Name");
	   
	   Select sel = new Select(question);
	   sel.selectByVisibleText("What is your mother's maiden name?");
	   Log.info("Selecting security question");
	   Thread.sleep(500);
	   
	   answer.sendKeys("bgl");
	   Log.info("Entering Security Answer");
	   
	   terms.click();
	   Log.info("Clicking on Terms checkbox");
	   
	   accountRegister.click();
	   Log.info("Clicking on Register Button");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   gotomycourse.click();
	   Log.info("Clicking on Go To My Course Button");
	  
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   Log.info("Student Created Successfully");
   }
   
    // C15 Section Student registration Method
   
   public void registerC15student(String StudentId,String password,String firstName, String lastName) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	   commonmtd();
	   
	   Email.sendKeys(StudentId);
	   Log.info("Entering Email Address");
	   
	   BeginBtn.click();
	   Log.info("Clicking on BEGIN button");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   confirmEmailAddressTextField.sendKeys(StudentId);
	   Log.info("Entering Confirm Email Address");
	   
	   passwdTextField.sendKeys(password);
	   Log.info("Entering Password");
	   
	   confirmPasswdTextField.sendKeys(password);
	   Log.info("Entering Confirm Password");
	   
	   firstNameTextField.sendKeys(firstName);
	   Log.info("Entering First Name of Student");
	   
	   lastNameTextField.sendKeys(lastName);
	   Log.info("Entering Last Name of Student");
	   
	   Select sel1 = new Select(securityQuestionDropDown);
	   sel1.selectByVisibleText("What is your mother's maiden name?");
	   Log.info("Selecting security question");
	   Thread.sleep(500);
	   
	   securityAnswerTextField.sendKeys("bgl");
	   Log.info("Entering Security Answer");
	   
	   termsCheckBox.click();
	   Log.info("Clicking on I Agree checkbox");
	   
	   NextStepBtn.click();
	   Log.info("Navigating to Registration Options Page");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   courtesyAccessLnk.click();
	   Log.info("Selecting Courtesy Access Option Link");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   ConfirmRegistrationBtn.click();
	   Log.info("Confirming Registration");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   
	   GoToConnectBtn.click();
	   Log.info("Clicking on Go To Connect Button -- Navigation Student to Do Page");
	   
	   waitForpageToLoad();
	   Log.info("waiting For page To Load");
	   Log.info("Student Registered to C15 Section Sucessfully");
   }
}
