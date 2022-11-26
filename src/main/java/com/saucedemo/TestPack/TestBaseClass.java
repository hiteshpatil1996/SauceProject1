package com.saucedemo.TestPack;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.LoginPOMclass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setup(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./DriversFiles/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./DriversFiles/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		System.out.println("Open Browser");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Opened");
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");
		
		UtilityClass.getscreenshots(driver,"LoginPage-27Oct");
		
//		Create object of SauceLogIn POM class For Calling LOGIN POM Class
		
		LoginPOMclass slp = new LoginPOMclass(driver);
		slp.senduserName();
		System.out.println("Username is entred");
		
		slp.sendPassword();
		System.out.println("Password is entred");
		
		slp.Login();
		System.out.println("Click on login button");
		
		
		System.out.println("Went On Home Page");
		
		
	  }
	@AfterMethod
	public void Browserclose()
	{
	driver.quit();
	System.out.println("Browser is Closed");
	}


	}


