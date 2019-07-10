Feature: I want to use this template for my feature file
     Scenario: Register to Test Me App 
    Given URL of TestMeApp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
   When Enter username "akash069" as uname
    And Enter First Name "Aakash" as fname
   And Enter Last Name "Smith" as lname
  And Enter Password "aka69696" as pass
   And Enter Confirm Password "aka69696" as cpass
   And Enter your gender 
  And Enter "aakaswmith@rediff.com" as email
   And Enter 9410666088 as your Mobile number
   And Enter "02/29/2000" as your DOB
   And Enter "23-A california road,Punjab" as your address
   And Enter "Toronto" in Answer
    Then Register
  

 