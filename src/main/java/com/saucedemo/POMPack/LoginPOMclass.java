package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass 
{
WebDriver driver;
	
	    @FindBy(xpath="//input[@id='user-name']")
	    WebElement userName;
	
	
		public void senduserName()
		{
			userName.sendKeys("standard_user");
		}
		
		@FindBy(xpath= "//input[@id='password']")
		WebElement Password;
		
		public void sendPassword()
		{
			Password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath="//input[@name='login-button']")
		WebElement Login;
		
		public void Login()
		{
			Login.click();
		}
		
		public LoginPOMclass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
}



