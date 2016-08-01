package connect.assignmentscreation;

import genericlib.Driver;
import genericlib.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.httpclient.HtmlUnitBrowserCompatCookieSpec;

public class Datechk 
{
	public static void main(String[] args) throws ParseException 
	{
		DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
		Date date2 = new Date();
		String today = dateFormat2.format(date2); 
		System.out.println(today);
		
		
//
//				Date date = new Date();
//			    SimpleDateFormat simpDate = new SimpleDateFormat("hh");
//			    SimpleDateFormat simpDate1= new SimpleDateFormat("mm");
//			    String Hour =  simpDate.format(date);
//			    String minute = simpDate1.format(date);
//			     
//			    int i = Integer.parseInt(minute);
//			     System.out.println(i);
//			     int fin = i + 1;
//			     String s = Integer.toString(fin);
//			    System.out.println("*****"+Hour);
//			    System.out.println("*****"+minute);
//			    System.out.println("*****"+fin);
//			    System.out.println("*****"+s);
//			    
//			    
//			   // *********************************************************** 
//			    
//			    SimpleDateFormat sdfStopTime = new SimpleDateFormat("hh:mm:ss a", Locale.ENGLISH);
//		
//			    System.out.println("Before: " + sdfStopTime.getCalendar().getTime());
//		
//			    sdfStopTime.getCalendar().add(Calendar.MINUTE, 1);
//		
//			    System.out.println("After: " + sdfStopTime.getCalendar().getTime());
//			    
//			    // ************************************
//			    
//			    DateFormat dateFormat = new SimpleDateFormat("mm");
//		        Calendar cal = Calendar.getInstance();
//		        cal.add(Calendar.MINUTE, 1);
//		        System.out.println(dateFormat.format(cal.getTime()));
//		       
//		        
//		        Calendar now = Calendar.getInstance();
//		        int ss= now.get(Calendar.HOUR_OF_DAY);
//		        System.out.println(ss);
//		        
//		        System.out.println("***********************************************************");  
//		        
//		        DateFormat discdateFormat = new SimpleDateFormat("dd"); 
//		    	Date discussiondate = new Date();
//		    	String disctoday = discdateFormat.format(discussiondate); 
//		    	int i2 = Integer.parseInt(disctoday);
//		    	int find = i2+5;
//		    	String DueDate= Integer.toString(find);
//		    	
//		    	System.out.println(disctoday);
//		    	System.out.println(find);
//		    	System.out.println(DueDate);
//
//
//		
//	}
//	public void settingdate() throws InterruptedException
//	{
//		Boolean popup = Driver.driver.findElement(By.xpath("//div[@id='dp-popup']")).isDisplayed();
//		DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
//		Date date2 = new Date();
//		String today = dateFormat2.format(date2); 
//		System.out.println(today);
//		Thread.sleep(2000);
//		if(popup)
//		{
//			WebElement TodaysDate = Driver.driver.findElement(By.xpath("//a[text()='"+today+"']"));
//			TodaysDate.click();
//			Thread.sleep(2000);
//			Log.info("Selecting Current Date from Date Picker");
//		}
//		else
//		{
//			System.out.println("pop up does not displayed");
//		}
//		
//
//	}
//	
//	public String currentHour() throws InterruptedException
//	{
//		// Entering Current Hour & minutes of the Day
//		Date date = new Date();
//		SimpleDateFormat simpDate = new SimpleDateFormat("hh");
//		String Hour =  simpDate.format(date);
//		
//
//		//System.out.println(Hour);
//		//System.out.println(minute);
//		Thread.sleep(2000);
//
//		return Hour;
//	}
//	
//	
//	
//	public String currentMinute()
//	{
//		Date date = new Date();
//		SimpleDateFormat simpDate1= new SimpleDateFormat("mm");
//		String minute = simpDate1.format(date);
//		
//		int i = Integer.parseInt(minute);
//		int i1 = i + 1;
//		String finMinute = Integer.toString(i1);
//		
//		return finMinute;
//	}

}
}
