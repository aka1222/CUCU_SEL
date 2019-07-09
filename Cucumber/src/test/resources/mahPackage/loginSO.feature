#Feature: Login Feature for demoshop
#Scenario Outline: Valid Login Scenario
#//Given url of demosite "http://demowebshop.tricentis.com/login"
#//When user enters "<username>" as username
#//And user enters "<password>" as password
#//Then user is in webshop as "<type>"
#Examples: 
|username          | password | type  |
|askmail@email.com  | abc123   | admin |
|askmail@fmail.com  | abc123   | guest |
|askmail@gmail.com  | abc123   | vendor|

#Scenario: Data Table example
Given Admin of the test me app enters
|electronics |head phones |1|
|apparels    |sweat shirt |2|
|electronics |USB         |2| 


