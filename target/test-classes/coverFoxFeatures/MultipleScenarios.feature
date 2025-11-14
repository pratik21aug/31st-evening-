Feature: Coverfox Health Insurance Plans
Background:
Given I am on home page


@login
Scenario: TC01: Validate Health Insurance Plan for single person

When I click on get started button
And I click on next button
And I provide age into the age dropdown as "25" and i click on next button 
And I enter pincode as "414003", mobileNumber as "8888888888" and i click on continue button
Then i got matching Health Insurance Plans

@createAccount
Scenario: TC02: Validate Coverfox Car Insurance 

When I click on car insurance button
And I provide RTO number and click on view quotes button
And I provide details, valid mobile number and click on view quotes button
Then I got car insurance details


Scenario: TC03: Validate Coverfox Bike Insurance

When I click on bike insurance button
And  I provide RTO number and click on view quotes button
And I provide details, valid mobile number and click on view quotes button
Then I got bike insurance details