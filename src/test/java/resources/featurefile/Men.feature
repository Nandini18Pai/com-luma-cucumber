@Regression
Feature: MenPage Test


  @smoke
  Scenario: I should Add Product SuccessFully To Shopping Cart()

    Given I am on homepage
    When I Mouse Hover on Men Menu
    And  I Mouse Hover on Bottoms
    And  I click on Pants
    And  I Mouse Hover on product name Cronus Yoga Pant’
    And  I click on size.
    And  I click on colour Black
    And  I click on Add To Cart Button
    And  I Should verify the text "You added Cronus Yoga Pant to your shopping cart."
    And  I Click on shopping cart link into  message.
    And  I Should able to verify the text "Shopping Cart".
    And  I Should able to verify the product name "Cronus Yoga Pant"
    And  I Should able to verify the product size "32".
    Then I Should able to verify the product colour "Black".
















































