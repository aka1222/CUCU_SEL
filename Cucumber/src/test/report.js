$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/mahPackage/basic.feature");
formatter.feature({
  "name": "basic feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "saun and luca are within range",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "saun is 20Km away from luca",
  "keyword": "Given "
});
formatter.match({
  "location": "basicJava.saun_is_Km_away_from_luca(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saun shouts \"Dont Run\"",
  "keyword": "When "
});
formatter.match({
  "location": "basicJava.saun_shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "luca listens to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "basicJava.luca_listens_to_the_message()"
});
formatter.result({
  "status": "passed"
});
});