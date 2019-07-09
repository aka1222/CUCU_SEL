Feature: Go to TestMeApp

  Scenario Outline: Log in to TestMeApp
    Given Open Link "http://10.232.237.143:443/TestMeApp/login.htm"
    When Please Enter "<username>" as Username
    And Please Enter "<pass>" as Password
    Then Hit Login button

    Examples: 
      | username | pass     | 
      | akash69 | aka69696 |
      
C:\Users\a07208trng_b4a.04.26\AppData\Local\Programs\Git