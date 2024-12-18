@regression
Feature: LapTops And NoteBooks Feature

  Background: I am On homepage

@smoke
  Scenario: Verify products price display high to low successfully

    When I mouse hover and click on laptops and notebooks link
    And I click on Show all laptops and notebooks link
    And I select Sort By position Price (High > Low)
    Then Verify the product arrange in high to low order

@sanity
  Scenario: Verify that user place order successfully

    When I mouse hover and click on laptops and notebooks link
    And I click on Show all laptops and notebooks link
    And I select Sort By position Price (High > Low)
    And I select "HP LP3065"
    Then Verify text "HP LP3065"
    And I click on add to cart button
    Then Verify the Message Success: You have added "HP LP3065" to your shopping cart!
    And I click on link shopping cart into message
    Then Verify Shopping cart text "Shopping Cart"
    Then Verify the Product name "HP LP3065"
    And I change qty to "2"
    And I click on update qty button
    Then Verify the Message Success: You have modified your shopping cart!
    Then Verify the Total "$244.00"
    And I click on checkout button
    Then Verify "New Customer" heading
    And I click on guest checkout radio
    And I click on continue button
    And I fill billing form details; "Prime","Testing","p123@gmail.com","07833662976","44, Region street", "London", "B44JUH", "Afghanistan","Farah"
    And I click on del method continue btn
    And I click on agree terms checkbox
    And I click on payment method continue btn