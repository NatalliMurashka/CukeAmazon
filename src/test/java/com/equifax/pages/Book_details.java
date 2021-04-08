package com.equifax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.equifax.utilities.Driver;

public class Book_details {
	
	public Book_details () {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement searchInputBox;
	
	@FindBy (id = "nav-search-submit-button")
	public WebElement searchButton;
	
	@FindBy (xpath = "//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole'][1]")
	public WebElement priceWhole;
	
	@FindBy (xpath = "//span[@class='a-price-decimal'][1]")
	public WebElement priceDecimal;
	
	@FindBy (xpath = "//span[@class='a-price-fraction'][1]")
	public WebElement priceFraction;
	
	@FindBy (xpath = "//a[@class='a-link-normal a-text-normal']/span[.='Unit Testing Principles, Practices, and Patterns: Effective testing styles, patterns, and reliable automation for unit testing, mocking, and integration testing with examples in C#'][1][1]")
	public WebElement linkBook;
	
	@FindBy (id = "newBuyBoxPrice")
	public WebElement priceBookBuy;
	
	@FindBy (id = "add-to-cart-button")
	public WebElement addToCartButton;
	
	
	@FindBy (xpath = "//span[@class='a-color-price hlb-price a-inline-block a-text-bold'][1]")
	public WebElement priceCartSubtotal;
	
	@FindBy (id = "hlb-ptc-btn-native")
	public WebElement checkoutButton;
	
	
	
	
	
	
	

}
