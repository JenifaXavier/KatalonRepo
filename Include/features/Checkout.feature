#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given Login to the <website>
    When click on the <feature> menu
    Then click on the <footwear> icon
    Then add the item to the cart 
    Then view the cart
    Then assert if the item name and price are correct
    Then select to checkout
    Then select as checkout as guest
    Then enter the guest details for checkout
    Then confirm order

    Examples: 
      | name  | value | status  |
      | website |     http://d2z0ae8zpwnvki.cloudfront.net/ | success |
      | menu |     feature | Fail    |
      | item |     shoe | Fail    |
      
      
      