package com.saucedemo.TestPack;

import org.testng.annotations.Test;

public class TC_01_LoginActivityValidation extends TestBaseClass
{
	@Test
	public void VerifyLoginActivity()
	{
		System.out.println("Apply Validation");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("TC is Passed");
		}
		else
		{
			System.out.println("TC is Failed");
		}
		
	}
	

}
