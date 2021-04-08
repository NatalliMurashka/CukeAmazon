package com.equifax.step_definitions;

import static org.junit.Assert.assertEquals;

import com.equifax.pages.Book_details;
import com.equifax.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstBookPrice_Step_Defs {
	
	Book_details bookDetls = new Book_details();
	Double bookPrice;
	
	@When("User enters in Search input box a book {string} , clicks on the search button and the list of the books appears")
	public void user_enters_in_Search_input_box_a_book_clicks_on_the_search_button_and_the_list_of_the_books_appears(String bookSearch) {
	    
		bookDetls.searchInputBox.sendKeys(bookSearch);
		bookDetls.searchButton.click();
	}
	
	@When("The first book price is {double}")
	public void the_first_book_price_is(Double price) {
		
		String price1 = bookDetls.priceWhole.getText();
		
		String price2 = bookDetls.priceDecimal.getText().replace("", ".");
	
		String price3 = bookDetls.priceFraction.getText();
		
		bookPrice = Double.parseDouble(price1.concat(price2).concat(price3));
				
		assertEquals(price, bookPrice);  
	}
	
	@Then("User clicks on the first book")
	public void user_clicks_on_the_first_book() {
		
		BrowserUtilities.waitFor(3);
		bookDetls.linkBook.click();
	}

	@Then("The new page opens, the price of the book should be the same, and the user clicks on Add to Cart button")
	public void the_new_page_opens_the_price_of_the_book_should_be_the_same_and_the_user_clicks_on_Add_to_Cart_button() {
	    
		Double priceBuyNew = Double.parseDouble(bookDetls.priceBookBuy.getText().substring(1));
		
		assertEquals(bookPrice, priceBuyNew);

		bookDetls.addToCartButton.click();
	}

	@Then("The cart page is open, the price of the book should be same and user clicks on proceed to checkout button")
	public void the_cart_page_is_open_the_price_of_the_book_should_be_same_and_user_clicks_on_proceed_to_checkout_button() {
		
		Double priceSubtotal = Double.parseDouble(bookDetls.priceCartSubtotal.getText().substring(1));
				
		assertEquals(bookPrice, priceSubtotal);
		
		bookDetls.checkoutButton.click();
	}
	
	
	

}
