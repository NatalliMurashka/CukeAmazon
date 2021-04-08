package com.equifax.step_definitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class API_employees_details {
	
	static {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	}
	Response response;
	JsonPath jp;

	
	@Given("User sends GET request to \\/employees endpoint")
	public void user_sends_GET_request_to_employees_endpoint() {
		
		response = given().log().all().
		   		when().get("/employees");
	}

	@Then("The status code should be {int}")
	public void the_status_code_should_be(Integer statusCode) {
		response.then().
				assertThat().
					statusCode(statusCode).extract().response();
	}
	
	@Given("User sends DELETE request to \\/delete\\/id endpoint")
	public void user_sends_DELETE_request_to_delete_id_endpoint() {
		
		response = given().log().all().
					when().delete("/delete/2");
	}
	
	@Given("User sends GET request to \\/employee\\/id endpoint with an id {int}")
	public void user_sends_GET_request_to_employee_id_endpoint_with_an_id(Integer id) {
		
		response = given().log().all().
					when().get("/employee/" + id); 
	}

	@Then("The id should be {int}, the employee name should be {string} and employee salary should be {int}")
	public void the_id_should_be_the_employee_name_should_be_and_employee_salary_should_be(Integer id, String name, Integer salary) {
		
	    jp = response.then().log().all().
	    		assertThat().
					statusCode(200).extract().response().jsonPath();
		
		Integer empID = jp.get("data.id");
		assertEquals(id, empID);
		
		String empName = jp.get("data.employee_name");
		assertEquals(name, empName);
		
		Integer empSalary = jp.get("data.employee_salary");
		assertEquals(salary, empSalary);
		
	}

	@Then("The message {string} should be returned")
	public void the_message_should_be_returned(String message) {
		
		jp = response.then().
				assertThat().
					statusCode(200).extract().response().jsonPath();
		
		String delMessage = jp.getString("message");
		assertEquals(message, delMessage);
	}
	


}
