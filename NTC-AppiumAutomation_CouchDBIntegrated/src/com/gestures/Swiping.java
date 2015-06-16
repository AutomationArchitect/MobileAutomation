package com.gestures;

import io.appium.java_client.AppiumDriver;


public class Swiping {
	AppiumDriver driver;
	public void setExternalDriver(AppiumDriver driver2) 
	{
		this.driver = driver2;
	}
	
	public void swipe_left() throws Exception
	{
		driver.swipe(440, 440, 120, 930, 1000);
	}

	public void swipe_right() throws Exception
	{
		driver.swipe(929, 440, 120, 440, 1000);
	}
}

