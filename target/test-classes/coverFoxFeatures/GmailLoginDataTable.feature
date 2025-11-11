Feature: Study data table in BDD
Scenario: TC01: Test Gmail Login
Given I am on login page
When I provide details and click on login button

| userName | password | msg |
| testuser123 | user@123 | vctc |
| user12 | user@12 | welcome |
Then I should navigate to inbox 
