$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/equifax/features/api_GET_DELETE.feature");
formatter.feature({
  "name": "Veryfication API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Viryfication GET2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User sends GET request to /employee/id endpoint with an id 1",
  "keyword": "Given "
});
formatter.match({
  "location": "com.equifax.step_definitions.API_employees_details.user_sends_GET_request_to_employee_id_endpoint_with_an_id(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The id should be 1, the employee name should be \"Tiger Nixon\" and employee salary should be 320800",
  "keyword": "Then "
});
formatter.match({
  "location": "com.equifax.step_definitions.API_employees_details.the_id_should_be_the_employee_name_should_be_and_employee_salary_should_be(java.lang.Integer,java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Viryfication DELETE2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User sends DELETE request to /delete/id endpoint",
  "keyword": "Given "
});
formatter.match({
  "location": "com.equifax.step_definitions.API_employees_details.user_sends_DELETE_request_to_delete_id_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The message \"Successfully! Record has been deleted\" should be returned",
  "keyword": "Then "
});
formatter.match({
  "location": "com.equifax.step_definitions.API_employees_details.the_message_should_be_returned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});