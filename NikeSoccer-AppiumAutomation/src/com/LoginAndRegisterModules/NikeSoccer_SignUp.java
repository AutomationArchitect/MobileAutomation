package com.LoginAndRegisterModules;
 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.logging.CouchLogger;
import com.setUp.setUp;
 
public class NikeSoccer_SignUp extends setUp{
 
       WebElement findButton;
      
 
       @Test
       public void signUp() throws Exception {
    
    	try 
   		{
   			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
   			Date startDate=new Date();
   			CouchLogger.testData("RunnerClass", this.getClass().getSimpleName(), "TestData");
   			CouchLogger.testData("StartTime", sdf.format(startDate), "TestData");

   			Thread.sleep(10000);
   			//find "JOIN NOW" button
   			findButton = driver.findElement(By.name("Join Now"));
   			findButton.click(); //click on "JOIN NOW" button
   			System.out.println("Clicked on 'JOIN NOW' Button");
   			CouchLogger.validation("JoinNowButtonClicked", "Pass", this.getClass().getSimpleName());
			
   			Thread.sleep(10000);
   			
   			//find all web elements - EditTextBox
   			List <WebElement> element1 = driver.findElements(By.className("android.widget.EditText"));
   			//select "Email" TextBOX
   			findButton = element1.get(0);
   			String email = "abcd2222@nike.com";
   			findButton.sendKeys(email);
   			System.out.println("Data FED into 'EMAIL' TextBOX");
   			CouchLogger.validation("DataFedIntoEmail", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("DataFedIntoEmail", email, "TestData");
			
   			Thread.sleep(1000); //wait for data to be fed in "Email" TextBOX

   			//select "Password" TextBOX
   			findButton = element1.get(1);
   			String pass = "Nike1234";
   			findButton.sendKeys(pass);
   			System.out.println("Data FED into 'Password' TextBOX");
   			CouchLogger.validation("DataFedIntoPassword", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("DataFedIntoPassword", pass, "TestData");
   			Thread.sleep(1000);        //wait for data to be fed in Password TextBOX  

   			driver.hideKeyboard();
   			
   			
   			
   			driver.tap(1, 810, 1760, 500);    //click on "Next" Button  
   			
   			System.out.println("Clicked on 'NEXT' Button");
   			CouchLogger.validation("NextButtonClicked", "Pass", this.getClass().getSimpleName());
			
   			Thread.sleep(3000);

   			//select "Last Name" TextBOX
   			findButton = element1.get(2);
   			String firstName="MARK";
			findButton.sendKeys(firstName);
			CouchLogger.validation("DataFedIntoFirstName", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("DataFedIntoFirstName", firstName, "TestData");
			
   			System.out.println("Data FED into 'First Name' TextBOX");

   			Thread.sleep(2000);               //wait for data to be fed in First Name TextBOX

   			//select "Last Name" TextBOX
   			findButton = element1.get(3);
   			String lastName="PARKER";
			findButton.sendKeys(lastName); 
			CouchLogger.validation("LastNameFilled", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("LastNameFilled", lastName, "TestData");
   			System.out.println("Data FED into 'Last Name' TextBOX");

   			Thread.sleep(2000);               //wait for data to be fed in Last Name TextBOX

   			driver.hideKeyboard();

   			driver.tap(1, 810, 1760, 500);    //click on "Next" Button  
   			System.out.println("Clicked on 'NEXT' Button");
   			CouchLogger.validation("NextButtonClicked", "Pass", this.getClass().getSimpleName());
			
   			Thread.sleep(3000);

   			List <WebElement> element2 = driver.findElements(By.className("android.widget.Button"));
   			//find "Month" dropdown button
   			findButton = element2.get(0);
   			findButton.click(); //click on "Month" button
   			Thread.sleep(1000);
   			WebElement mnth=driver.findElement(By.xpath("//android.widget.TextView[@text='1']"));
			String month=mnth.getText();
			mnth.click();
			CouchLogger.validation("SelectedMonth", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("SelectedMonth", month, "TestData");
			System.out.println("Selected 'Month'");

   			Thread.sleep(1000);

   			//find "Day" dropdown button
   			findButton = element2.get(1);
   			findButton.click(); //click on "Day" button
   			Thread.sleep(1000);
   			WebElement dy=driver.findElement(By.xpath("//android.widget.TextView[@text='2']"));
			String day=dy.getText();
			dy.click();
			CouchLogger.validation("SelectedDay", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("SelectedDay", day, "TestData");
			System.out.println("Selected 'Day'");

   			Thread.sleep(1000);

   			//find "Year" dropdown button
   			findButton = element2.get(2);
   			findButton.click(); //click on "Year" button
   			Thread.sleep(1000);
   			WebElement yr=driver.findElement(By.xpath("//android.widget.TextView[@text='2005']"));
			String year=yr.getText();
			yr.click();
			CouchLogger.validation("SelectedYear", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("SelectedYear", year, "TestData");
			System.out.println("Selected 'Year'");

   			Thread.sleep(1000);

   			//find "Gender" dropdown button
   			findButton = element2.get(3);
   			findButton.click(); //click on "Gender" button
   			Thread.sleep(1000);
   			WebElement gn=driver.findElement(By.xpath("//android.widget.TextView[@text='Male']"));
			String gen=gn.getText();
			gn.click();
			CouchLogger.validation("SelectedGender", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("SelectedGender", gen, "TestData");
			System.out.println("Selected 'Gender'");

   			Thread.sleep(1000);

   			driver.tap(1, 810, 1760, 500);    //click on "Next" Button  
   			System.out.println("Clicked on 'NEXT' Button");
   			CouchLogger.validation("NextButtonClicked", "Pass", this.getClass().getSimpleName());
			
   			Thread.sleep(3000);

   			//find "Country" dropdown button
   			findButton = element1.get(4);
   			findButton.click(); //click on "Year" button
   			Thread.sleep(1000);
   			WebElement ctry=driver.findElement(By.xpath("//android.widget.TextView[@text='United Kingdom']"));
			String country=ctry.getText();
			ctry.click();
			CouchLogger.validation("CountrySelected", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("CountrySelected", country, "TestData");
			System.out.println("Selected 'Country'");

   			Thread.sleep(3000);

   			//select "ZIPCODE" TextBOX
   			findButton = element1.get(5);
   			String zip="NW3502";
			findButton.sendKeys(zip); //wait for data to be fed in ZIPCODE TextBOX
			CouchLogger.validation("EnteredZipCode", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("EnteredZipCode", zip, "TestData");
			System.out.println("Data FED into 'ZIPCODE' TextBOX");

   			Thread.sleep(1000);

   			driver.hideKeyboard();

   			boolean selectSubscribe=true;
			if(selectSubscribe)
			{
			List <WebElement> element3 = driver.findElements(By.className("android.widget.CheckBox"));
			//find "Subscription" Checkbox button
			findButton = element3.get(0);
			findButton.click(); //click on "Month" button
			CouchLogger.validation("SubscriptionBoxSelection", "Pass", this.getClass().getSimpleName());
			CouchLogger.testData("SubscriptionBoxSelection", selectSubscribe, "TestData");
			System.out.println("Checked/Unchecked Subscription 'Checkbox'");
			
			Thread.sleep(1000);
			
			}

   			Thread.sleep(1000);

   			//find "Submit" button
   			//findButton = element2.get(5);
   			//findButton.click(); //click on "Submit" button
   			//System.out.println("Clicked 'SUBMIT' button");

   			//Thread.sleep(1000);
   			//                  
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