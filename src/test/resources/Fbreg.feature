@Feature2
Feature: To creat the Fb account 

Background:
Given To launch the browser and maximum 

@Somke
Scenario: To creat a new account 

When To launch the Fb url in browser 
And To click the Sign up for Facebook button 
And To pass the fristname in fristname box
|Selenium|python|java|sql|
And To pass the second name in secondname box 
And To pass the email in email or phoneno box
|praveen|deepi|kavi|dhaya|
|kumar.com|12345|32145|9999999|
|praveen.s|ragu.com|veera.com|pandi.com|
And To pass the password in Password box 
Then user close the browser

@Sanity
Scenario Outline: user create a new account in fb 
When user launch the url
And User click the sign in button

