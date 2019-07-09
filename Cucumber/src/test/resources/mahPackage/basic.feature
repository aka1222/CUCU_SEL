Feature: basic feature 

@tag1
Scenario: saun and luca are within range
Given saun is 2Km away from luca
When saun shouts "Dont Run"
Then luca listens to the message

@tag2
 Scenario: saun and luca are not in range
  Given saun is 200Km away from luca
  When saun shouts "Dont Run"
  Then luca cannot listen to the message