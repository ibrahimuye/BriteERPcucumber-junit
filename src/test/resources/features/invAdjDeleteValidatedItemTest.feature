@BRIT-566
Feature: Inventory manager should not be able to delete a validated Inventory Adjustment

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Deleting a validated Inventory Adjustment

    When the manager enters For Validation Test into search box
    And the manager presses enter
    Then verify For Validation Test item is displayed in the first place
    When the manager clicks on For Validation Test item from the list
    And the manager clicks on Action dropdown menu
    And the manager selects Delete from dropdown menu
    And the manager clicks on Ok button in the pop up window
    Then verify the error message "You cannot delete a validated inventory adjustement." is displayed