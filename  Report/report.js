$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Fbreg.feature");
formatter.feature({
  "name": "To creat the Fb account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To launch the browser and maximum",
  "keyword": "Given "
});
formatter.match({
  "location": "FbRegistration.toLaunchTheBrowserAndMaximum()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To creat a new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Somke"
    }
  ]
});
formatter.step({
  "name": "To launch the Fb url in browser",
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.toLaunchTheFbUrlInBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Sign up for Facebook button",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.toClickTheSignUpForFacebookButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the fristname in fristname box",
  "rows": [
    {
      "cells": [
        "Selenium",
        "python",
        "java",
        "sql"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.toPassTheFristnameInFristnameBox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the second name in secondname box",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.toPassTheSecondNameInSecondnameBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the email in email or phoneno box",
  "rows": [
    {
      "cells": [
        "praveen",
        "deepi",
        "kavi",
        "dhaya"
      ]
    },
    {
      "cells": [
        "kumar.com",
        "12345",
        "32145",
        "9999999"
      ]
    },
    {
      "cells": [
        "praveen.s",
        "ragu.com",
        "veera.com",
        "pandi.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.toPassTheEmailInEmailOrPhonenoBox(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the password in Password box",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.toPassThePasswordInPasswordBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbRegistration.userCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});