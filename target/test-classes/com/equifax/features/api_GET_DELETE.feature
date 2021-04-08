
Feature: Verification API
  

 	@api
  Scenario: Verifying status code of Get request to employees endpoint 
    Given User sends GET request to /employees endpoint 
    Then The status code should be 200
    
  @api
  Scenario: Verifying status code of Delete request 
    Given User sends DELETE request to /delete/id endpoint
    Then The status code should be 200
   
	@api
  Scenario: Verifying employee details 
    Given User sends GET request to /employee/id endpoint with an id 1
    Then The id should be 1, the employee name should be "Tiger Nixon" and employee salary should be 320800
    
  @api
  Scenario: Verify success message
    Given User sends DELETE request to /delete/id endpoint
    Then The message "Successfully! Record has been deleted" should be returned
