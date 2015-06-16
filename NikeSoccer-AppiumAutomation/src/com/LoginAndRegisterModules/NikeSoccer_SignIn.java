package com.LoginAndRegisterModules;

import io.appium.java_client.AppiumDriver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.gestures.Swiping;
import com.logging.CouchLogger;
import com.setUp.setUp;

public class NikeSoccer_SignIn extends setUp{

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
		
		Thread.sleep(10000);
		
		//click on "Sign In"
		findButton = driver.findElement(By.name("Sign In"));
		findButton.click();
		System.out.println("Clicked on 'Sign In' Button");
		CouchLogger.validation("SignInButtonClicked", "Pass", this.getClass().getSimpleName());
		
		Thread.sleep(10000);
				
		//find all web elements
		List <WebElement> element = driver.findElements(By.className("android.widget.EditText"));
		//select Email TextBOX
		findButton = element.get(0);
		String email = "nike2222@nike.com";
		findButton.sendKeys(email);//wait for data to be fed in "Email" TextBOX
		System.out.println("Data FED into 'EMAIL' TextBOX");
		CouchLogger.validation("DataFedIntoEmail", "Pass", this.getClass().getSimpleName());
		CouchLogger.testData("DataFedIntoEmail", email, "TestData");
		
		Thread.sleep(5000); 
		
		//select "Password" TextBOX
		findButton = element.get(1);
		String pass = "Nike1234";
		findButton.sendKeys(pass); //wait for data to be fed in Password TextBOX
		System.out.println("Data FED into 'Password' TextBOX");
		CouchLogger.validation("DataFedIntoPassword", "Pass", this.getClass().getSimpleName());
		CouchLogger.testData("DataFedIntoPassword", pass, "TestData");
		
		Thread.sleep(5000);			
		
		driver.hideKeyboard();
		
		//find "SIGN IN" button
		findButton = driver.findElement(By.className("android.widget.Button"));
		findButton.click(); //click on "SIGN IN" button 
		System.out.println("Clicked on 'SIGN IN' Button");
		CouchLogger.validation("ClickedOnSignIn", "Pass", this.getClass().getSimpleName());
						
		Thread.sleep(10000);
		Swiping swipe = new Swiping();
		swipe.setExternalDriver(driver);
		for (int i=0; i<5;i++)
		{
			driver.swipe(929, 440, 120, 440, 1000);
			System.out.println("Swipe No:" +i );
		}
		CouchLogger.validation("Swiped To the End to reach 'Get Started'", "Pass", this.getClass().getSimpleName());
		
		//click on "Get Started" button
		findButton = driver.findElement(By.name("Get Started"));
		findButton.click(); //click on "Get Started" button 
		System.out.println("Clicked on 'Get Started' Button");
		CouchLogger.validation("ClickedOnGetStarted", "Pass", this.getClass().getSimpleName());
						
		Thread.sleep(2000);
	
		System.out.println("Login Successful");
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
