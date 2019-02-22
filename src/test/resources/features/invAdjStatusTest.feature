@BRIT-884
Feature: Inventory manager should be able to see the status of Inventory Adjustment

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: See the status of Inventory Adjustment

    When the manager enters "For status test" in the search box
    And the manager presses enter
    When the manager clicks on For status test item
    Then verify the status of the item is Draft
    And the manager clicks on the edit button
    And the manager selects Select products manually option
    And the manager clicks on start inventory button
    Then verify the status of the item is In Progress
    And the manager clicks on start Validate button
    Then verify the status of the item is Validated
