package connect.login;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Newcourse 
{	
			
		public static void main(String[] args) throws InterruptedException 
		{		
		
		WebDriver wd = new FirefoxDriver();		
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);     // Implicit wait 60 Sec 	

		wd.manage().deleteAllCookies();  // Clear Firefox cache in Selenium IDE
		
		wd.get("http://connectqastg.mheducation.com/connect/shortUrl.do");
		
		wd.findElement(By.id("userName")).click();
		wd.findElement(By.id("userName")).sendKeys("keshav_ins1@gmail.com");
		
		wd.findElement(By.id("password")).click();
		wd.findElement(By.id("password")).sendKeys("123456");           

		wd.findElement(By.xpath("//input[@value='Sign in']")).click();
		Thread.sleep(1000);    
		
		Thread.sleep(1000); 
		wd.findElement(By.xpath("//a[@id='addCourse']")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='step1']/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='step1']/div[1]/div[1]/input")).clear();
		wd.findElement(By.xpath(".//*[@id='step1']/div[1]/div[1]/input")).clear();
		wd.findElement(By.xpath(".//*[@id='step1']/div[1]/div[1]/input")).sendKeys("Economic", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		wd.findElement(By.xpath(".//*[@id='step1']/div[1]/div[1]/input")).sendKeys("Economic", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
				
		wd.findElement(By.id("searchBox")).click();
		wd.findElement(By.id("searchBox")).clear();
		wd.findElement(By.id("searchBox")).sendKeys("0073273163");
		Thread.sleep(1000);
		wd.findElement(By.id("searchBox")).sendKeys("Economic", Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		wd.findElement(By.id("searchBox")).click();
		Thread.sleep(3500);
		wd.findElement(By.xpath(".//*[@id='bundle-display-container']/div[2]/div/div[2]/div[1]/ul/li[1]/span")).click();
		
		Thread.sleep(1000);
		wd.findElement(By.id("next-button")).click();
		
		wd.findElement(By.id("courseNameValue")).click();
		wd.findElement(By.id("courseNameValue")).clear();
		wd.findElement(By.id("courseNameValue")).sendKeys("Eco-Course01");
		
		wd.findElement(By.id("selectedTimezone")).click();
		wd.findElement(By.xpath(".//*[@id='timezoneList']/li[7]")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.id("sectionName")).click();
		wd.findElement(By.id("sectionName")).clear();
		wd.findElement(By.id("sectionName")).sendKeys("Eco-Course01");
		
		wd.findElement(By.id("create-button")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.xpath(".//*[@id='productBundle']/div[4]/div/a")).click();
		Thread.sleep(1000);
		
		wd.findElement(By.xpath(".//*[@id='continue_section']/a/div")).click();
		Thread.sleep(1000);			
	
		Thread.sleep(1000);
				
	}



}

