@regression
Feature: Top menu Feature

  Background: I am On homepage

  @smoke
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    When I mouse hover and click on desktop link
    And I click on show all desktops link
    Then I Verify Desktops text

  @sanity
  Scenario: Verify user should navigate to laptops and notebooks page successfully
    When I mouse hover and click on laptops and notebooks link
    And I click on Show all laptops and notebooks link
    Then I Verify Laptops & Notebooks text


  Scenario: Verify user should navigate to components page successfully
    When I mouse hover and click on components link
    And I click on Show all components link
    Then I Verify Components text