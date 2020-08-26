@tag
Feature: Titl e of your feature
  I want to use this template for my feature file

  Scenario Outline: To validate the increase in quantity of products
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart
    #Then click on continue shopping
    #Then add more item
    #Then add the item to the cart99+
    Then view the cart
    Then increase the quantity <times>
    Then assert if the price increases accordingly
    #Then assert if the item name and price are correct
    #Then assert if the price is above the range to waive shipping
    Then select to checkout
    Then Selects as checkout as <user>
    Then enter the credentials
    Then enter the user details for checkout
    Then confirm order

    Examples: 
      | website                               | menu     | user         | item | times |
      | http://d2z0ae8zpwnvki.cloudfront.net/ | footwear | JenifaXavier | shoe |     6 |
