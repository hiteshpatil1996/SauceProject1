package com.saucedemo.TestPack;

import org.testng.annotations.Test;

public class TC_02_LogOutActivityValidatn extends TestBaseClass
{
	@Test
	public void VerifyLogout()
	{
//		Validation
		System.out.println("Apply Validation");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("LogOut TC is Passed");
		}
		else
		{
			System.out.println("LogOut TC is Failed");
		}
	
		
	}

}
