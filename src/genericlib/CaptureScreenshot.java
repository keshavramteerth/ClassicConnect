package genericlib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot 
{
	public static void captureScreenshot(String screenshotName)
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)Driver.driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
			//log.info("Screenshot taken");
		} 
		catch (Exception e)
		{
			System.out.println("Exception while taking screenshot "+e.getMessage());
		}
	}
}
