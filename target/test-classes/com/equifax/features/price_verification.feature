
Feature: A book price verification
 

  @test2
  Scenario Outline: Check price of the first book in the list
   Given User on the home page
   When User enters in Search input box a "<book>" , clicks on the search button and the list of the books appears
	 Then The first item in the listed results has a price <price> and he clicks on it
   And The first book page is open, the price should be <price> and user clicks on Add to Cart button
   And The cart page is open and the price of the book should be <price>
   Then User clicks on proceed to checkout button, new page is open and the price of the book should be <price>
   
    Examples:
		|book	 											|price |
		|qa testing for beginners		|47.49 |
 