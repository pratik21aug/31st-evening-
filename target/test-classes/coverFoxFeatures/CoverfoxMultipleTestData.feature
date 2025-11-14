Feature: Multiple data test for coverfox health insurance \
Scenario Outline: TC01: Validate Coverfox Health Insurance Plan for single person with multiple test data
Given I am on home page
When I click on get started button
And I click on next button
And I provide age into the age dropdown as "<age>" and i click on next button
And I enter pincode as "<pincode>", mobileNumber as "<mobNum>" and i click on continue button
Then i got matching Health Insurance Plans

Examples:
| age | pincode | mobNum |
| 25 | 414003 | 8888888888 |
| 30 | 314010 | 7777777777 |
| 20 | 124536 | 1234567890 |
 
