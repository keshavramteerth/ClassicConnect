package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonlib 
{
	public void waitForpageToLoad()
	{
		Driver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void waitForXpathToPresent(String wbXpath)
	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(wbXpath)));
	}

	public void waitForNameToPresent(String wbName)
	{
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(wbName)));
	}



}