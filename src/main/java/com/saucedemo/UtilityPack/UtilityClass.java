package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void getscreenshots(WebDriver driver, String Name) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile =  ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File ("C:\\Users\\\\Hp\\Downloads\\Automation\\ScreenShot\\HiteshSS\\"+Name+".jpg");
		FileHandler.copy(sourcefile, destfile);
		
	}

}
