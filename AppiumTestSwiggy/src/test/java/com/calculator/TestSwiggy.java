package com.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestSwiggy {

//	public static void main(String[] args) throws MalformedURLException 
@Test
	public void TestSwiggyMethod() throws MalformedURLException{
		

        URL URL = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("appPackage", "in.swiggy.android");
		capabilities.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");
		
		AndroidDriver driver=new AndroidDriver(URL,capabilities);
		System.out.println(driver.getSessionId());
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		System.out.println(driver.getSessionId());
		//driver.findElement(By.id("in.swiggy.android:id/btn_get_started")).click();
		//String actRes=driver.findElement(By.id("")).getAttribute("text");
		//int actualresult=Integer.parseInt(actRes);
		//int expRes=;
		//System.out.println("The actual result" +actualresult);

	}

}
