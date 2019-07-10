Feature: TestMeApp Process
Scenario: PayMent Details
    Given URL for login "http://10.232.237.143:443/TestMeApp/login.htm"
    When user name for login "Lalitha"
    And password for login "Password123"
    And login and search for product "Headphone"
    And Add to cart
    And then proceed for payment with Andhra Bank credential 123456 "Pass@456" "Trans@456" 
    Then finish payment and exit 
    

