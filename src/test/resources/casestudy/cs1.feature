Feature: Registration Functionality

Scenario: Register with valid data

Given user opens testme application on chrome browser
When user click on SignUp button
Then user enters username as "cakeworld" 
Then user enters firstname as "chan" and lastname as "venky" 
Then user enters password as "cakeworld25" and confirmpassword as "cakeworld25" 
And select gender as "female" 
Then enter mail as "cs@gmail.com" 
Then enter mobilenumber as "9787171852" 
Then enter dob as "25/04/1998"
Then enter address as "Krishnagiri" 
Then enter securityquestion
Then enter answer as "Chandu" 
And click on Register button 
Then verify register result as success