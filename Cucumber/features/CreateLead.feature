Feature: CreateLead functionality in LeafTaps

Background:
Given Open the chrome browser
And Load the application url

Scenario: CreateLead with manadatory informations
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
