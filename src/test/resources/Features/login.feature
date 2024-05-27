Feature: Login Page Automation of SauceDemo App
Scenario: Check login is successful with valid creds
Given User is on Login page
When User enters valid username and password
And Click on Login page
Then User is navigated to home page 
And Close page
