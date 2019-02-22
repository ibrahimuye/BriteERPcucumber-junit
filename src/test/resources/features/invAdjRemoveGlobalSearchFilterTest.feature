@BRIT-926
Feature: Inventory manager should not be able to remove a global search filter

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Removing a global search filter

    And the manager clicks on Advance Search button if it is displayed
    And the manager clicks on Favorites dropdown menu
    And the manager clicks on Delete global search filter
    And the manager clicks on OK button
    Then verify the error message is displayed
