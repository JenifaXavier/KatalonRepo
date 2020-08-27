$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("H:/Jenifa/Katalon/ECommerce/Include/features/Shopping.feature");
formatter.feature({
  "name": "Titl e of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the shipping charges waive off feature",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Login to the \u003cwebsite\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "click on the \u003cmenu\u003e menu",
  "keyword": "When "
});
formatter.step({
  "name": "click on the \u003citem\u003e icon",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "website",
        "menu",
        "user",
        "item"
      ]
    },
    {
      "cells": [
        "http://d2z0ae8zpwnvki.cloudfront.net/",
        "footwear",
        "JenifaXavier",
        "shoe"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the shipping charges waive off feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Login to the http://d2z0ae8zpwnvki.cloudfront.net/",
  "keyword": "Given "
});
formatter.match({
  "location": "checkout.I_want_to_write_a_step_with_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the footwear menu",
  "keyword": "When "
});
formatter.match({
  "location": "checkout.I_check_for_the_value_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the shoe icon",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.Click_shoe(String)"
});
formatter.result({
  "status": "passed"
});
});