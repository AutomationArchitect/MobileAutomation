package com.LoginAndRegisterModules;

import io.appium.java_client.AppiumDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.logging.CouchLogger;
import com.setUp.setUp;

public class NTC_SignIn extends setUp{

	WebElement findButton;

	public void setExternalDriver(AppiumDriver driver2) {
		this.driver = driver2;
	}
	
	@Test
	public void signIn() throws Exception {
		 
		try 
		{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date startDate=new Date();
			CouchLogger.testData("RunnerClass", this.getClass().getSimpleName(), "TestData");
			CouchLogger.testData("StartTime", sdf.format(startDate), "TestData");
			
			//click on "Accept"
			findButton = driver.findElement(By.name("Accept"));
			findButton.click();
			System.out.println("Clicked on 'Accept' Button");
			
			CouchLogger.validation("AcceptButtonClicked", "Pass", this.getClass().getSimpleName());
			
			//click on "GET STARTED"
			findButton = driver.findElement(By.name("GET STARTED"));
			findButton.click();
			System.out.println("Clicked on 'GET STARTED' Button");
			
			CouchLogger.validation("GetStartedButtonClicked", "Pass", this.getClass().getSimpleName());
			
			Thread.sleep(10000); //wait for web elements to load
			
			//find all web elements
			List <WebElement> element = driver.findElements(By.className("android.widget.EditText"));
			//select Email TextBOX
			findButton = element.get(0);
			String email = "nike2222@nike.com";
			findButton.sendKeys(email);
			
			CouchLogger.validation("DataFedIntoEmail", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("DataFedIntoEmail", email, "TestData");
			
			System.out.println("Data FED into 'EMAIL' TextBOX");
			Thread.sleep(5000); //wait for data to be fed in "Email" TextBOX
			
			//select "Password" TextBOX
			findButton = element.get(1);
			String pass = "Nike1234";
			findButton.sendKeys(pass); //wait for data to be fed in Password TextBOX
			
			CouchLogger.validation("DataFedIntoPassword", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("DataFedIntoPassword", pass, "TestData");
			
			System.out.println("Data FED into 'Password' TextBOX");
			Thread.sleep(5000);			
			
			driver.hideKeyboard();
			
			//find "SIGN IN" button
			findButton = driver.findElement(By.className("android.widget.Button"));
			findButton.click(); //click on "SIGN IN" button 
			
			CouchLogger.validation("ClickedOnSignIn", "Pass", this.getClass().getSimpleName());
			
			System.out.println("Clicked on 'SIGN IN' Button");
			
			Thread.sleep(15000);
			
			//click on "OKAY, LET'S GO"
			findButton = driver.findElement(By.name("OKAY, LET'S GO"));
			findButton.click();
			
			CouchLogger.validation("ClickedOnOkay", "Pass", this.getClass().getSimpleName());
			
			System.out.println("Clicked on 'OKAY, LET'S GO' Button");
			
			CouchLogger.validation("SignInPassed", "Pass", this.getClass().getSimpleName());
			
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