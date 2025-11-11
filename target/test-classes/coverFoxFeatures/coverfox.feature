Feature: Coverfox Health Insurance Plans

Scenario: TC01: Validate Health Insurance Plan for single person
Given I am on home page
When I click on get started button
And I click on next button
And I provide age into the age dropdown as "25" and i click on next button 
And I enter pincode as "414003", mobileNumber as "8888888888" and i click on continue button
Then Matching Health Insurance Plans should be displayed as "48"


Scenario: TC02: Validate CoverFox Address Details Page
Given I am on home page
When I click on get started button
And I click on next button
And I provide age into the age dropdown as "25" and i click on next button
And I click on continue button
Then Validate error message

