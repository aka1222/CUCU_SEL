$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/mahPackage/loginSO.feature");
formatter.feature({
  "name": "Login Feature for demoshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login Scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url of demosite \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "name": "user is in webshop as \"\u003ctype\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "type"
      ]
    },
    {
      "cells": [
        "askmail@email.com",
        "abc123",
        "admin"
      ]
    },
    {
      "cells": [
        "askmail@fmail.com",
        "abc123",
        "guest"
      ]
    },
    {
      "cells": [
        "askmail@gmail.com",
        "abc123",
        "vendor"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login Scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url of demosite \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginCucu.url_of_demosite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"askmail@email.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "loginCucu.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "loginCucu.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in webshop as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginCucu.user_is_in_webshop(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login Scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url of demosite \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginCucu.url_of_demosite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"askmail@fmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "loginCucu.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "loginCucu.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in webshop as \"guest\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginCucu.user_is_in_webshop(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login Scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "url of demosite \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginCucu.url_of_demosite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"askmail@gmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "loginCucu.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "loginCucu.user_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in webshop as \"vendor\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginCucu.user_is_in_webshop(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Data Table example",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Admin of the test me app enters",
  "rows": [
    {
      "cells": [
        "electronics",
        "head phones",
        "1"
      ]
    },
    {
      "cells": [
        "apparels",
        "sweat shirt",
        "2"
      ]
    },
    {
      "cells": [
        "electronics",
        "USB",
        "2"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "loginCucu.admin_of_the_test_me_app_enters(DataTable)"
});
formatter.result({
  "status": "passed"
});
});