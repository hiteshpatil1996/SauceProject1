package com.saucedemo.TestPack;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.SauceDemoHomePOM;

public class TC_03_AllProductActivityValidation extends TestBaseClass
{
	
	@Test
	public void SelectAllProduct()
	{
		SauceDemoHomePOM allProduct = new SauceDemoHomePOM(driver);
		allProduct.clickAllProducts();
		System.out.println("All Product is Selected");
		
//		Validation
		System.out.println("Apply Validation");
		
		String expectedProductCount = "6";
		String actualProductCount= allProduct.getTextofAddtoCartbutton();
		System.out.println("All Product Selected are-->"+ actualProductCount);
		
		if(expectedProductCount.equals(actualProductCount))
		{
			System.out.println("All Products TC is Passed");
		}
		else
		{
			System.out.println("All Product TC is Failed");
		}
		
	}
	}



