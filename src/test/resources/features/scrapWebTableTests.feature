@regression
Feature: As an inventory user I should be able to sort the scrap web table according to any column header

  Background: login and going to the scrap page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    Then user clicks on the scrap link
    When the user is on the scrap page


  @BRIT-4123
  Scenario Outline: As an inventory user I should be able to sort scrap web data according to "Reference"

    When user verifies that the scrap web table is sorted according to reference column in the descending order
    Then user verifies that the scrap web table can be sorted according to "<column name>" column in the ascending order
    And user logs out

    Examples:
      | column name |
      | Create Date   |
      | Product       |
      | Quantity      |
      | Status        |