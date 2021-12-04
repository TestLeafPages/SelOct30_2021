Feature: Login functionality for LeafTaps application

Background:
Given Open the chrome browser
And Load the application url

Scenario Outline: Login using positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: Login using negative credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed