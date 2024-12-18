@regression
Feature: DeskTop Menu Test

  Background: I am on homepage

  @smoke
  Scenario: Verify Product Arrange In AlphaBatical Order
    When I mouse hover and click on desktop link
    And I click on show all desktops link
    And I Select Sort By position Name (Z to A)
    Then I Verify the Product will arrange in Descending order.

  @sanity
  Scenario Outline: Verify product added to shopping cart successfully
    When I mouse hover and click on currency dropdown and pound sterling
    And I mouse hover and click on desktop link
    And I click on show all desktops link
    And I Select Sort By position Name (A to Z)
    And I select "<product>"
    Then Verify text "<product>"
    And I enter qty "1"
    And I click on add to cart button
    Then Verify the Message Success: You have added "<product>" to your shopping cart!
    And I click on link shopping cart into message
    Then Verify Shopping cart text "Shopping Cart"
    Then Verify the Product name "<product>"
    Then Verify the Model "<model>"
    Then Verify the Total "<price>"
    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | Product 11 | £75.46  |
      | iPod Classic | Product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |