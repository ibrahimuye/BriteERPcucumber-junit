@BRIT-558
Feature: Inventory manager should be able to delete existing Inventory Adjustment

  Background: login and going to the inventory adjustment main page

    Given manager is on the login page
    When the manager logs in using "inm6@info.com" and "trt332qWW13"
    Then the title should be Odoo
    When the manager clicks on the inventory link
    Then the title should be Inventory
    Then the user is already on the inventory page
    When the manager clicks on the inventory Adjustment link
    Then verify page title contains Inventory Adjustments



  Scenario: Deleting existing Inventory Adjustment

    When the manager enters For delete test final item to search box
    And the manager presses enter
    Then verify the item is displayed in the first place
    When the manager clicks on For delete test final item from the list
    And the manager clicks on Action dropdown menu
    And the manager selects Delete from dropdown menu
    And the manager clicks on Ok button in the pop up window
    When the manager clicks on create button
    And the manager enters For delete test final to the inventory reference name box
    Then verify all products radio button is selected
    And the manager enters 02/12/2019 on the Force Accounting Date box
    And the manager clicks on the save button
    Then verify the inventory reference name header is For delete test final