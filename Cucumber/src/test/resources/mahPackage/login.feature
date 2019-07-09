Feature: login feature for demosite
Scenario: Valid login
Given url of demosite "http://demowebshop.tricentis.com/login"
When user enters "askmail@email.com" as username
And user enters "abc123" as password
Then user is in webshop