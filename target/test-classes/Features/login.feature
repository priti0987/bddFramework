Feature: Login Page Automation of SauceDemo App
Scenario Outline: Check login is successful with valid creds
Given User is on Login page
When User enters valid <"username"> and <"password">
And Click on Login page
Then User is navigated to home page 
And Close page

Examples:
|username|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
