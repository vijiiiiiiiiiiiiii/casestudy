$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/casestudy/cs1.feature");
formatter.feature({
  "name": "Registration Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens testme application on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cs1.user_opens_testme_application_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on SignUp button",
  "keyword": "When "
});
formatter.match({
  "location": "cs1.user_click_on_SignUp_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"cakeworld\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname as \"chan\" and lastname as \"venky\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.user_enters_firstname_as_and_lastname_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"cakeworld25\" and confirmpassword as \"cakeworld25\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.user_enters_password_as_and_confirmpassword_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select gender as \"female\"",
  "keyword": "And "
});
formatter.match({
  "location": "cs1.select_gender_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter mail as \"cs@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.enter_mail_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter mobilenumber as \"9787171852\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.enter_mobilenumber_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter dob as \"25/04/1998\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.enter_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter address as \"Krishnagiri\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.enter_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter securityquestion",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.enter_securityquestion_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter answer as \"Chandu\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.enter_answer_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "cs1.click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify register result as success",
  "keyword": "Then "
});
formatter.match({
  "location": "cs1.verify_register_result_as_success()"
});
formatter.result({
  "status": "passed"
});
});