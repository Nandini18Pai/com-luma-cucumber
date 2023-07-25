@Regression
Feature: GearPage Test

  @smoke
  Scenario: I should Add Product SuccessFully To Shopping Cart()

    Given I am on homepage
    When I Mouse Hover on Gear Menu
    And  I click on Bags
    And  I click  on product name Overnight Duffle.
    And  I should able to see text "Overnight Duffle".
    And  I change quantity to "3"
    And  I click on Add To Cart Button.
    And  I Should able to verify the text "You added Overnight Duffle to your shopping cart."
    And  I Click on the shopping cart link into  message.
    And  I Should able to verify the Bag text "Overnight Duffle".
    And  I Should able to verify quantity is "3"
    And  I Should able to verify product price is "$135.00"
    And  I change the quantity to "5"
    And  I click on the update shopping cart button.
    Then I Should able to verify the total price of product  "$225.00".
















































