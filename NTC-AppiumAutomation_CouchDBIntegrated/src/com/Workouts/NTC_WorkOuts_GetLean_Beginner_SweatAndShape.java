package com.Workouts;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ContextAware;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opera.core.systems.scope.services.WindowManager;

public class NTC_WorkOuts_GetLean_Beginner_SweatAndShape {

	WebElement findButton;
	WebDriver driver;
	
	@Test
	public void GetLean_Beginner_SweatAndShape() throws Exception {
		File appDir = new File("D:\\Workspace\\APKs");
		File app = new File(appDir, "com.nike.ntc.apk"); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "nirajbrands");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(CapabilityType.VERSION, "4.4");
		capabilities.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("autoLaunch", true);
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("appPackage", "com.nike.ntc");
		capabilities.setCapability("app", app.getAbsolutePath());
																	
		capabilities.setCapability("appActivity", ".ui.TourAndLoginActivity"); 
		try 
		{
			AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			//click on "Accept"
			findButton = driver.findElement(By.name("Accept"));
			findButton.click();
			System.out.println("Clicked on 'Accept' Button");
			//click on "GET STARTED"
			findButton = driver.findElement(By.name("GET STARTED"));
			findButton.click();
			System.out.println("Clicked on 'GET STARTED' Button");
			
			Thread.sleep(10000); //wait for web elements to load
			
			//find all web elements
			List <WebElement> element = driver.findElements(By.className("android.widget.EditText"));
			//select Email TextBOX
			findButton = element.get(0);
			findButton.sendKeys("nike2222@nike.com");
			
			System.out.println("Data FED into 'EMAIL' TextBOX");
			Thread.sleep(5000); //wait for data to be fed in "Email" TextBOX
			
			//select "Password" TextBOX
			findButton = element.get(1);
			findButton.sendKeys("Nike1234"); //wait for data to be fed in Password TextBOX
			
			System.out.println("Data FED into 'Password' TextBOX");
			Thread.sleep(5000);			
			
			driver.hideKeyboard();
			
			//find "SIGN IN" button
			findButton = driver.findElement(By.className("android.widget.Button"));
			findButton.click(); //click on "SIGN IN" button 
			System.out.println("Clicked on 'SIGN IN' Button");
			
			Thread.sleep(15000);
			
			//click on "OKAY, LET'S GO"
			findButton = driver.findElement(By.name("OKAY, LET'S GO"));
			findButton.click();
			System.out.println("Clicked on 'OKAY, LET'S GO' Button");
			
			Thread.sleep(1000);
			
			//click on "FIND WORKOUTS"
			findButton = driver.findElement(By.name("FIND WORKOUTS"));
			findButton.click();
			System.out.println("Clicked on 'FIND WORKOUTS' Button");
			
			Thread.sleep(2000);
			
			//click on "GET LEAN"
			findButton = driver.findElement(By.name("GET LEAN"));
			findButton.click();
			System.out.println("Clicked on 'GET LEAN' Button");
			
			Thread.sleep(2000);
			
			//click on "BEGINNER"
			findButton = driver.findElement(By.name("BEGINNER"));
			findButton.click();
			System.out.println("Clicked on 'BEGINNER' Button");
			
			Thread.sleep(2000);
			
			//click on "SWEAT + SHAPE"
			findButton = driver.findElement(By.name("SWEAT + SHAPE"));
			findButton.click();
			System.out.println("Clicked on 'SWEAT + SHAPE' Button");
			
			Thread.sleep(2000);
			
			//click on "DOWNLOAD" button to download resource
			findButton = driver.findElement(By.name("DOWNLOAD"));
			findButton.click();
			System.out.println("Clicked on 'DOWNLOAD' Button");
			
			Thread.sleep(2000);
			
			//click on "Download one" button to download Single Resource
			findButton = driver.findElement(By.name("Download one"));
			findButton.click();
			System.out.println("Clicked on 'Download one' Button");
			
			//click to provide action commands "Dumbbells"
			for (int i=0; i<18;i++){	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			findButton = driver.findElement(By.name("Dumbbells"));
			findButton.click();
			}
			//System.out.println("Clicked on 'Dumbbells' Button");
			
			//click on "DO WORKOUT" button to download Single Resource
			findButton = driver.findElement(By.name("DO WORKOUT"));
			findButton.click();
			System.out.println("Clicked on 'DO WORKOUT' Button");
			
			Thread.sleep(2000);
			
			//"PAUSE" workout for a bit 
			findButton = driver.findElement(By.name("PAUSE"));
			findButton.click();
			System.out.println("Clicked on 'PAUSE' Button");
			
			Thread.sleep(2000);
			
			//resume workout 
			findButton = driver.findElement(By.className("android.widget.ImageView"));
			findButton.click();
			System.out.println("Clicked on 'button_resume_workout' Button");
		
			
			//click to provide action commands "SWEAT + SHAPE"
			for (int i=0; i<30;i++){	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				findButton = driver.findElement(By.name("SWEAT + SHAPE"));
				findButton.click();
				}
			
			
//			//click to open tutorial video
//			findButton = driver.findElement(By.id("button_video_play"));
//			findButton.click();
//			System.out.println("Clicked on 'button_video_play' Button");
//			
//			Thread.sleep(30000);
//			
//			//click to resume workout
//			findButton = driver.findElement(By.id("button_resume_workout"));
//			findButton.click();
//			System.out.println("Clicked on 'button_resume_workout' Button");
//			
//			Thread.sleep(2000);
			
			
			//click on "END WORKOUT"
			findButton = driver.findElement(By.name("END WORKOUT"));
			findButton.click();
			System.out.println("Clicked on 'END WORKOUT' Button");
			
			Thread.sleep(2000);
			} 
		
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
			
		}
		
		
	}
	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
	
}
