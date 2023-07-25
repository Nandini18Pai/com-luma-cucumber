@Regression
Feature: WomenPage Test


  @smoke
  Scenario: I should verify The Product Sort By ProductName Filter
    Given I am on homepage
    When I Mouse Hover on Women Menu
    And  I Mouse Hover on Tops
    And  I click on Jackets
    And  I select Sort By filter "Product Name"
    Then I should able to see the products name display in alphabetical order


  @sanity
  Scenario: I should verify The Product Sort By Price Filter
    Given I am on homepage
    When I Mouse Hover on Women Menu
    And  I Mouse Hover on Tops
    And  I click on Jackets
    And  I selected sort By filter "Price"
    Then I should able to see the products price display in Low to High









































