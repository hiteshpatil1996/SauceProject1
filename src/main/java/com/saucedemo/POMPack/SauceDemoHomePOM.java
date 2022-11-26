package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SauceDemoHomePOM 
{
	WebDriver driver;
//	private Select s;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	 WebElement menuButton;
	
	public void menuButtonclick()
	{
		menuButton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	 WebElement Logout;
	
	public void LogoutButtonClicl()
	{
		Logout.click();
	}
	
//	Bag Element
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 WebElement bagProduct;
	
	public void ClickAddtoCartbutton()
	{
		bagProduct.click();
	}
	
//	Add to Cart Element
	
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 WebElement AddtoCartLink;
	
	public String getTextofAddtoCartbutton()
	{
		String actualCount = AddtoCartLink.getText();
		return actualCount;
	}
	
//	All Product Ele
	
	@FindBy(xpath="//button[text()='Add to cart']")
	 List<WebElement>AllProducts;
	
	public void clickAllProducts()
	{
		for(int i=0; i<AllProducts.size(); i++)
		{
			AllProducts.get(i).click();
		}
//		for(WebElement a: AllProducts)
//		{
//			AllProducts.get(0).click();
//			
//		}
	}
	
    public SauceDemoHomePOM(WebDriver driver)
    {
    	this.driver= driver;
    	PageFactory.initElements(driver,this);


}
}



