Feature: TestMeApp
Scenario Outline: LogIn to TestMeApp
Given Open LogIn Page "http://10.232.237.143:443/TestMeApp/login.htm" 
When Give "<username>" as user name
And Give "<pass>" as password
Then Hit on Login
Examples:
|username | pass     |
|aka007   | asdf1234 |

