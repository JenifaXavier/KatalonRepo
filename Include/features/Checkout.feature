@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: To checkout item as guest user
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart 
    Then view the cart
    Then assert if the item name and price are correct
    Then select to checkout
    Then select as checkout as <user>
    Then enter the guest details for checkout
    Then confirm order

    Examples: 
      | website  | menu | user  |item|
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   feature   | guest |earphones|
      
	Scenario Outline: To checkout item as signed in user
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
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   feature   | JenifaXavier |earphones|
      
      
	 Scenario Outline: To validate continue shopping feature
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart 
    Then click on continue shopping
    Then add more item
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
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   feature   | JenifaXavier |earphones|
      
      
      Scenario Outline: To validate the shipping charges waive off feature
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart 
    #Then click on continue shopping
    #Then add more item
    #Then add the item to the cart
    Then view the cart
    Then assert if the item name and price are correct
    Then assert if the price is above the range to waive shipping
    Then select to checkout 
    Then Selects as checkout as <user>
    Then enter the credentials
    Then enter the user details for checkout
    Then confirm order

    Examples: 
      | website  | menu | user  |item|
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   footwear   | JenifaXavier |shoe|
      
      
   
      
      @tag1
    Scenario Outline: To validate the wrong credentials entered
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart 
    Then view the cart
    Then select to checkout 
    Then Selects as checkout as <user>
    Then enter the wrong <user>
    Then validate if the authentication fails
    #Then enter the user details for checkout
    Then confirm order

    Examples: 
      | website  | menu | user  |item|
      | http://d2z0ae8zpwnvki.cloudfront.net/ |   footwear   | JenifaXavier123 |shoe| 
      
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
      
  Scenario Outline: To validate the rating functionality
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then add the item to the cart
    Then validate the rating feature for <number> stars

    Examples: 
      | website                               | menu     | user         | item | number |
      | http://d2z0ae8zpwnvki.cloudfront.net/ | footwear | JenifaXavier | shoe |     3 |
      
    Scenario Outline: To validate recommendations
    Given Login to the <website>
    When click on the <menu> menu
    Then click on the <item> icon
    Then validate if the remaining products are shown in recommendations
    
    Examples: 
      | website                               | menu     | user         | item | number |
      | http://d2z0ae8zpwnvki.cloudfront.net/ | footwear | JenifaXavier | shoe |     3 |
      
      
   Scenario Outline: To validate search functionality
    Given Login to the <website>
    When key in a value in the search field
    Then validate if the appropriate results are returned
    
    
    Examples: 
      | website                               | menu     | user         | item | number |
      | http://d2z0ae8zpwnvki.cloudfront.net/ | footwear | JenifaXavier | shoe |     3 |
      
      
      

      
      