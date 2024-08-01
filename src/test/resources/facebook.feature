@Feature1
Feature: To validate the login funcationlity of facebook application

@Regression
Scenario Outline: user login the facebook positive and negative credentials
Given to launchn the browser and maximize the window 
When user launch the url
And user pass the "<emaildatas>"email field 
And user pass the "<passworddatas>"password field 
And user click the login button
Then user has close the browser 

Examples:
|emaildatas				|passworddatas    |
|praveensp        |123456						|
|8508358610       |12345678 				|		
|sp123  					|8928329239				|
|deepi						|dhaya						|