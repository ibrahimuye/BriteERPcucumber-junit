@BRIT-535
Feature: Inventory manager should be able to edit existing Inventory Adjustment

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Editing existing Inventory Adjustment

    And the manager enters Inventory Transfer to search box
    When the manager presses enter
    Then verify the item is displayed in the first place
    When the manager clicks on the first Inventory Transfer item from the list
    And the manager clicks on the edit button
    And the manager enters Inventory Transfer List to the inventory reference name box
    And the manager clicks on the save button
    Then verify the Inventory Transfer List appears in the header
    And the manager clicks on the edit button
    And the manager enters Inventory Transfer to the inventory reference name box
    And the manager clicks on the save button
