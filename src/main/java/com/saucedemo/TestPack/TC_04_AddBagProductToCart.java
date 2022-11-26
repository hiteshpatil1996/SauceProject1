package com.saucedemo.TestPack;


import org.testng.annotations.Test;

import com.saucedemo.POMPack.SauceDemoHomePOM;


public class TC_04_AddBagProductToCart extends TestBaseClass
{
	
	@Test
	public void VerifyBagProductAddTocart()
	{
		
		SauceDemoHomePOM bagProduct = new SauceDemoHomePOM(driver);
		bagProduct.ClickAddtoCartbutton();
		System.out.println("Clicked on AddtocartButton-->bagProduct is selected");
		
		
        System.out.println("Apply Validation");
		
		String expectedProductCount = "1";
		String actualProductCount = bagProduct.getTextofAddtoCartbutton();
		if(expectedProductCount.equals(actualProductCount))
		{
			System.out.println("Bag Product TC is passed");
		}
		else
		{
			System.out.println("TC is Failed");
		}

	}

}
