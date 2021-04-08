
Feature: A book price verification
 

  @test
  Scenario Outline: Verification
     Given User on the home page
     When User enters in Search input box a book "<book>" , clicks on the search button and the list of the books appears
     And The first book price is <price>
     Then User clicks on the first book
     And The new page opens, the price of the book should be the same, and the user clicks on Add to Cart button
     And The cart page is open, the price of the book should be same and user clicks on proceed to checkout button
  
  Examples:
		|book	 											|price |
		|qa testing for beginners		|47.49 |
   

 
