$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("H:/Jenifa/Katalon/ECommerce/Include/features/Checkout.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To checkout item as guest user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
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
formatter.step({
  "name": "add the item to the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "view the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "assert if the item name and price are correct",
  "keyword": "Then "
});
formatter.step({
  "name": "select to checkout",
  "keyword": "Then "
});
formatter.step({
  "name": "select as checkout as \u003cuser\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the guest details for checkout",
  "keyword": "Then "
});
formatter.step({
  "name": "confirm order",
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
        "feature",
        "guest",
        "earphones"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To checkout item as guest user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
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
  "name": "click on the feature menu",
  "keyword": "When "
});
formatter.match({
  "location": "checkout.I_check_for_the_value_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the earphones icon",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.Click_shoe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add the item to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.Dd_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "view the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.View_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "assert if the item name and price are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.assertname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.Select_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select as checkout as guest",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.Guest_chekcout(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the guest details for checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.guest_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirm order",
  "keyword": "Then "
});
formatter.match({
  "location": "checkout.I_verify_the_status_in_step()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To checkout item as signed in user",
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
formatter.step({
  "name": "add the item to the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "view the cart",
  "keyword": "Then "
});
formatter.step({
  "name": "assert if the item name and price are correct",
  "keyword": "Then "
});
formatter.step({
  "name": "select to checkout",
  "keyword": "Then "
});
formatter.step({
  "name": "Selects as checkout as \u003cuser\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the credentials",
  "keyword": "Then "
});
formatter.step({
  "name": "enter the user details for checkout",
  "keyword": "Then "
});
formatter.step({
  "name": "confirm order",
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
        "feature",
        "JenifaXavier",
        "earphones"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To checkout item as signed in user",
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
