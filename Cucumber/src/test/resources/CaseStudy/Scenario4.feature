Feature: TestMeApp Operations
   Scenario: user moves to cart without adding any product
    Given TestMeApp url "http://10.232.237.143:443/TestMeApp/login.htm"
    When Login as "Lalitha" with "Password123" Search product like "Headphone"
    And Try to proceed to payment without adding to cart
    Then Icon not found
    
