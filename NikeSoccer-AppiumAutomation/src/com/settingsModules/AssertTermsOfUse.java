package com.settingsModules;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.LoginAndRegisterModules.NikeSoccer_SignIn;
import com.logging.CouchLogger;
import com.setUp.setUp;

public class AssertTermsOfUse extends setUp{
	
	WebElement findButton;
	WebElement texts;
	@Test
	public void assertTermsOfUse() throws Exception
	{
		
	try 
   	{
   		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
   		Date startDate=new Date();
   		CouchLogger.testData("RunnerClass", this.getClass().getSimpleName(), "TestData");
   		CouchLogger.testData("StartTime", sdf.format(startDate), "TestData");
   			
		NikeSoccer_SignIn nss=new NikeSoccer_SignIn();
		nss.setExternalDriver(driver);
		nss.signIn();
		
		Thread.sleep(5000);
		
		//click on "menu" button
		findButton = driver.findElement(By.id("com.nike.pass.dev.root:id/menu_button"));
		findButton.click();
		System.out.println("Clicked on 'menu' Button");
		CouchLogger.validation("MenuButtonClicked", "Pass", this.getClass().getSimpleName());
		
		Thread.sleep(2000);
		
		//click on "Settings_Gear" button
		findButton = driver.findElement(By.id("com.nike.pass.dev.root:id/settings_gear"));
		findButton.click();
		System.out.println("Clicked on 'Settings_Gear' Button");
		CouchLogger.validation("SettingsGearButtonClicked", "Pass", this.getClass().getSimpleName());
		
		Thread.sleep(2000);
		
		//scroll to "Terms Of Use"
		driver.swipe(929, 1740, 929, 440, 1000);
		CouchLogger.validation("ScrolledToTermsOfUse", "Pass", this.getClass().getSimpleName());
				
		//find 'Terms Of Use' Textview
		findButton = driver.findElement(By.id("com.nike.pass.dev.root:id/settings_fragment_terms_and_conditions_textview"));
		findButton.click();
		System.out.println("Clicked on 'Terms Of Use' Button");
		CouchLogger.validation("TermsOfUseTextViewClicked", "Pass", this.getClass().getSimpleName());
		
		Thread.sleep(10000);
		
		//assert "Terms Of Use" Title
		texts = driver.findElement(By.id("com.nike.pass.dev.root:id/header_title"));
		String assertionText = "Terms of Use";
		Assert.assertEquals(assertionText, texts.getText());
		System.out.println("Assertion Passed - The Text View contains the text 'Terms Of Use'" );
		CouchLogger.validation("TextAssertionCompleted", "Pass", this.getClass().getSimpleName());
		CouchLogger.testData("TextAssertion", assertionText, "TestData");
		
		Date endDate=new Date();
		CouchLogger.testData("EndTime", sdf.format(endDate), "TestData"); 

   		}
	
		catch (Exception e) 
   		{
   			
   			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
   			Date endDate=new Date();
   			CouchLogger.testData("EndTime", sdf.format(endDate), "TestData");
   			
   			e.printStackTrace();
   			CouchLogger.error("Exception", e, this.getClass().getSimpleName());
   		}
   		catch(Throwable t)
   		{	
   			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
   			Date endDate=new Date();
   			CouchLogger.testData("EndTime", sdf.format(endDate), "TestData");
   			
   			CouchLogger.error("Error", t, this.getClass().getSimpleName());
   		}
	}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

}
