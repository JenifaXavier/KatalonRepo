@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario outline
    Given Login to the <website>
    #When click on the <menu> menu
    #Then click on the <item> icon
    #Then add the item to the cart 
    #Then view the cart
    #Then assert if the item name and price are correct
    #Then select to checkout
    #Then select as checkout as <user>
    #Then enter the guest details for checkout
    #Then confirm order

    Examples: 
      | website  | menu | user  |item|
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   feature   | guest |shoe|
      
	Scenario Outline: Title of your scenario outline
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart 
    Then view the cart
    Then assert if the item name and price are correct
    Then select to checkout 
    Then Selects as checkout as <user>
    Then enter the credentials
    Then enter the user details for checkout
    Then confirm order

    Examples: 
      | website  | menu | user  |item|
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   feature   | JenifaXavier |shoe|
      
      
      