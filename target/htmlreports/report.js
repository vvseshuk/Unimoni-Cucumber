$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFirst.feature");
formatter.feature({
  "line": 2,
  "name": "Login feautre",
  "description": "The online demo banking site - we want to cover scenarios",
  "id": "login-feautre",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 14,
  "name": "Negative login scenario",
  "description": "",
  "id": "login-feautre;negative-login-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is at login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User enters login name as \"mngr\" and password as \"ap\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should not be allowed to login",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user should not see home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginFeautreGlues.user_is_at_login_page()"
});
formatter.result({
  "duration": 8557180700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr",
      "offset": 27
    },
    {
      "val": "ap",
      "offset": 50
    }
  ],
  "location": "LoginFeautreGlues.user_enters_login_name_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 97182100,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeautreGlues.clicks_on_login_button()"
});
formatter.result({
  "duration": 465495500,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeautreGlues.user_should_not_be_allowed_to_login()"
});
formatter.result({
  "duration": 68900100,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeautreGlues.user_should_not_see_home_page()"
});
formatter.result({
  "duration": 4657509600,
  "status": "passed"
});
formatter.uri("objects.feature");
formatter.feature({
  "line": 2,
  "name": "Feature to explain the objects as data tables",
  "description": "I want to use this template for my feature with objects",
  "id": "feature-to-explain-the-objects-as-data-tables",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Negative login scenario",
  "description": "",
  "id": "feature-to-explain-the-objects-as-data-tables;negative-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is at shopping cart site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicked on sign-in",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters already registered login details",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "abc@gmail.com",
        "1234a"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on sign-in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should not sign-in",
  "keyword": "Then "
});
formatter.match({
  "location": "ObjectGlue.user_is_at_shopping_cart_site()"
});
formatter.result({
  "duration": 10532108100,
  "status": "passed"
});
formatter.match({
  "location": "ObjectGlue.user_clicked_on_sign_in()"
});
formatter.result({
  "duration": 2429794700,
  "status": "passed"
});
formatter.match({
  "location": "ObjectGlue.user_enters_already_registered_login_details(SignIn\u003e)"
});
formatter.result({
  "duration": 109541300,
  "status": "passed"
});
formatter.match({
  "location": "ObjectGlue.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 1411132400,
  "status": "passed"
});
formatter.match({
  "location": "ObjectGlue.user_should_not_sign_in()"
});
formatter.result({
  "duration": 2839141400,
  "status": "passed"
});
});