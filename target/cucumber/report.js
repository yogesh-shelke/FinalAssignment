$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature1Test.feature");
formatter.feature({
  "line": 1,
  "name": "Orange application scenarios",
  "description": "",
  "id": "orange-application-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14481520700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login to application_july",
  "description": "",
  "id": "orange-application-scenarios;login-to-application-july",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@loginflowimplemenataion"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Login_to_HR_Application",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Reached_to_landingpage",
  "rows": [
    {
      "cells": [
        "OrangeHRM"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition_OrangeHRM_Login.login_to_hr_application(DataTable)"
});
formatter.result({
  "duration": 6280357899,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition_OrangeHRM_Login.reached_to_landingpage(DataTable)"
});
formatter.result({
  "duration": 80814300,
  "status": "passed"
});
formatter.after({
  "duration": 7047610001,
  "status": "passed"
});
});