package connect.login;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestions 
{
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement dd = driver.findElement(By.id("sb_ifc0"));
		dd.click();
		dd.sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
//		//List<WebElement> gg = driver.findElements(By.xpath("//div[@class='sbdd_b']/div[@class='sbsb_a']/ul[@role='listbox']"));
//		selectOptionWithText("selenium");
//	
//		
//		  
//		
////		WebElement ff = driver.findElement(By.xpath("//div[@id='sbse3']/div[text()='selenium']"));
////		ff.click();
////		try {
////			Thread.sleep(1000);
////		} catch (InterruptedException e) {
////			e.printStackTrace();
////		}
////		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='sbdd_b']"));
////		
////		allOptions.get(0).click();
//		
////		for (int i = 0; i < allOptions.size(); i++) 
////		{
////			String option = allOptions.get(i).getText();
////			System.out.println(option);
////		}
//	}
//	
//	public static void selectOptionWithText(String textToSelect) 
//	{
//		try {
//			WebElement autoOptions = driver.findElement(By.xpath("//div[@class='sbdd_b']/div[@class='sbsb_a']/ul[@role='listbox']"));
//			wait.until(ExpectedConditions.visibilityOf(autoOptions));
//
//			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
//			for(WebElement option : optionsToSelect){
//		        if(option.getText().equals(textToSelect)) {
//		        	System.out.println("Trying to select: "+textToSelect);
//		            option.click();
//		            break;
//		        }
//		    }
//			
//		} catch (NoSuchElementException e) {
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}	
}