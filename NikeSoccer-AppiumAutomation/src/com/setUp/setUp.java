package com.setUp;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class setUp 

{	
	public AppiumDriver driver;
	
	public void setDriver(AppiumDriver driver) {
		this.driver = driver;
	}
	public AppiumDriver getDriver() {
		return driver;
	}
	
	
	@BeforeTest
	public void setup() throws Exception 
	{	
		File appDir = new File("C:\\NikeSoccer-AppiumAutomation\\APKs");
		File app = new File(appDir, "com.nike.pass.root-1.apk"); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Nirajbrands");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(CapabilityType.VERSION, "4.4");
		capabilities.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("autoLaunch", true);
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("appPackage", "com.nike.pass.root");
		capabilities.setCapability("app", app.getAbsolutePath());									
		capabilities.setCapability("appActivity", "com.nike.pass.activity.LandingActivity");
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
}
